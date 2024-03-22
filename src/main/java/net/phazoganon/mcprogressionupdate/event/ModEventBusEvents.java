package net.phazoganon.mcprogressionupdate.event;

import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.phazoganon.mcprogressionupdate.entity.ModEntities;
import net.phazoganon.mcprogressionupdate.entity.custom.GreatWhiteEntity;
import net.phazoganon.mcprogressionupdate.entity.custom.TurkeyEntity;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

@Mod.EventBusSubscriber(modid = minecraft_progression_update.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(
                ModEntities.TURKEY.get(),
                SpawnPlacements.Type.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules,
                SpawnPlacementRegisterEvent.Operation.REPLACE
        );
        event.register(
                ModEntities.GREAT_WHITE.get(),
                SpawnPlacements.Type.IN_WATER,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                WaterAnimal::checkSurfaceWaterAnimalSpawnRules,
                SpawnPlacementRegisterEvent.Operation.REPLACE
        );
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.TURKEY.get(), TurkeyEntity.createAttributes().build());
        event.put(ModEntities.GREAT_WHITE.get(), GreatWhiteEntity.createAttributes().build());
    }
}
