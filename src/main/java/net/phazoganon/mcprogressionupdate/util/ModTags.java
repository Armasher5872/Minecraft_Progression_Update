package net.phazoganon.mcprogressionupdate.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SOULBOUNDED_FIRE_BASE_BLOCKS = tag("soulbounded_fire_base_blocks");
        public static final TagKey<Block> NEEDS_FIRESTONE_TOOL = tag("needs_firestone_tool");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(minecraft_progression_update.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(minecraft_progression_update.MOD_ID, name));
        }
    }
}
