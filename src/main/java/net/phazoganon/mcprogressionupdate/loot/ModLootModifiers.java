package net.phazoganon.mcprogressionupdate.loot;

import com.mojang.serialization.Codec;
import net.phazoganon.mcprogressionupdate.loot.modifiers.FirestoneToolModifier;
import net.phazoganon.mcprogressionupdate.loot.modifiers.ModEntitiesModifier;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, minecraft_progression_update.MOD_ID);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> FIRESTONE_SMELTING =
            LOOT_MODIFIER_SERIALIZERS.register("firestone_smelting", () -> FirestoneToolModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> MOD_ENTITY_DROPS =
            LOOT_MODIFIER_SERIALIZERS.register("mod_entity_drops", () -> ModEntitiesModifier.DIRECT_CODEC);
    public static void register(IEventBus eventBus) {
        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }
}