package net.phazoganon.mcprogressionupdate.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.phazoganon.mcprogressionupdate.block.ModBlocks;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, minecraft_progression_update.MOD_ID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.FROSTBITTEN_BRICKS);
        blockWithItem(ModBlocks.CHISELED_FROSTBITTEN_BRICKS);
        blockWithItem(ModBlocks.FIRESTONE_ORE);
        stairsBlock((StairBlock) ModBlocks.FROSTBITTEN_BRICK_STAIRS.get(), blockTexture(ModBlocks.FROSTBITTEN_BRICKS.get()));
        slabBlock((SlabBlock) ModBlocks.FROSTBITTEN_BRICK_SLAB.get(), blockTexture(ModBlocks.FROSTBITTEN_BRICKS.get()), blockTexture(ModBlocks.FROSTBITTEN_BRICKS.get()));
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
