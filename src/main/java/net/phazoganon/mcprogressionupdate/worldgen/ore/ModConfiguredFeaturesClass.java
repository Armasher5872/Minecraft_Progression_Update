package net.phazoganon.mcprogressionupdate.worldgen.ore;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.phazoganon.mcprogressionupdate.block.ModBlocks;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

import java.util.List;

public class ModConfiguredFeaturesClass {
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_FIRESTONE_ORE_KEY = registerKey("firestone_ore");
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest netherrackReplaceable = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest basaltReplaceable = new BlockMatchTest(Blocks.BASALT);
        List<OreConfiguration.TargetBlockState> netherFirestoneOres = List.of(
                OreConfiguration.target(netherrackReplaceable, ModBlocks.FIRESTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(basaltReplaceable, ModBlocks.FIRESTONE_ORE.get().defaultBlockState()));
        register(context, NETHER_FIRESTONE_ORE_KEY, Feature.ORE, new OreConfiguration(netherFirestoneOres, 5));
    }
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(minecraft_progression_update.MOD_ID, name));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
