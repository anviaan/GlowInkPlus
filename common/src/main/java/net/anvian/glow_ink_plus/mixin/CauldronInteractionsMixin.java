package net.anvian.glow_ink_plus.mixin;

import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.cauldron.CauldronInteractions;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CauldronInteractions.class)
public class CauldronInteractionsMixin {

    @Inject(method = "dyedItemIteration", at = @At("HEAD"), cancellable = true)
    private static void onDyedItemIteration(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, ItemStack itemInHand, CallbackInfoReturnable<InteractionResult> cir) {
        if (itemInHand.has(ModDataComponents.GLOWING)) {
            if (!level.isClientSide()) {
                itemInHand.remove(ModDataComponents.GLOWING);
                player.awardStat(Stats.CLEAN_ARMOR);
                LayeredCauldronBlock.lowerFillLevel(state, level, pos);
            }
            cir.setReturnValue(InteractionResult.SUCCESS);
        }
    }
}
