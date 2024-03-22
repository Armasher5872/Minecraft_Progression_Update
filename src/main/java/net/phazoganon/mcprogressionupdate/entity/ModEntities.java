package net.phazoganon.mcprogressionupdate.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phazoganon.mcprogressionupdate.entity.custom.GreatWhiteEntity;
import net.phazoganon.mcprogressionupdate.entity.custom.TurkeyEntity;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, minecraft_progression_update.MOD_ID);
    public static final RegistryObject<EntityType<TurkeyEntity>> TURKEY =
            ENTITY_TYPES.register("turkey", () -> EntityType.Builder.of(TurkeyEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.4f).build("turkey"));
    public static final RegistryObject<EntityType<GreatWhiteEntity>> GREAT_WHITE =
            ENTITY_TYPES.register("great_white", () -> EntityType.Builder.of(GreatWhiteEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 1.0f).build("great_white"));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
