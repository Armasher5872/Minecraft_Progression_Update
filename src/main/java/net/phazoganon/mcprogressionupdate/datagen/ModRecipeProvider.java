package net.phazoganon.mcprogressionupdate.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.phazoganon.mcprogressionupdate.block.ModBlocks;
import net.phazoganon.mcprogressionupdate.item.ModItems;
import java.util.List;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> FIRESTONE_SMELTABLES = List.of(ModItems.FIRESTONE_SHARDS.get(), ModBlocks.FIRESTONE_ORE.get());
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }
    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE)
                .pattern("SSS")
                .pattern("S@S")
                .pattern("SSS")
                .define('S', Items.GOLD_BLOCK)
                .define('@', Items.APPLE)
                .unlockedBy(getHasName(Items.GOLD_BLOCK), has(Items.APPLE))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FIRESTONE_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("@")
                .define('S', ModItems.FIRESTONE_SHARDS.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.FIRESTONE_SHARDS.get()), has(Items.STICK))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FIRESTONE_AXE.get())
                .pattern("SS")
                .pattern("S@")
                .pattern(" @")
                .define('S', ModItems.FIRESTONE_SHARDS.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.FIRESTONE_SHARDS.get()), has(Items.STICK))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FIRESTONE_PICKAXE.get())
                .pattern("SSS")
                .pattern(" @ ")
                .pattern(" @ ")
                .define('S', ModItems.FIRESTONE_SHARDS.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.FIRESTONE_SHARDS.get()), has(Items.STICK))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FIRESTONE_SHOVEL.get())
                .pattern("S")
                .pattern("@")
                .pattern("@")
                .define('S', ModItems.FIRESTONE_SHARDS.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.FIRESTONE_SHARDS.get()), has(Items.STICK))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FIRESTONE_HOE.get())
                .pattern("SS")
                .pattern(" @")
                .pattern(" @")
                .define('S', ModItems.FIRESTONE_SHARDS.get())
                .define('@', Items.STICK)
                .unlockedBy(getHasName(ModItems.FIRESTONE_SHARDS.get()), has(Items.STICK))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FIRESTONE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .define('S', ModItems.FIRESTONE_SHARDS.get())
                .unlockedBy(getHasName(ModItems.FIRESTONE_SHARDS.get()), has(ModItems.FIRESTONE_SHARDS.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FIRESTONE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.FIRESTONE_SHARDS.get())
                .unlockedBy(getHasName(ModItems.FIRESTONE_SHARDS.get()), has(ModItems.FIRESTONE_SHARDS.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FIRESTONE_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.FIRESTONE_SHARDS.get())
                .unlockedBy(getHasName(ModItems.FIRESTONE_SHARDS.get()), has(ModItems.FIRESTONE_SHARDS.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.FIRESTONE_BOOTS.get())
                .pattern("S S")
                .pattern("S S")
                .define('S', ModItems.FIRESTONE_SHARDS.get())
                .unlockedBy(getHasName(ModItems.FIRESTONE_SHARDS.get()), has(ModItems.FIRESTONE_SHARDS.get()))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.FLINT_AND_SOULSTEEL.get())
                .pattern("SSS")
                .pattern("S@S")
                .pattern("SSS")
                .define('S', ModItems.MAGMATIC_WORM.get())
                .define('@', Items.FLINT_AND_STEEL)
                .unlockedBy(getHasName(ModItems.MAGMATIC_WORM.get()), has(Items.FLINT_AND_STEEL))
                .save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, ModBlocks.LIGHTNING_RAIL.get())
                .pattern("S S")
                .pattern("S@S")
                .pattern("S S")
                .define('S', Items.COPPER_INGOT)
                .define('@', Items.POWERED_RAIL)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.POWERED_RAIL))
                .save(pRecipeOutput);
        oreSmelting(pRecipeOutput, FIRESTONE_SMELTABLES, RecipeCategory.MISC, ModItems.FIRESTONE_SHARDS.get(), 0.25f, 100, "firestone_shards");
        oreBlasting(pRecipeOutput, FIRESTONE_SMELTABLES, RecipeCategory.MISC, ModItems.FIRESTONE_SHARDS.get(), 0.25f, 50, "firestone_shards");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RAW_TURKEY.get()), RecipeCategory.FOOD, ModItems.COOKED_TURKEY.get(), 0.35f, 200)
                .unlockedBy(getHasName(ModItems.RAW_TURKEY.get()), has(ModItems.RAW_TURKEY.get()))
                .save(pRecipeOutput, ModItems.COOKED_TURKEY.getId());;
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.RAW_TURKEY.get()), RecipeCategory.FOOD, ModItems.COOKED_TURKEY.get(), 0.35F, 100)
                .unlockedBy(getHasName(ModItems.RAW_TURKEY.get()), has(ModItems.RAW_TURKEY.get()))
                .save(pRecipeOutput, "mc_progression_update:cooked_turkey_from_smoking");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ModItems.RAW_TURKEY.get()), RecipeCategory.FOOD, ModItems.COOKED_TURKEY.get(), 0.35f, 600)
                .unlockedBy(getHasName(ModItems.RAW_TURKEY.get()), has(ModItems.RAW_TURKEY.get()))
                .save(pRecipeOutput, "mc_progression_update:cooked_turkey_from_campfire_cooking");
    }
}
