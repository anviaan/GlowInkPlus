package net.anvian.glow_ink_plus.mixin;

import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockEntityType.class)
public class BedBlockEntityTypeMixin {

    @Inject(method = "isValid", at = @At("HEAD"), cancellable = true)
    private void glowInkPlus$isValid(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if (state != null && state.getBlock() instanceof BedBlock) {
            cir.setReturnValue(true);
        }
    }
}
