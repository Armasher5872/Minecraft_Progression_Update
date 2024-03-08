package net.phazoganon.mcprogressionupdate.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_TURKEY = new FoodProperties.Builder().nutrition(3).saturationMod(1.6f).meat()
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600), 0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 160), 0.1f).build();
    public static final FoodProperties COOKED_TURKEY = new FoodProperties.Builder().nutrition(8).saturationMod(10.0f).meat()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 0.3f).build();
}
