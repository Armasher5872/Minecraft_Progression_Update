package net.phazoganon.mcprogressionupdate.entity.custom;

import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.control.SmoothSwimmingMoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.phazoganon.mcprogressionupdate.entity.ai.GreatWhiteAttackGoal;
import org.jetbrains.annotations.Nullable;

public class GreatWhiteEntity extends WaterAnimal {
    private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(GreatWhiteEntity.class, EntityDataSerializers.BOOLEAN);
    public GreatWhiteEntity(EntityType<? extends WaterAnimal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new SmoothSwimmingMoveControl(this, 85, 10, 0.5F, 0.1F, true);
        this.lookControl = new SmoothSwimmingLookControl(this, 10);
    }
    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState attackAnimationState = new AnimationState();
    private int idleTimeout = 0;
    public int attackTimeout = 0;
    @Override
    public void tick() {
        super.tick();
        if(this.level().isClientSide) {
            setupAnimationStates();
        }
    }
    private void setupAnimationStates() {
        if(this.idleTimeout <= 0) {
            this.idleTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        }
        else {
            --this.idleTimeout;
        }
        if(this.isAttacking() && attackTimeout <= 0) {
            attackTimeout = 20;
        }
        else {
            --this.attackTimeout;
        }
        if(!this.isAttacking()) {
            attackAnimationState.stop();
        }
    }
    protected PathNavigation createNavigation(Level level) {
        return new WaterBoundPathNavigation(this, level);
    }
    public void setAttacking(boolean attacking) {
        this.entityData.set(ATTACKING, attacking);
    }
    public boolean isAttacking() {
        return this.entityData.get(ATTACKING);
    }
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ATTACKING, false);
    }
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new TryFindWaterGoal(this));
        this.goalSelector.addGoal(1, new GreatWhiteAttackGoal(this, 1.3D, true));
        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0D));
        this.goalSelector.addGoal(2, new RandomSwimmingGoal(this, 1.0D, 10));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 20D)
                .add(Attributes.FOLLOW_RANGE, 40D)
                .add(Attributes.MOVEMENT_SPEED, 2.0D)
                .add(Attributes.ATTACK_DAMAGE, 6.0D)
                .add(Attributes.ARMOR_TOUGHNESS, 0.1f)
                .add(Attributes.ATTACK_KNOCKBACK, 6.0f);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return this.isInWater() ? SoundEvents.DOLPHIN_AMBIENT_WATER : SoundEvents.DOLPHIN_AMBIENT;
    }
    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.GUARDIAN_HURT;
    }
    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.SALMON_DEATH;
    }
    @Override
    protected SoundEvent getSwimSound() {
        return SoundEvents.DOLPHIN_SWIM;
    }
}