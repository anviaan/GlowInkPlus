package net.anvian.glow_ink_plus.mixin.client;

import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(ItemStack.class)
public class ItemTooltipMixin {

    @Inject(method = "getTooltipLines", at = @At("RETURN"))
    private void addGlowingTooltip(Item.TooltipContext context, Player player, TooltipFlag flag, CallbackInfoReturnable<List<Component>> cir) {
        ItemStack self = (ItemStack) (Object) this;
        if (self.has(ModDataComponents.GLOWING)) {
            List<Component> tooltip = cir.getReturnValue();
            tooltip.add(1, Component.translatable("item.glow_ink_plus.glowing_tooltip").withStyle(Style.EMPTY.withColor(0xFFFF00)));
        }
    }
}
