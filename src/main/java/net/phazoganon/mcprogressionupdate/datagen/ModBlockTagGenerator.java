package net.phazoganon.mcprogressionupdate.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.phazoganon.mcprogressionupdate.block.ModBlocks;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;
import net.phazoganon.mcprogressionupdate.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, minecraft_progression_update.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.SOULBOUNDED_FIRE_BASE_BLOCKS).add(Blocks.SOUL_SAND).add(Blocks.SOUL_SOIL);
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.FROSTBITTEN_BRICKS.get(),
                ModBlocks.CHISELED_FROSTBITTEN_BRICKS.get(),
                ModBlocks.FIRESTONE_ORE.get()
        );
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                ModBlocks.FIRESTONE_ORE.get()
        );
        this.tag(BlockTags.FIRE).add(
                ModBlocks.SULFUR_FIRE.get(),
                ModBlocks.SOULBOUNDED_FIRE.get()
        );
        this.tag(BlockTags.RAILS).add(
                ModBlocks.LIGHTNING_RAIL.get()
        );
    }
}
