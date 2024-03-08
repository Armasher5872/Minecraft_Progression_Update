package net.phazoganon.mcprogressionupdate.worldgen.ore;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

import java.util.List;

public class ModPlacedFeaturesClass {
    public static final ResourceKey<PlacedFeature> NETHER_FIRESTONE_ORE_PLACED_KEY = registerKey("nether_firestone_ore_placed");
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        register(context, NETHER_FIRESTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeaturesClass.NETHER_FIRESTONE_ORE_KEY),
                ModOrePlacementClass.commonOrePlacement(20,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(4), VerticalAnchor.absolute(70))));
    }
    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(minecraft_progression_update.MOD_ID, name));
    }
    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
