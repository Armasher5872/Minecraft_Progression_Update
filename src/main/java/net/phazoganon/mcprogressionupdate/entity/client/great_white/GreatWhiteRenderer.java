package net.phazoganon.mcprogressionupdate.entity.client.great_white;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.phazoganon.mcprogressionupdate.entity.client.ModModelLayers;
import net.phazoganon.mcprogressionupdate.entity.custom.GreatWhiteEntity;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;
import org.jetbrains.annotations.NotNull;

public class GreatWhiteRenderer extends MobRenderer<GreatWhiteEntity, GreatWhiteModel<GreatWhiteEntity>> {
    public GreatWhiteRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new GreatWhiteModel<>(pContext.bakeLayer(ModModelLayers.GREAT_WHITE_LAYER)), 1.0f);
    }
    @Override
    public @NotNull ResourceLocation getTextureLocation(GreatWhiteEntity pEntity) {
        return new ResourceLocation(minecraft_progression_update.MOD_ID, "textures/entity/great_white.png");
    }
    @Override
    public void render(GreatWhiteEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        pPoseStack.scale(2.0f, 2.0f, 2.0f);
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
