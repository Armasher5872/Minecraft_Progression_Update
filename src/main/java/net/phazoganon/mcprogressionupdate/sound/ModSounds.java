package net.phazoganon.mcprogressionupdate.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, minecraft_progression_update.MOD_ID);
    public static final RegistryObject<SoundEvent> TURKEY_AMBIENT = registerSoundEvents("turkey_ambient");
    public static final RegistryObject<SoundEvent> TURKEY_HURT = registerSoundEvents("turkey_hurt");
    public static final RegistryObject<SoundEvent> TURKEY_DEATH = registerSoundEvents("turkey_death");
    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {

        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(minecraft_progression_update.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
