package net.phazoganon.mcprogressionupdate;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.phazoganon.mcprogressionupdate.block.ModBlocks;
import net.phazoganon.mcprogressionupdate.entity.ModEntities;
import net.phazoganon.mcprogressionupdate.entity.client.TurkeyRenderer;
import net.phazoganon.mcprogressionupdate.food.FoodEffects;
import net.phazoganon.mcprogressionupdate.item.ModItems;
import net.phazoganon.mcprogressionupdate.loot.ModLootModifiers;
import net.phazoganon.mcprogressionupdate.sound.ModSounds;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(minecraft_progression_update.MOD_ID)
public class minecraft_progression_update {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "mc_progression_update";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public minecraft_progression_update() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModSounds.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new FoodEffects());
        modEventBus.addListener(this::addCreative);
        ModLootModifiers.register(modEventBus);
        ModEntities.register(modEventBus);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {}
    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.FROSTBITTEN_BRICKS);
            event.accept(ModBlocks.FROSTBITTEN_BRICK_SLAB);
            event.accept(ModBlocks.FROSTBITTEN_BRICK_STAIRS);
            event.accept(ModBlocks.CHISELED_FROSTBITTEN_BRICKS);
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.FIRESTONE_SWORD);
            event.accept(ModItems.FIRESTONE_AXE);
            event.accept(ModItems.SHATTERED_WOODEN_SWORD);
            event.accept(ModItems.SHATTERED_STONE_SWORD);
            event.accept(ModItems.SHATTERED_IRON_SWORD);
            event.accept(ModItems.SHATTERED_GOLDEN_SWORD);
            event.accept(ModItems.SHATTERED_DIAMOND_SWORD);
            event.accept(ModItems.SHATTERED_NETHERITE_SWORD);
            event.accept(ModItems.SHATTERED_WOODEN_AXE);
            event.accept(ModItems.SHATTERED_STONE_AXE);
            event.accept(ModItems.SHATTERED_IRON_AXE);
            event.accept(ModItems.SHATTERED_GOLDEN_AXE);
            event.accept(ModItems.SHATTERED_DIAMOND_AXE);
            event.accept(ModItems.SHATTERED_NETHERITE_AXE);
            event.accept(ModItems.SHATTERED_TRIDENT);
            event.accept(ModItems.FIRESTONE_HELMET);
            event.accept(ModItems.FIRESTONE_CHESTPLATE);
            event.accept(ModItems.FIRESTONE_LEGGINGS);
            event.accept(ModItems.FIRESTONE_BOOTS);
            event.accept(ModItems.SHATTERED_LEATHER_CAP);
            event.accept(ModItems.SHATTERED_LEATHER_TUNIC);
            event.accept(ModItems.SHATTERED_LEATHER_PANTS);
            event.accept(ModItems.SHATTERED_LEATHER_BOOTS);
            event.accept(ModItems.SHATTERED_CHAINMAIL_HELMET);
            event.accept(ModItems.SHATTERED_CHAINMAIL_CHESTPLATE);
            event.accept(ModItems.SHATTERED_CHAINMAIL_LEGGINGS);
            event.accept(ModItems.SHATTERED_CHAINMAIL_BOOTS);
            event.accept(ModItems.SHATTERED_IRON_HELMET);
            event.accept(ModItems.SHATTERED_IRON_CHESTPLATE);
            event.accept(ModItems.SHATTERED_IRON_LEGGINGS);
            event.accept(ModItems.SHATTERED_IRON_BOOTS);
            event.accept(ModItems.SHATTERED_GOLDEN_HELMET);
            event.accept(ModItems.SHATTERED_GOLDEN_CHESTPLATE);
            event.accept(ModItems.SHATTERED_GOLDEN_LEGGINGS);
            event.accept(ModItems.SHATTERED_GOLDEN_BOOTS);
            event.accept(ModItems.SHATTERED_DIAMOND_HELMET);
            event.accept(ModItems.SHATTERED_DIAMOND_CHESTPLATE);
            event.accept(ModItems.SHATTERED_DIAMOND_LEGGINGS);
            event.accept(ModItems.SHATTERED_DIAMOND_BOOTS);
            event.accept(ModItems.SHATTERED_NETHERITE_HELMET);
            event.accept(ModItems.SHATTERED_NETHERITE_CHESTPLATE);
            event.accept(ModItems.SHATTERED_NETHERITE_LEGGINGS);
            event.accept(ModItems.SHATTERED_NETHERITE_BOOTS);
            event.accept(ModItems.SHATTERED_TURTLE_SHELL);
            event.accept(ModItems.SHATTERED_BOW);
            event.accept(ModItems.MULTIBOW);
            event.accept(ModItems.SHATTERED_MULTIBOW);
            event.accept(ModItems.SHATTERED_CROSSBOW);
        }
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.RAW_TURKEY);
            event.accept(ModItems.COOKED_TURKEY);
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.MAGMATIC_WORM);
            event.accept(ModItems.FIRESTONE_SHARDS);
        }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.FIRESTONE_ORE);
        }
        if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
            event.accept(ModBlocks.LIGHTNING_RAIL);
        }
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.TURKEY_SPAWN_EGG);
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModBlocks.LIGHTNING_RAIL);
            event.accept(ModItems.FIRESTONE_SHOVEL);
            event.accept(ModItems.FIRESTONE_PICKAXE);
            event.accept(ModItems.FIRESTONE_AXE);
            event.accept(ModItems.FIRESTONE_HOE);
            event.accept(ModItems.SHATTERED_WOODEN_SHOVEL);
            event.accept(ModItems.SHATTERED_WOODEN_PICKAXE);
            event.accept(ModItems.SHATTERED_WOODEN_AXE);
            event.accept(ModItems.SHATTERED_WOODEN_HOE);
            event.accept(ModItems.SHATTERED_STONE_SHOVEL);
            event.accept(ModItems.SHATTERED_STONE_PICKAXE);
            event.accept(ModItems.SHATTERED_STONE_AXE);
            event.accept(ModItems.SHATTERED_STONE_HOE);
            event.accept(ModItems.SHATTERED_IRON_SHOVEL);
            event.accept(ModItems.SHATTERED_IRON_PICKAXE);
            event.accept(ModItems.SHATTERED_IRON_AXE);
            event.accept(ModItems.SHATTERED_IRON_HOE);
            event.accept(ModItems.SHATTERED_GOLDEN_SHOVEL);
            event.accept(ModItems.SHATTERED_GOLDEN_PICKAXE);
            event.accept(ModItems.SHATTERED_GOLDEN_AXE);
            event.accept(ModItems.SHATTERED_GOLDEN_HOE);
            event.accept(ModItems.SHATTERED_DIAMOND_SHOVEL);
            event.accept(ModItems.SHATTERED_DIAMOND_PICKAXE);
            event.accept(ModItems.SHATTERED_DIAMOND_AXE);
            event.accept(ModItems.SHATTERED_DIAMOND_HOE);
            event.accept(ModItems.SHATTERED_NETHERITE_SHOVEL);
            event.accept(ModItems.SHATTERED_NETHERITE_PICKAXE);
            event.accept(ModItems.SHATTERED_NETHERITE_AXE);
            event.accept(ModItems.SHATTERED_NETHERITE_HOE);
            event.accept(ModItems.SHATTERED_FISHING_ROD);
            event.accept(ModItems.SHATTERED_FLINT_AND_STEEL);
            event.accept(ModItems.FLINT_AND_SOULSTEEL);
            event.accept(ModItems.SHATTERED_FLINT_AND_SOULSTEEL);
            event.accept(ModItems.SHATTERED_SHEARS);
            event.accept(ModItems.SHATTERED_BRUSH);
        }
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}
    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.TURKEY.get(), TurkeyRenderer::new);
        }
    }
}
