package net.phazoganon.mcprogressionupdate.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.phazoganon.mcprogressionupdate.datagen.loot.ModBlockLootTables;
import net.phazoganon.mcprogressionupdate.datagen.loot.ModEntityLootTables;

import java.util.List;
import java.util.Set;

public class ModLootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(ModBlockLootTables::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(ModEntityLootTables::new, LootContextParamSets.ENTITY)
        ));
    }
}