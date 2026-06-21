package net.anvian.glow_ink_plus.mixin.client;

import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HumanoidArmorLayer.class)
public class HumanoidArmorLayerMixin {

    @Unique
    private ItemStack glowInkPlus$currentItemStack;

    @Inject(method = "renderArmorPiece", at = @At("HEAD"))
    private void captureItemStack(PoseStack poseStack, SubmitNodeCollector collector, ItemStack itemStack, EquipmentSlot slot, int lightCoords, HumanoidRenderState state, CallbackInfo ci) {
        this.glowInkPlus$currentItemStack = itemStack;
    }

    @ModifyArg(method = "renderArmorPiece", at = @At(value = "INVOKE", target = "renderLayers"), index = 7)
    private int modifyLightCoords(int lightCoords) {
        if (this.glowInkPlus$currentItemStack != null && this.glowInkPlus$currentItemStack.has(ModDataComponents.GLOWING)) {
            return 0xF000F0;
        }
        return lightCoords;
    }
}
