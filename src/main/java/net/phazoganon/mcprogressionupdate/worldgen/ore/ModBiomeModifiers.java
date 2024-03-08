package net.phazoganon.mcprogressionupdate.worldgen.ore;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.phazoganon.mcprogressionupdate.entity.ModEntities;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_NETHER_FIRESTONE_ORE = registerKey("add_nether_firestone_ore");
    public static final ResourceKey<BiomeModifier> TURKEY_SPAWN = registerKey("turkey_spawn");
    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);
        context.register(ADD_NETHER_FIRESTONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeaturesClass.NETHER_FIRESTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(TURKEY_SPAWN, ForgeBiomeModifiers.AddSpawnsBiomeModifier.singleSpawn(
                biomes.getOrThrow(BiomeTags.IS_TAIGA),
                new MobSpawnSettings.SpawnerData(ModEntities.TURKEY.get(), 5, 1, 4)
        ));
    }
    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(minecraft_progression_update.MOD_ID, name));
    }
}
