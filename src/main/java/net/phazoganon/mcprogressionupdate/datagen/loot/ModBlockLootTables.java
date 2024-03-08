package net.phazoganon.mcprogressionupdate.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.phazoganon.mcprogressionupdate.block.ModBlocks;
import net.phazoganon.mcprogressionupdate.item.ModItems;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }
    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.FROSTBITTEN_BRICKS.get());
        this.add(ModBlocks.FROSTBITTEN_BRICK_SLAB.get(), block -> createSlabItemTable(ModBlocks.FROSTBITTEN_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.FROSTBITTEN_BRICK_STAIRS.get());
        this.dropSelf(ModBlocks.CHISELED_FROSTBITTEN_BRICKS.get());
        this.dropSelf(ModBlocks.LIGHTNING_RAIL.get());
        this.add(ModBlocks.FIRESTONE_ORE.get(), block -> createCopperLikeOreDrops(ModBlocks.FIRESTONE_ORE.get(), ModItems.FIRESTONE_SHARDS.get()));
    }
    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0f, 5.0f)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                )
        );
    }
    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
