package net.phazoganon.mcprogressionupdate.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;
import net.phazoganon.mcprogressionupdate.worldgen.ore.ModBiomeModifiers;
import net.phazoganon.mcprogressionupdate.worldgen.ore.ModConfiguredFeaturesClass;
import net.phazoganon.mcprogressionupdate.worldgen.ore.ModPlacedFeaturesClass;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeaturesClass::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeaturesClass::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);
    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(minecraft_progression_update.MOD_ID));
    }
}
