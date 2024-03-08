package net.phazoganon.mcprogressionupdate.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.phazoganon.mcprogressionupdate.item.ModItems;
import net.phazoganon.mcprogressionupdate.loot.modifiers.FirestoneToolModifier;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, minecraft_progression_update.MOD_ID);
    }
    @Override
    protected void start() {
        add("firestone_sword_smelt", new FirestoneToolModifier(new LootItemCondition[]{
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(ModItems.FIRESTONE_SWORD.get())).build()
        }));
        add("firestone_pickaxe_smelt", new FirestoneToolModifier(new LootItemCondition[]{
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(ModItems.FIRESTONE_PICKAXE.get())).build()
        }));
        add("firestone_axe_smelt", new FirestoneToolModifier(new LootItemCondition[]{
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(ModItems.FIRESTONE_AXE.get())).build()
        }));
        add("firestone_shovel_smelt", new FirestoneToolModifier(new LootItemCondition[]{
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(ModItems.FIRESTONE_SHOVEL.get())).build()
        }));
        add("firestone_hoe_smelt", new FirestoneToolModifier(new LootItemCondition[]{
                MatchTool.toolMatches(ItemPredicate.Builder.item().of(ModItems.FIRESTONE_HOE.get())).build()
        }));
    }
}
