package net.phazoganon.mcprogressionupdate.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;
import net.phazoganon.mcprogressionupdate.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier FIRESTONE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 600, 7.0f, 2.0f, 15,
                    ModTags.Blocks.NEEDS_FIRESTONE_TOOL, () -> Ingredient.of(ModItems.FIRESTONE_SHARDS.get())),
            new ResourceLocation(minecraft_progression_update.MOD_ID, "firestone_shards"), List.of(Tiers.IRON), List.of());
}
