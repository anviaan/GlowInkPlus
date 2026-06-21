package net.anvian.glow_ink_plus.mixin.client;

import net.anvian.glow_ink_plus.duck.GlowingSheepRenderStateAccessor;
import net.minecraft.client.renderer.entity.state.SheepRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(SheepRenderState.class)
public class SheepRenderStateMixin implements GlowingSheepRenderStateAccessor {

    @Unique
    private boolean glowInkPlus$glowingWool;

    @Override
    public boolean glowInkPlus$isGlowingWool() {
        return this.glowInkPlus$glowingWool;
    }

    @Override
    public void glowInkPlus$setGlowingWool(boolean glowing) {
        this.glowInkPlus$glowingWool = glowing;
    }
}
