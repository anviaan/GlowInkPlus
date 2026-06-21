package net.anvian.glow_ink_plus.mixin.client;

import net.anvian.glow_ink_plus.duck.GlowingSheepAccessor;
import net.anvian.glow_ink_plus.duck.GlowingSheepRenderStateAccessor;
import net.minecraft.client.renderer.entity.SheepRenderer;
import net.minecraft.client.renderer.entity.state.SheepRenderState;
import net.minecraft.world.entity.animal.sheep.Sheep;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SheepRenderer.class)
public class SheepRendererMixin {

    @Inject(method = "extractRenderState(Lnet/minecraft/world/entity/animal/sheep/Sheep;Lnet/minecraft/client/renderer/entity/state/SheepRenderState;F)V", at = @At("TAIL"))
    private void onExtractRenderState(Sheep entity, SheepRenderState state, float partialTicks, CallbackInfo ci) {
        ((GlowingSheepRenderStateAccessor) state).glowInkPlus$setGlowingWool(
                ((GlowingSheepAccessor) entity).glowInkPlus$isGlowingWool()
        );
    }
}
