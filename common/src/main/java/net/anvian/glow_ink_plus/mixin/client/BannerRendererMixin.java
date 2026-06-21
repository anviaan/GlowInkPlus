package net.anvian.glow_ink_plus.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import net.anvian.glow_ink_plus.duck.GlowingBannerRenderStateAccessor;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BannerRenderer;
import net.minecraft.client.renderer.blockentity.state.BannerRenderState;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.level.block.entity.BannerBlockEntity;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BannerRenderer.class)
public class BannerRendererMixin {

    @Inject(method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BannerBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BannerRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", at = @At("TAIL"))
    private void extractGlowingState(BannerBlockEntity blockEntity, BannerRenderState state, float partialTicks, Vec3 cameraPosition, ModelFeatureRenderer.CrumblingOverlay breakProgress, CallbackInfo ci) {
        boolean glowing = blockEntity.components().get(ModDataComponents.GLOWING) != null;
        ((GlowingBannerRenderStateAccessor) state).glowInkPlus$setGlowing(glowing);
    }

    @Inject(method = "submit", at = @At("HEAD"))
    private void applyGlowingLight(BannerRenderState state, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera, CallbackInfo ci) {
        if (((GlowingBannerRenderStateAccessor) state).glowInkPlus$isGlowing()) {
            state.lightCoords = 0xF000F0;
        }
    }
}
