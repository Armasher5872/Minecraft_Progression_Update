package net.phazoganon.mcprogressionupdate.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phazoganon.mcprogressionupdate.block.ModBlocks;
import net.phazoganon.mcprogressionupdate.item.ModItems;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, minecraft_progression_update.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        simpleItem(ModItems.MAGMATIC_WORM);
        handheldItem(ModItems.FLINT_AND_SOULSTEEL);
        handheldItem(ModItems.SHATTERED_FLINT_AND_SOULSTEEL);
        handheldItem(ModItems.SHATTERED_WOODEN_SWORD);
        handheldItem(ModItems.SHATTERED_STONE_SWORD);
        handheldItem(ModItems.SHATTERED_IRON_SWORD);
        handheldItem(ModItems.SHATTERED_GOLDEN_SWORD);
        handheldItem(ModItems.SHATTERED_DIAMOND_SWORD);
        handheldItem(ModItems.SHATTERED_NETHERITE_SWORD);
        handheldItem(ModItems.SHATTERED_WOODEN_AXE);
        handheldItem(ModItems.SHATTERED_STONE_AXE);
        handheldItem(ModItems.SHATTERED_IRON_AXE);
        handheldItem(ModItems.SHATTERED_GOLDEN_AXE);
        handheldItem(ModItems.SHATTERED_DIAMOND_AXE);
        handheldItem(ModItems.SHATTERED_NETHERITE_AXE);
        handheldItem(ModItems.SHATTERED_WOODEN_HOE);
        handheldItem(ModItems.SHATTERED_STONE_HOE);
        handheldItem(ModItems.SHATTERED_IRON_HOE);
        handheldItem(ModItems.SHATTERED_GOLDEN_HOE);
        handheldItem(ModItems.SHATTERED_DIAMOND_HOE);
        handheldItem(ModItems.SHATTERED_NETHERITE_HOE);
        handheldItem(ModItems.SHATTERED_WOODEN_PICKAXE);
        handheldItem(ModItems.SHATTERED_STONE_PICKAXE);
        handheldItem(ModItems.SHATTERED_IRON_PICKAXE);
        handheldItem(ModItems.SHATTERED_GOLDEN_PICKAXE);
        handheldItem(ModItems.SHATTERED_DIAMOND_PICKAXE);
        handheldItem(ModItems.SHATTERED_NETHERITE_PICKAXE);
        handheldItem(ModItems.SHATTERED_WOODEN_SHOVEL);
        handheldItem(ModItems.SHATTERED_STONE_SHOVEL);
        handheldItem(ModItems.SHATTERED_IRON_SHOVEL);
        handheldItem(ModItems.SHATTERED_GOLDEN_SHOVEL);
        handheldItem(ModItems.SHATTERED_DIAMOND_SHOVEL);
        handheldItem(ModItems.SHATTERED_NETHERITE_SHOVEL);
        handheldItem(ModItems.SHATTERED_BRUSH);
        handheldItem(ModItems.SHATTERED_FLINT_AND_STEEL);
        handheldItem(ModItems.SHATTERED_FISHING_ROD);
        handheldItem(ModItems.SHATTERED_SHEARS);
        simpleItem(ModItems.SHATTERED_LEATHER_CAP);
        simpleItem(ModItems.SHATTERED_CHAINMAIL_HELMET);
        simpleItem(ModItems.SHATTERED_IRON_HELMET);
        simpleItem(ModItems.SHATTERED_GOLDEN_HELMET);
        simpleItem(ModItems.SHATTERED_DIAMOND_HELMET);
        simpleItem(ModItems.SHATTERED_NETHERITE_HELMET);
        simpleItem(ModItems.SHATTERED_LEATHER_TUNIC);
        simpleItem(ModItems.SHATTERED_CHAINMAIL_CHESTPLATE);
        simpleItem(ModItems.SHATTERED_IRON_CHESTPLATE);
        simpleItem(ModItems.SHATTERED_GOLDEN_CHESTPLATE);
        simpleItem(ModItems.SHATTERED_DIAMOND_CHESTPLATE);
        simpleItem(ModItems.SHATTERED_NETHERITE_CHESTPLATE);
        simpleItem(ModItems.SHATTERED_LEATHER_PANTS);
        simpleItem(ModItems.SHATTERED_CHAINMAIL_LEGGINGS);
        simpleItem(ModItems.SHATTERED_IRON_LEGGINGS);
        simpleItem(ModItems.SHATTERED_GOLDEN_LEGGINGS);
        simpleItem(ModItems.SHATTERED_DIAMOND_LEGGINGS);
        simpleItem(ModItems.SHATTERED_NETHERITE_LEGGINGS);
        simpleItem(ModItems.SHATTERED_LEATHER_BOOTS);
        simpleItem(ModItems.SHATTERED_CHAINMAIL_BOOTS);
        simpleItem(ModItems.SHATTERED_IRON_BOOTS);
        simpleItem(ModItems.SHATTERED_GOLDEN_BOOTS);
        simpleItem(ModItems.SHATTERED_DIAMOND_BOOTS);
        simpleItem(ModItems.SHATTERED_NETHERITE_BOOTS);
        simpleItem(ModItems.SHATTERED_TURTLE_SHELL);
        handheldItem(ModItems.SHATTERED_BOW);
        handheldItem(ModItems.SHATTERED_CROSSBOW);
        handheldItem(ModItems.MULTIBOW);
        handheldItem(ModItems.SHATTERED_MULTIBOW);
        simpleItem(ModItems.FIRESTONE_SHARDS);
        handheldItem(ModItems.FIRESTONE_SWORD);
        handheldItem(ModItems.FIRESTONE_PICKAXE);
        handheldItem(ModItems.FIRESTONE_AXE);
        handheldItem(ModItems.FIRESTONE_SHOVEL);
        handheldItem(ModItems.FIRESTONE_HOE);
        simpleItem(ModItems.FIRESTONE_HELMET);
        simpleItem(ModItems.FIRESTONE_CHESTPLATE);
        simpleItem(ModItems.FIRESTONE_LEGGINGS);
        simpleItem(ModItems.FIRESTONE_BOOTS);
        evenSimplerBlockItem(ModBlocks.FROSTBITTEN_BRICK_SLAB);
        evenSimplerBlockItem(ModBlocks.FROSTBITTEN_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHTNING_RAIL);
        withExistingParent(ModItems.TURKEY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.GREAT_WHITE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        simpleItem(ModItems.RAW_TURKEY);
        simpleItem(ModItems.COOKED_TURKEY);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(minecraft_progression_update.MOD_ID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(minecraft_progression_update.MOD_ID, "item/" + item.getId().getPath()));
    }
    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(minecraft_progression_update.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
}
