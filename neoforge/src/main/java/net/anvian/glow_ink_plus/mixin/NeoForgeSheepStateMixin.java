package net.anvian.glow_ink_plus.mixin;

import net.anvian.glow_ink_plus.duck.GlowingSheepAccessor;
import net.anvian.glow_ink_plus.core.attachment.ModAttachments;
import net.minecraft.world.entity.animal.sheep.Sheep;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Sheep.class)
public abstract class NeoForgeSheepStateMixin implements GlowingSheepAccessor {

    @Override
    public boolean glowInkPlus$isGlowingWool() {
        return ((Sheep) (Object) this).getData(ModAttachments.GLOWING_WOOL);
    }

    @Override
    public void glowInkPlus$setGlowingWool(boolean glowing) {
        ((Sheep) (Object) this).setData(ModAttachments.GLOWING_WOOL, glowing);
    }
}
