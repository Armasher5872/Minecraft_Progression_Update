package net.phazoganon.mcprogressionupdate.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;
import java.util.Random;

public class FoodEffects {
    @SubscribeEvent
    public void onLivingEntityUseItemStart(LivingEntityUseItemEvent.Start event) {
        ItemStack stack = event.getItem();
        if (
                stack.getItem() == Items.HONEY_BOTTLE
                || stack.getItem() == Items.GLOW_BERRIES
                || stack.getItem() == Items.SWEET_BERRIES
                || stack.getItem() == Items.SPIDER_EYE
        ) {
            event.setDuration(4);
        }
        if (
                stack.getItem() == Items.APPLE
                || stack.getItem() == Items.BEETROOT
                || stack.getItem() == Items.CARROT
                || stack.getItem() == Items.CHORUS_FRUIT
                || stack.getItem() == Items.COOKIE
                || stack.getItem() == Items.DRIED_KELP
                || stack.getItem() == Items.MELON_SLICE
                || stack.getItem() == Items.ROTTEN_FLESH
        ) {
            event.setDuration(8);
        }
        if (stack.getItem() == Items.ENCHANTED_GOLDEN_APPLE || stack.getItem() == Items.RABBIT_STEW) {
            event.setDuration(32);
        }
    }
    @SubscribeEvent
    public void onLivingEntityUseItemFinish(LivingEntityUseItemEvent.Finish event) {
        if (event.getEntity() instanceof Player player) {
            onEat(player, event.getItem().getItem());
        }
    }
    public static void onEat(Player player, Item item) {
        Random rand = new Random();
        int randInt = rand.nextInt(100)+1;
        double randDouble = (double) randInt/100;
        for (EffectData effect : FoodEffectsConfig.effects) {
            if (effect.getItemLocation().equals(ForgeRegistries.ITEMS.getKey(item))) {
                if (effect.getDuration() <= 0) {
                    player.removeEffect(Objects.requireNonNull(effect.getEffect()));
                }
                else {
                    if (randDouble <= effect.getProbability()) {
                        player.addEffect(new MobEffectInstance(Objects.requireNonNull(effect.getEffect()), effect.getDuration(), effect.getAmplifier()));
                    }
                }
            }
        }
    }
}
