package net.phazoganon.mcprogressionupdate.entity.client.turkey;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.phazoganon.mcprogressionupdate.entity.client.ModModelLayers;
import net.phazoganon.mcprogressionupdate.entity.client.turkey.TurkeyModel;
import net.phazoganon.mcprogressionupdate.entity.custom.TurkeyEntity;
import net.phazoganon.mcprogressionupdate.minecraft_progression_update;
import org.jetbrains.annotations.NotNull;

public class TurkeyRenderer extends MobRenderer<TurkeyEntity, TurkeyModel<TurkeyEntity>> {
    public TurkeyRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new TurkeyModel<>(pContext.bakeLayer(ModModelLayers.TURKEY_LAYER)), 0.25f);
    }
    @Override
    public @NotNull ResourceLocation getTextureLocation(TurkeyEntity pEntity) {
        return new ResourceLocation(minecraft_progression_update.MOD_ID, "textures/entity/turkey.png");
    }

    @Override
    public void render(TurkeyEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pPoseStack.scale(0.75f, 0.75f, 0.75f);
        }
        else {
            pPoseStack.scale(1.5f, 1.5f, 1.5f);
        }
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
