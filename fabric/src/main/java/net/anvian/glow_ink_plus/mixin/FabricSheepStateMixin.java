package net.anvian.glow_ink_plus.mixin;

import net.anvian.glow_ink_plus.duck.GlowingSheepAccessor;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.animal.sheep.Sheep;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Sheep.class)
public abstract class FabricSheepStateMixin implements GlowingSheepAccessor {

    @Unique
    private static final EntityDataAccessor<Boolean> DATA_GLOWING_WOOL =
            SynchedEntityData.defineId(Sheep.class, EntityDataSerializers.BOOLEAN);

    @Inject(method = "defineSynchedData", at = @At("TAIL"))
    private void glowInkPlus$defineSynchedData(SynchedEntityData.Builder builder, CallbackInfo ci) {
        builder.define(DATA_GLOWING_WOOL, false);
    }

    @Inject(method = "addAdditionalSaveData", at = @At("TAIL"))
    private void glowInkPlus$addAdditionalSaveData(ValueOutput output, CallbackInfo ci) {
        output.putBoolean("GlowingWool", glowInkPlus$isGlowingWool());
    }

    @Inject(method = "readAdditionalSaveData", at = @At("TAIL"))
    private void glowInkPlus$readAdditionalSaveData(ValueInput input, CallbackInfo ci) {
        glowInkPlus$setGlowingWool(input.getBooleanOr("GlowingWool", false));
    }

    @Override
    public boolean glowInkPlus$isGlowingWool() {
        return ((Sheep) (Object) this).getEntityData().get(DATA_GLOWING_WOOL);
    }

    @Override
    public void glowInkPlus$setGlowingWool(boolean glowing) {
        ((Sheep) (Object) this).getEntityData().set(DATA_GLOWING_WOOL, glowing);
    }
}
