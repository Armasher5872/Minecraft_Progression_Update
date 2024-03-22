package net.phazoganon.mcprogressionupdate.entity.client.turkey;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.phazoganon.mcprogressionupdate.entity.animations.TurkeyAnimationDefinitions;
import net.phazoganon.mcprogressionupdate.entity.custom.TurkeyEntity;

public class TurkeyModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart turkeymodel;
	private final ModelPart head;
	public TurkeyModel(ModelPart root) {
		this.turkeymodel = root.getChild("turkeymodel");
		this.head = turkeymodel.getChild("torso").getChild("head");
	}
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition turkeymodel = partdefinition.addOrReplaceChild("turkeymodel", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));
		PartDefinition limb = turkeymodel.addOrReplaceChild("limb", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition legl = limb.addOrReplaceChild("legl", CubeListBuilder.create(), PartPose.offset(1.5F, -2.0F, -1.0F));
		PartDefinition legl_r1 = legl.addOrReplaceChild("legl_r1", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition footl = legl.addOrReplaceChild("footl", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition footl_r1 = footl.addOrReplaceChild("footl_r1", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-1.5F, 0.0F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition legr = limb.addOrReplaceChild("legr", CubeListBuilder.create(), PartPose.offset(-2.5F, -2.0F, -1.0F));
		PartDefinition legr_r1 = legr.addOrReplaceChild("legr_r1", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition footr = legr.addOrReplaceChild("footr", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition footr_r1 = footr.addOrReplaceChild("footr_r1", CubeListBuilder.create().texOffs(21, 0).mirror().addBox(-1.5F, 0.0F, -2.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition tail = limb.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0F, 1.5F));
		PartDefinition tail3_r1 = tail.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(45, 17).mirror().addBox(-0.0562F, -0.8457F, -2.0F, 0.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, -5.0F, 0.5F, -1.5708F, 1.4661F, -1.5708F));
		PartDefinition tail2_r1 = tail.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(45, 8).mirror().addBox(0.05F, -0.8402F, -3.5F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -4.0F, 0.5F, -1.5708F, 1.4661F, -1.5708F));
		PartDefinition tail1_r1 = tail.addOrReplaceChild("tail1_r1", CubeListBuilder.create().texOffs(45, -3).mirror().addBox(-0.0813F, -2.9283F, -5.05F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, 0.05F, -1.5708F, 1.4661F, -1.5708F));
		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(45, -8).mirror().addBox(-0.03F, -0.95F, -4.5F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 1.4661F, -1.5708F));
		PartDefinition wing = limb.addOrReplaceChild("wing", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition wingr = wing.addOrReplaceChild("wingr", CubeListBuilder.create(), PartPose.offset(3.0F, -7.0F, -1.0F));
		PartDefinition wingr_r1 = wingr.addOrReplaceChild("wingr_r1", CubeListBuilder.create().texOffs(65, 0).addBox(0.0F, -2.0F, -4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition wingl = wing.addOrReplaceChild("wingl", CubeListBuilder.create(), PartPose.offset(-4.0F, -7.0F, -1.0F));
		PartDefinition wingl_r1 = wingl.addOrReplaceChild("wingl_r1", CubeListBuilder.create().texOffs(65, 0).mirror().addBox(-1.0F, -2.0F, -4.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition torso = turkeymodel.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition body = torso.addOrReplaceChild("body", CubeListBuilder.create().texOffs(77, 0).addBox(-4.0F, -6.0F, -4.0F, 7.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(9, 0).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(29, 0).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -7.0F, -4.0F));
		PartDefinition dangle = head.addOrReplaceChild("dangle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.0F));
		PartDefinition dangle_r1 = dangle.addOrReplaceChild("dangle_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}
	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);
		this.animateWalk(TurkeyAnimationDefinitions.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((TurkeyEntity) entity).fallAnimationState, TurkeyAnimationDefinitions.FALL, ageInTicks, 1f);
	}
	private void applyHeadRotation(float pNetHeadYaw, float pNetHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -50.0f, 50.0f);
		pNetHeadPitch = Mth.clamp(pNetHeadPitch, -25.0f, 45.0f);
		this.head.xRot = pNetHeadPitch*((float)Math.PI/180f);
		this.head.yRot = pNetHeadYaw*((float)Math.PI/180f);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		turkeymodel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart root() {
		return turkeymodel;
	}
}