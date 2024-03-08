package net.phazoganon.mcprogressionupdate.loot.modifiers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.items.ItemHandlerHelper;
import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

public class FirestoneToolModifier extends LootModifier {
    public static final Codec<FirestoneToolModifier> CODEC =
            RecordCodecBuilder.create(inst -> LootModifier.codecStart(inst).apply(inst, FirestoneToolModifier::new));
    public FirestoneToolModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }
    protected @NotNull ObjectArrayList<ItemStack> doApply(@NotNull ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        List<Pair<ItemStack, Float>> list = generatedLoot.stream().map(stack ->
                context.getLevel().getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer(stack), context.getLevel())
                        .map(holder -> {
                            ItemStack result = holder.value().getResultItem(context.getLevel().registryAccess());
                            return Pair.of(ItemHandlerHelper.copyStackWithSize(result, stack.getCount() * result.getCount()), holder.value().getExperience());
                        })
                        .filter(pair -> !pair.getLeft().isEmpty())
                        .orElse(Pair.of(stack, 0.0F))).toList();
        float xp = (float) list.stream().mapToDouble(Pair::getRight).sum();
        if (xp > 0.0F && context.hasParam(LootContextParams.THIS_ENTITY)) {
            ExperienceOrb.award(context.getLevel(), context.getParam(LootContextParams.THIS_ENTITY).position(), Math.round(xp));
        }
        return list.stream().map(Pair::getLeft).collect(Collectors.toCollection(ObjectArrayList::new));
    }
    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return FirestoneToolModifier.CODEC;
    }
}
