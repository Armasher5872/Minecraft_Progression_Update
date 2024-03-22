package net.phazoganon.mcprogressionupdate.item;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phazoganon.mcprogressionupdate.entity.ModEntities;
import net.phazoganon.mcprogressionupdate.food.ModFoods;
import net.phazoganon.mcprogressionupdate.item.custom.FlintAndSoulsteelItem;
import net.phazoganon.mcprogressionupdate.item.custom.ModArmorItem;
import net.phazoganon.mcprogressionupdate.item.custom.modtoolitem.*;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, minecraft_progression_update.MOD_ID);
    public static final RegistryObject<Item> MAGMATIC_WORM = ITEMS.register(
            "magmatic_worm",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> FLINT_AND_SOULSTEEL = ITEMS.register(
            "flint_and_soulsteel",
            () -> new FlintAndSoulsteelItem(new Item.Properties().durability(64))
    );
    public static final RegistryObject<Item> SHATTERED_FLINT_AND_SOULSTEEL = ITEMS.register(
            "shattered_flint_and_soulsteel",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_WOODEN_SWORD = ITEMS.register(
            "shattered_wooden_sword",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_STONE_SWORD = ITEMS.register(
            "shattered_stone_sword",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_IRON_SWORD = ITEMS.register(
            "shattered_iron_sword",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_GOLDEN_SWORD = ITEMS.register(
            "shattered_golden_sword",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_DIAMOND_SWORD = ITEMS.register(
            "shattered_diamond_sword",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_NETHERITE_SWORD = ITEMS.register(
            "shattered_netherite_sword",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_WOODEN_AXE = ITEMS.register(
            "shattered_wooden_axe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_STONE_AXE = ITEMS.register(
            "shattered_stone_axe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_IRON_AXE = ITEMS.register(
            "shattered_iron_axe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_GOLDEN_AXE = ITEMS.register(
            "shattered_golden_axe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_DIAMOND_AXE = ITEMS.register(
            "shattered_diamond_axe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_NETHERITE_AXE = ITEMS.register(
            "shattered_netherite_axe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_WOODEN_HOE = ITEMS.register(
            "shattered_wooden_hoe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_STONE_HOE = ITEMS.register(
            "shattered_stone_hoe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_IRON_HOE = ITEMS.register(
            "shattered_iron_hoe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_GOLDEN_HOE = ITEMS.register(
            "shattered_golden_hoe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_DIAMOND_HOE = ITEMS.register(
            "shattered_diamond_hoe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_NETHERITE_HOE = ITEMS.register(
            "shattered_netherite_hoe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_WOODEN_PICKAXE = ITEMS.register(
            "shattered_wooden_pickaxe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_STONE_PICKAXE = ITEMS.register(
            "shattered_stone_pickaxe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_IRON_PICKAXE = ITEMS.register(
            "shattered_iron_pickaxe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_GOLDEN_PICKAXE = ITEMS.register(
            "shattered_golden_pickaxe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_DIAMOND_PICKAXE = ITEMS.register(
            "shattered_diamond_pickaxe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_NETHERITE_PICKAXE = ITEMS.register(
            "shattered_netherite_pickaxe",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_WOODEN_SHOVEL = ITEMS.register(
            "shattered_wooden_shovel",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_STONE_SHOVEL = ITEMS.register(
            "shattered_stone_shovel",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_IRON_SHOVEL = ITEMS.register(
            "shattered_iron_shovel",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_GOLDEN_SHOVEL = ITEMS.register(
            "shattered_golden_shovel",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_DIAMOND_SHOVEL = ITEMS.register(
            "shattered_diamond_shovel",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_NETHERITE_SHOVEL = ITEMS.register(
            "shattered_netherite_shovel",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_TRIDENT = ITEMS.register(
            "shattered_trident",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_BRUSH = ITEMS.register(
            "shattered_brush",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_FLINT_AND_STEEL = ITEMS.register(
            "shattered_flint_and_steel",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_FISHING_ROD = ITEMS.register(
            "shattered_fishing_rod",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_SHEARS = ITEMS.register(
            "shattered_shears",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_LEATHER_CAP = ITEMS.register(
            "shattered_leather_cap",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_CHAINMAIL_HELMET = ITEMS.register(
            "shattered_chainmail_helmet",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_IRON_HELMET = ITEMS.register(
            "shattered_iron_helmet",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_GOLDEN_HELMET = ITEMS.register(
            "shattered_golden_helmet",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_DIAMOND_HELMET = ITEMS.register(
            "shattered_diamond_helmet",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_NETHERITE_HELMET = ITEMS.register(
            "shattered_netherite_helmet",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_LEATHER_PANTS = ITEMS.register(
            "shattered_leather_pants",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_CHAINMAIL_LEGGINGS = ITEMS.register(
            "shattered_chainmail_leggings",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_IRON_LEGGINGS = ITEMS.register(
            "shattered_iron_leggings",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_GOLDEN_LEGGINGS = ITEMS.register(
            "shattered_golden_leggings",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_DIAMOND_LEGGINGS = ITEMS.register(
            "shattered_diamond_leggings",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_NETHERITE_LEGGINGS = ITEMS.register(
            "shattered_netherite_leggings",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_LEATHER_TUNIC = ITEMS.register(
            "shattered_leather_tunic",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_CHAINMAIL_CHESTPLATE = ITEMS.register(
            "shattered_chainmail_chestplate",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_IRON_CHESTPLATE = ITEMS.register(
            "shattered_iron_chestplate",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_GOLDEN_CHESTPLATE = ITEMS.register(
            "shattered_golden_chestplate",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_DIAMOND_CHESTPLATE = ITEMS.register(
            "shattered_diamond_chestplate",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_NETHERITE_CHESTPLATE = ITEMS.register(
            "shattered_netherite_chestplate",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_LEATHER_BOOTS = ITEMS.register(
            "shattered_leather_boots",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_CHAINMAIL_BOOTS = ITEMS.register(
            "shattered_chainmail_boots",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_IRON_BOOTS = ITEMS.register(
            "shattered_iron_boots",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_GOLDEN_BOOTS = ITEMS.register(
            "shattered_golden_boots",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_DIAMOND_BOOTS = ITEMS.register(
            "shattered_diamond_boots",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_NETHERITE_BOOTS = ITEMS.register(
            "shattered_netherite_boots",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_TURTLE_SHELL = ITEMS.register(
            "shattered_turtle_shell",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_BOW = ITEMS.register(
            "shattered_bow",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_CROSSBOW = ITEMS.register(
            "shattered_crossbow",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> MULTIBOW = ITEMS.register(
            "multibow",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> SHATTERED_MULTIBOW = ITEMS.register(
            "shattered_multibow",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> FIRESTONE_SHARDS = ITEMS.register(
            "firestone_shards",
            () -> new Item(new Item.Properties())
    );
    public static final RegistryObject<Item> FIRESTONE_SWORD = ITEMS.register(
            "firestone_sword",
            () -> new ModSwordItem(ModToolTiers.FIRESTONE, 4, -2.4f, new Item.Properties())
    );
    public static final RegistryObject<Item> FIRESTONE_PICKAXE = ITEMS.register(
            "firestone_pickaxe",
            () -> new ModPickaxeItem(ModToolTiers.FIRESTONE, 2, -2.8f, new Item.Properties())
    );
    public static final RegistryObject<Item> FIRESTONE_AXE = ITEMS.register(
            "firestone_axe",
            () -> new ModAxeItem(ModToolTiers.FIRESTONE, 5, -3.2f, new Item.Properties())
    );
    public static final RegistryObject<Item> FIRESTONE_SHOVEL = ITEMS.register(
            "firestone_shovel",
            () -> new ModShovelItem(ModToolTiers.FIRESTONE, 2, -3.0f, new Item.Properties())
    );
    public static final RegistryObject<Item> FIRESTONE_HOE = ITEMS.register(
            "firestone_hoe",
            () -> new ModHoeItem(ModToolTiers.FIRESTONE, -1, 0.0f, new Item.Properties())
    );
    public static final RegistryObject<Item> FIRESTONE_HELMET = ITEMS.register(
            "firestone_helmet",
            () -> new ModArmorItem(ModArmorMaterials.FIRESTONE, ArmorItem.Type.HELMET, new Item.Properties())
    );
    public static final RegistryObject<Item> FIRESTONE_CHESTPLATE = ITEMS.register(
            "firestone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.FIRESTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    public static final RegistryObject<Item> FIRESTONE_LEGGINGS = ITEMS.register(
            "firestone_leggings",
            () -> new ArmorItem(ModArmorMaterials.FIRESTONE, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    public static final RegistryObject<Item> FIRESTONE_BOOTS = ITEMS.register(
            "firestone_boots",
            () -> new ArmorItem(ModArmorMaterials.FIRESTONE, ArmorItem.Type.BOOTS, new Item.Properties())
    );
    public static final RegistryObject<Item> TURKEY_SPAWN_EGG = ITEMS.register(
            "turkey_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.TURKEY, 0x402e27, 0x34d5eb, new Item.Properties())
    );
    public static final RegistryObject<Item> RAW_TURKEY = ITEMS.register(
            "raw_turkey",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_TURKEY))
    );
    public static final RegistryObject<Item> COOKED_TURKEY = ITEMS.register(
            "cooked_turkey",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_TURKEY))
    );
    public static final RegistryObject<Item> GREAT_WHITE_SPAWN_EGG = ITEMS.register(
            "great_white_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GREAT_WHITE, 0xA9A9A9, 0x7EBFEA, new Item.Properties())
    );
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
