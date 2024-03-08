/*
 * Copyright 2022 Infernal Studios
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.phazoganon.mcprogressionupdate.food;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Items;

public class FoodEffectsConfig {
    public static List<EffectData> effects = new ArrayList<>(List.of(
            EffectData.of(Items.APPLE, MobEffects.DIG_SPEED, 40, 0, 1.0),
            EffectData.of(Items.BAKED_POTATO, MobEffects.MOVEMENT_SPEED, 300, 1, 1.0),
            EffectData.of(Items.BEEF, MobEffects.HUNGER, 100, 0, 0.3),
            EffectData.of(Items.BEEF, MobEffects.POISON, 60, 0, 0.1),
            EffectData.of(Items.BEETROOT, MobEffects.MOVEMENT_SPEED, 100, 0, 1.0),
            EffectData.of(Items.BEETROOT_SOUP, MobEffects.MOVEMENT_SPEED, 600, 2, 1.0),
            EffectData.of(Items.BREAD, MobEffects.DIG_SPEED, 600, 1, 1.0),
            EffectData.of(Items.CARROT, MobEffects.MOVEMENT_SPEED, 100, 0, 1.0),
            EffectData.of(Items.CHICKEN, MobEffects.POISON, 140, 0, 0.1),
            EffectData.of(Items.CHORUS_FRUIT, MobEffects.DIG_SPEED, 300, 0, 1.0),
            EffectData.of(Items.COD, MobEffects.HUNGER, 40, 0, 0.3),
            EffectData.of(Items.COD, MobEffects.POISON, 20, 0, 0.1),
            EffectData.of(Items.COOKED_BEEF, MobEffects.DAMAGE_BOOST, 1200, 2, 1.0),
            EffectData.of(Items.COOKED_CHICKEN, MobEffects.DAMAGE_BOOST, 1200, 1, 1.0),
            EffectData.of(Items.COOKED_CHICKEN, MobEffects.SLOW_FALLING, 600, 0, 0.3),
            EffectData.of(Items.COOKED_COD, MobEffects.DAMAGE_BOOST, 900, 1, 1.0),
            EffectData.of(Items.COOKED_COD, MobEffects.WATER_BREATHING, 600, 0, 0.3),
            EffectData.of(Items.COOKED_MUTTON, MobEffects.DAMAGE_BOOST, 900, 2, 1.0),
            EffectData.of(Items.COOKED_MUTTON, MobEffects.HEALTH_BOOST, 600, 1, 0.3),
            EffectData.of(Items.COOKED_PORKCHOP, MobEffects.DAMAGE_BOOST, 900, 1, 1.0),
            EffectData.of(Items.COOKED_PORKCHOP, MobEffects.LUCK, 600, 0, 0.3),
            EffectData.of(Items.COOKED_RABBIT, MobEffects.DAMAGE_BOOST, 2400, 0, 1.0),
            EffectData.of(Items.COOKED_RABBIT, MobEffects.JUMP, 600, 1, 0.3),
            EffectData.of(Items.COOKED_SALMON, MobEffects.DAMAGE_BOOST, 900, 1, 1.0),
            EffectData.of(Items.COOKED_SALMON, MobEffects.WATER_BREATHING, 600, 0, 0.3),
            EffectData.of(Items.COOKIE, MobEffects.DIG_SPEED, 1200, 0, 1.0),
            EffectData.of(Items.DRIED_KELP, MobEffects.MOVEMENT_SPEED, 300, 0, 1.0),
            EffectData.of(Items.ENCHANTED_GOLDEN_APPLE, MobEffects.MOVEMENT_SPEED, 300, 4, 1.0),
            EffectData.of(Items.GLOW_BERRIES, MobEffects.DAMAGE_RESISTANCE, 300, 0, 1.0),
            EffectData.of(Items.GOLDEN_APPLE, MobEffects.MOVEMENT_SPEED, 300, 2, 1.0),
            EffectData.of(Items.GOLDEN_CARROT, MobEffects.MOVEMENT_SPEED, 600, 1, 1.0),
            EffectData.of(Items.HONEY_BOTTLE, MobEffects.DAMAGE_RESISTANCE, 300, 1, 1.0),
            EffectData.of(Items.MELON_SLICE, MobEffects.MOVEMENT_SPEED, 100, 0, 1.0),
            EffectData.of(Items.MUSHROOM_STEW, MobEffects.ABSORPTION, 300, 1, 1.0),
            EffectData.of(Items.MUSHROOM_STEW, MobEffects.HEALTH_BOOST, 1200, 1, 0.3),
            EffectData.of(Items.MUTTON, MobEffects.HUNGER, 140, 0, 0.3),
            EffectData.of(Items.MUTTON, MobEffects.POISON, 60, 0, 0.1),
            EffectData.of(Items.PORKCHOP, MobEffects.HUNGER, 300, 0, 0.3),
            EffectData.of(Items.PORKCHOP, MobEffects.POISON, 140, 0, 0.1),
            EffectData.of(Items.POTATO, MobEffects.MOVEMENT_SPEED, 100, 0, 1.0),
            EffectData.of(Items.PUMPKIN_PIE, MobEffects.DAMAGE_RESISTANCE, 300, 0, 1.0),
            EffectData.of(Items.PUMPKIN_PIE, MobEffects.DIG_SPEED, 300, 2, 0.3),
            EffectData.of(Items.RABBIT, MobEffects.HUNGER, 100, 0, 0.3),
            EffectData.of(Items.RABBIT, MobEffects.POISON, 100, 0, 0.1),
            EffectData.of(Items.RABBIT_STEW, MobEffects.ABSORPTION, 400, 1, 1.0),
            EffectData.of(Items.SALMON, MobEffects.HUNGER, 40, 0, 0.3),
            EffectData.of(Items.SALMON, MobEffects.POISON, 20, 0, 0.1),
            EffectData.of(Items.SWEET_BERRIES, MobEffects.DAMAGE_RESISTANCE, 200, 0, 1.0),
            EffectData.of(Items.TROPICAL_FISH, MobEffects.HUNGER, 40, 0, 0.3),
            EffectData.of(Items.TROPICAL_FISH, MobEffects.POISON, 20, 0, 0.1)
    )) {
        @Override
        public String toString() {
            return "";
        }
    };
}