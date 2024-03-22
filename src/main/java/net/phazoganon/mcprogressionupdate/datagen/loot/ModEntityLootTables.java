package net.phazoganon.mcprogressionupdate.datagen.loot;

import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.LootingEnchantFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.phazoganon.mcprogressionupdate.entity.ModEntities;
import net.phazoganon.mcprogressionupdate.item.ModItems;

@SuppressWarnings("deprecation")
public class ModEntityLootTables extends EntityLootSubProvider {
    public ModEntityLootTables() {
        super(FeatureFlags.REGISTRY.allFlags());
    }
    @Override
    public void generate() {
        add(ModEntities.TURKEY.get(),
                LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f))
                        .add(LootItem.lootTableItem(Items.FEATHER)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0f, 2.0f)))
                                .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0f, 1.0f)))))
                        .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0f))
                                .add(LootItem.lootTableItem(ModItems.RAW_TURKEY.get())
                                .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))
                                .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0f, 1.0f))))
                        )
        );
        add(ModEntities.GREAT_WHITE.get(), emptyLootTable());
    }
    public LootTable.Builder emptyLootTable() {
        return LootTable.lootTable();
    }
    @Override
    protected java.util.stream.Stream<EntityType<?>> getKnownEntityTypes() {
        return ModEntities.ENTITY_TYPES.getEntries().stream().map(RegistryObject::get);
    }
}
