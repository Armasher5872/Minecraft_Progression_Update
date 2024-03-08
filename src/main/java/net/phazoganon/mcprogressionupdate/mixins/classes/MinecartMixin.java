package net.phazoganon.mcprogressionupdate.mixins.classes;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Minecart.class)
public abstract class MinecartMixin extends AbstractMinecart {
    protected MinecartMixin(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
}
