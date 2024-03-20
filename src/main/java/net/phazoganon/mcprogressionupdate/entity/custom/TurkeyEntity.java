package net.phazoganon.mcprogressionupdate.entity.custom;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.phazoganon.mcprogressionupdate.entity.ModEntities;
import net.phazoganon.mcprogressionupdate.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

public class TurkeyEntity extends Animal {
    private static final EntityDataAccessor<Boolean> FALLING =
            SynchedEntityData.defineId(TurkeyEntity.class, EntityDataSerializers.BOOLEAN);
    public TurkeyEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    Vec3 vec3 = this.getDeltaMovement();
    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState fallAnimationState = new AnimationState();
    private int idleTimeout = 0;
    private int fallTimeout = 0;
    @Override
    public void tick() {
        super.tick();
        if(this.level().isClientSide) {
            setupAnimationStates();
            fallCheck();
        }
    }
    private void fallCheck() {
        this.setFalling(!this.onGround() && vec3.y < 0.0D);
    }
    private void setupAnimationStates() {
        if(this.idleTimeout <= 0) {
            this.idleTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        }
        else {
            --this.idleTimeout;
        }
        if (this.isFalling() && fallTimeout <= 0) {
            fallTimeout = 10;
            fallAnimationState.start(this.tickCount);
        }
        else {
            --this.fallTimeout;
        }
        if (!this.isFalling()) {
            fallAnimationState.stop();
        }
    }
    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if(this.getPose() == Pose.STANDING) {
            f = Math.min(pPartialTick * 6f, 1f);
        }
        else {
            f = 0f;
        }
        this.walkAnimation.update(f, 0.2f);
    }
    public void setFalling(boolean falling) {
        this.entityData.set(FALLING, falling);
    }
    public boolean isFalling() {
        return this.entityData.get(FALLING);
    }
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(FALLING, false);
    }
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0D));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.0D, Ingredient.of(Items.BEETROOT_SEEDS), false));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 6D)
                .add(Attributes.MOVEMENT_SPEED, 0.35D)
                .add(Attributes.FOLLOW_RANGE, 6D);
    }
    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return ModEntities.TURKEY.get().create(pLevel);
    }
    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(Items.BEETROOT_SEEDS);
    }
    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.TURKEY_AMBIENT.get();
    }
    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return ModSounds.TURKEY_HURT.get();
    }
    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.TURKEY_DEATH.get();
    }
}