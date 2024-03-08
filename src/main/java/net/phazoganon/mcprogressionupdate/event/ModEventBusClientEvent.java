package net.phazoganon.mcprogressionupdate.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.phazoganon.mcprogressionupdate.entity.client.ModModelLayers;
import net.phazoganon.mcprogressionupdate.entity.client.TurkeyModel;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

@Mod.EventBusSubscriber(modid = minecraft_progression_update.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvent {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.TURKEY_LAYER, TurkeyModel::createBodyLayer);
    }
}
