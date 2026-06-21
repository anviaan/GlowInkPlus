package net.anvian.glow_ink_plus.mixin.client;

import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import net.minecraft.client.renderer.special.ShieldSpecialRenderer;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShieldSpecialRenderer.class)
public class ShieldSpecialRendererMixin {

    @Unique
    private boolean glowInkPlus$isGlowing;

    @Inject(method = "extractArgument", at = @At("HEAD"))
    private void captureGlowing(ItemStack stack, CallbackInfoReturnable<DataComponentMap> cir) {
        this.glowInkPlus$isGlowing = stack.has(ModDataComponents.GLOWING);
    }

    @ModifyVariable(method = "submit", at = @At("HEAD"), ordinal = 0, argsOnly = true)
    private int modifyLightCoords(int lightCoords) {
        if (this.glowInkPlus$isGlowing) {
            return 0xF000F0;
        }
        return lightCoords;
    }
}
