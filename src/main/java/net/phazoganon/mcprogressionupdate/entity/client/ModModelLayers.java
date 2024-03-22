package net.phazoganon.mcprogressionupdate.entity.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;

public class ModModelLayers {
    public static final ModelLayerLocation TURKEY_LAYER = new ModelLayerLocation(
            new ResourceLocation(minecraft_progression_update.MOD_ID, "turkey_layer"), "main");
    public static final ModelLayerLocation GREAT_WHITE_LAYER = new ModelLayerLocation(
            new ResourceLocation(minecraft_progression_update.MOD_ID, "great_white_layer"), "main");
}