package net.phazoganon.mcprogressionupdate.entity.client.great_white;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.phazoganon.mcprogressionupdate.entity.animations.GreatWhiteAnimationDefinitions;
import net.phazoganon.mcprogressionupdate.entity.custom.GreatWhiteEntity;

public class GreatWhiteModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart GreatWhiteModel;
	private final ModelPart head;
	public GreatWhiteModel(ModelPart root) {
		this.GreatWhiteModel = root.getChild("GreatWhiteModel");
        this.head = GreatWhiteModel.getChild("torso").getChild("head");
    }
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition GreatWhiteModel = partdefinition.addOrReplaceChild("GreatWhiteModel", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition torso = GreatWhiteModel.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition body = torso.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -10.0F, -16.0F, 11.0F, 10.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition fluke = torso.addOrReplaceChild("fluke", CubeListBuilder.create().texOffs(86, 0).addBox(-3.0F, -4.0F, -4.0F, 7.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -4.0F, 11.0F));
		PartDefinition tail = fluke.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(1.0F, -1.0F, 10.0F));
		PartDefinition tailcb_r1 = tail.addOrReplaceChild("tailcb_r1", CubeListBuilder.create().texOffs(0, 65).addBox(-3.0F, -1.0F, 23.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 65).addBox(11.0F, -1.0F, 23.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, -21.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition tailb_r1 = tail.addOrReplaceChild("tailb_r1", CubeListBuilder.create().texOffs(38, 57).addBox(18.0F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 61).addBox(18.0F, -1.0F, -10.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1, 51).addBox(21.0F, -1.0F, -11.0F, 6.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.0F, -21.0F, 0.0F, -1.5708F, -1.5708F));
		PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(-1.0F, -4.0F, -16.0F));
		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.0F, 1.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tooth12_r1 = jaw.addOrReplaceChild("tooth12_r1", CubeListBuilder.create().texOffs(1, 1).addBox(2.0F, -4.0F, -24.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, -4.0F, -24.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, -4.0F, -24.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, -4.0F, -24.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -4.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -4.0F, -20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(3.0F, -4.0F, -24.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, -4.0F, -18.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, -4.0F, -20.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, -4.0F, -22.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-5.0F, -4.0F, -24.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(92, 21).addBox(-5.0F, -3.0F, -24.0F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -4.2752F, 15.5474F, 0.3927F, 0.0F, 0.0F));
		PartDefinition upper_head = head.addOrReplaceChild("upper_head", CubeListBuilder.create().texOffs(49, 0).addBox(-4.0F, -3.0F, -8.0F, 9.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, 2.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, 2.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, 2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-4.0F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, 2.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, 2.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, 2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(4.0F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-2.0F, 2.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(0.0F, 2.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(2.0F, 2.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition dorsal_fin = GreatWhiteModel.addOrReplaceChild("dorsal_fin", CubeListBuilder.create(), PartPose.offset(0.0F, -10.0F, -2.0F));
		PartDefinition fint_r1 = dorsal_fin.addOrReplaceChild("fint_r1", CubeListBuilder.create().texOffs(12, 37).addBox(-7.0F, -1.0F, -15.0F, 6.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.0F, 2.0F, -3.1416F, -1.309F, 1.5708F));
		PartDefinition fins = GreatWhiteModel.addOrReplaceChild("fins", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition finr = fins.addOrReplaceChild("finr", CubeListBuilder.create(), PartPose.offset(-5.0F, -3.0F, -5.0F));
		PartDefinition finr_r1 = finr.addOrReplaceChild("finr_r1", CubeListBuilder.create().texOffs(49, 51).addBox(-6.0F, -7.0F, -8.0F, 6.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 3.0F, 5.0F, 0.0F, -1.0472F, -1.5708F));
		PartDefinition finl = fins.addOrReplaceChild("finl", CubeListBuilder.create(), PartPose.offset(5.0F, -3.0F, -5.0F));
		PartDefinition finl_r1 = finl.addOrReplaceChild("finl_r1", CubeListBuilder.create().texOffs(49, 37).addBox(-6.0F, 5.0F, -8.0F, 6.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0F, 3.0F, 5.0F, 0.0F, -1.0472F, -1.5708F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}
	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);
		this.animate(((GreatWhiteEntity) entity).idleAnimationState, GreatWhiteAnimationDefinitions.IDLE, ageInTicks, 1f);
		this.animate(((GreatWhiteEntity) entity).attackAnimationState, GreatWhiteAnimationDefinitions.ATTACK, ageInTicks, 1f);
	}
	private void applyHeadRotation(float pNetHeadYaw, float pNetHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -20.0f, 20.0f);
		pNetHeadPitch = Mth.clamp(pNetHeadPitch, -10.0f, 10.0f);
		this.head.xRot = pNetHeadPitch*((float)Math.PI/180f);
		this.head.yRot = pNetHeadYaw*((float)Math.PI/180f);
	}
	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		GreatWhiteModel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart root() {
		return GreatWhiteModel;
	}
}