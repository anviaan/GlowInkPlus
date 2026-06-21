package net.anvian.glow_ink_plus.mixin.client;

import net.anvian.glow_ink_plus.duck.GlowingBannerRenderStateAccessor;
import net.minecraft.client.renderer.blockentity.state.BannerRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(BannerRenderState.class)
public class BannerRenderStateMixin implements GlowingBannerRenderStateAccessor {

    @Unique
    private boolean glowInkPlus$glowing;

    @Override
    public boolean glowInkPlus$isGlowing() {
        return this.glowInkPlus$glowing;
    }

    @Override
    public void glowInkPlus$setGlowing(boolean glowing) {
        this.glowInkPlus$glowing = glowing;
    }
}
