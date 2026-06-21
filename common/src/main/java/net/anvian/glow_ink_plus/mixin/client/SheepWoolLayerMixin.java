package net.anvian.glow_ink_plus.mixin.client;

import net.anvian.glow_ink_plus.duck.GlowingSheepRenderStateAccessor;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.layers.SheepWoolLayer;
import net.minecraft.client.renderer.entity.state.SheepRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SheepWoolLayer.class)
public class SheepWoolLayerMixin {

    @Unique
    private SheepRenderState glowInkPlus$capturedState;

    @Inject(method = "submit", at = @At("HEAD"))
    private void captureState(PoseStack poseStack, SubmitNodeCollector collector, int lightCoords, SheepRenderState state, float yRot, float xRot, CallbackInfo ci) {
        this.glowInkPlus$capturedState = state;
    }

    @ModifyArg(method = "submit", at = @At(value = "INVOKE", target = "coloredCutoutModelCopyLayerRender"), index = 4)
    private int modifyLightCoords(int lightCoords) {
        if (this.glowInkPlus$capturedState != null && ((GlowingSheepRenderStateAccessor) this.glowInkPlus$capturedState).glowInkPlus$isGlowingWool()) {
            return 0xF000F0;
        }
        return lightCoords;
    }
}
