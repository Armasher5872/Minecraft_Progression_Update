package net.phazoganon.mcprogressionupdate.food;

import java.util.HashMap;

import javax.annotation.Nullable;

import com.electronwill.nightconfig.core.CommentedConfig;
import com.electronwill.nightconfig.core.Config;
import com.electronwill.nightconfig.toml.TomlFormat;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public record EffectData(ResourceLocation item, ResourceLocation effect, int duration, int amplifier, double probability) {
    public ResourceLocation getItemLocation() {
        return item;
    }
    @Nullable
    public Item getItem() {
        return ForgeRegistries.ITEMS.getValue(this.getItemLocation());
    }
    public ResourceLocation getEffectLocation() {
        return effect;
    }
    @Nullable
    public MobEffect getEffect() {
        return ForgeRegistries.MOB_EFFECTS.getValue(this.getEffectLocation());
    }
    public int getDuration() {
        return duration;
    }
    public int getAmplifier() {
        return amplifier;
    }
    public double getProbability() {
        return probability;
    }
    public Config toConfig() {
        CommentedConfig config = CommentedConfig.of(() -> new HashMap<>(4), TomlFormat.instance());
        config.set("item", this.getItemLocation().toString());
        config.set("effect", this.getEffectLocation().toString());
        config.set("duration", (double) this.getDuration() / 20);
        config.set("amplifier", this.getAmplifier());
        config.set("probability", this.getProbability());
        config.setComment("item", " Determines what item this effect is applied to.");
        config.setComment("effect", " Determines what effect consuming the item will give in addition to any existing effects.");
        config.setComment("duration", " Determines how long the effect lasts. If set to 0, the effect will be removed.\n Range: [0, 1000000]");
        config.setComment("amplifier", " Determines how strong the effect is. Amplifiers start at 0.\n Range: [0, 255]");
        config.setComment("probability", " Determines the chance of getting an effect. \n Range: [0.0, 1.0]");
        return config;
    }
    @Override
    public String toString() {
        return "EffectData [item=" + item + ", effect=" + effect + ", duration=" + duration + ", amplifier=" + amplifier + ", probability=" + probability +"]";
    }
    public static EffectData fromConfig(Config config) {
        return new EffectData(
                ResourceLocation.tryParse(config.get("item")),
                ResourceLocation.tryParse(config.<String>get("effect")),
                (int) (config.<Number>get("duration").doubleValue() * 20),
                config.getInt("amplifier"),
                config.get("probability")
        );
    }
    public static EffectData of(Item item, MobEffect effect, int duration, int amplifier, double probability) {
        return new EffectData(
                ForgeRegistries.ITEMS.getKey(item),
                ForgeRegistries.MOB_EFFECTS.getKey(effect),
                duration,
                amplifier,
                probability
        );
    }
    public static EffectData of(ResourceLocation item, ResourceLocation effect, int duration, int amplifier, double probability) {
        return new EffectData(item, effect, duration, amplifier, probability);
    }
}