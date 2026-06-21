package net.anvian.glow_ink_plus.mixin;

import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import net.minecraft.util.Unit;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.ShieldDecorationRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShieldDecorationRecipe.class)
public class ShieldDecorationRecipeMixin {

    @Inject(method = "assemble", at = @At("RETURN"), cancellable = true)
    private void transferGlowingToShield(CraftingInput input, CallbackInfoReturnable<ItemStack> cir) {
        ItemStack result = cir.getReturnValue();
        if (result.isEmpty()) return;

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (!stack.isEmpty() && stack.getItem() instanceof BannerItem && stack.has(ModDataComponents.GLOWING)) {
                result.set(ModDataComponents.GLOWING, Unit.INSTANCE);
                break;
            }
        }
    }
}
