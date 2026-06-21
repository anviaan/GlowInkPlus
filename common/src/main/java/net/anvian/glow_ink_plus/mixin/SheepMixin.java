package net.anvian.glow_ink_plus.mixin;

import net.anvian.glow_ink_plus.duck.GlowingSheepAccessor;
import net.anvian.glow_ink_plus.core.item.ModItems;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.animal.sheep.Sheep;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Sheep.class)
public abstract class SheepMixin implements GlowingSheepAccessor {

    @Unique
    private static final EntityDataAccessor<Boolean> DATA_GLOWING_WOOL =
            SynchedEntityData.defineId(Sheep.class, EntityDataSerializers.BOOLEAN);

    @Inject(method = "defineSynchedData", at = @At("TAIL"))
    private void onDefineSynchedData(SynchedEntityData.Builder builder, CallbackInfo ci) {
        builder.define(DATA_GLOWING_WOOL, false);
    }

    @Inject(method = "addAdditionalSaveData", at = @At("TAIL"))
    private void onAddAdditionalSaveData(ValueOutput output, CallbackInfo ci) {
        output.putBoolean("GlowingWool", this.glowInkPlus$isGlowingWool());
    }

    @Inject(method = "readAdditionalSaveData", at = @At("TAIL"))
    private void onReadAdditionalSaveData(ValueInput input, CallbackInfo ci) {
        this.glowInkPlus$setGlowingWool(input.getBooleanOr("GlowingWool", false));
    }

    @Inject(method = "mobInteract", at = @At("HEAD"), cancellable = true)
    private void onMobInteract(Player player, InteractionHand hand, CallbackInfoReturnable<InteractionResult> cir) {
        Sheep self = (Sheep) (Object) this;
        ItemStack itemStack = player.getItemInHand(hand);
        if (itemStack.is(Items.GLOW_INK_SAC)) {
            if (self.level() instanceof ServerLevel) {
                if (!self.isSheared() && !this.glowInkPlus$isGlowingWool()) {
                    this.glowInkPlus$setGlowingWool(true);
                    if (!player.getAbilities().instabuild) {
                        itemStack.shrink(1);
                    }
                    self.level().playSound(null, self, SoundEvents.GLOW_INK_SAC_USE, SoundSource.PLAYERS, 1.0F, 1.0F);
                    cir.setReturnValue(InteractionResult.SUCCESS_SERVER);
                    return;
                }
            }
            cir.setReturnValue(InteractionResult.CONSUME);
        }
    }

    @Inject(method = "shear", at = @At("HEAD"), cancellable = true)
    private void onShear(ServerLevel level, SoundSource soundSource, ItemStack tool, CallbackInfo ci) {
        if (!this.glowInkPlus$isGlowingWool()) return;

        Sheep self = (Sheep) (Object) this;
        ci.cancel();

        level.playSound(null, self, SoundEvents.SHEEP_SHEAR, soundSource, 1.0F, 1.0F);

        Item glowWoolItem = glowInkPlus$getGlowingWoolItem(self.getColor());
        int count = 1 + self.getRandom().nextInt(3);

        for (int i = 0; i < count; i++) {
            ItemEntity entity = self.spawnAtLocation(level, new ItemStack(glowWoolItem), 1.0F);
            if (entity != null) {
                entity.setDeltaMovement(entity.getDeltaMovement().add(
                        (self.getRandom().nextFloat() - self.getRandom().nextFloat()) * 0.1F,
                        self.getRandom().nextFloat() * 0.05F,
                        (self.getRandom().nextFloat() - self.getRandom().nextFloat()) * 0.1F
                ));
            }
        }

        self.setSheared(true);
    }

    @Override
    public boolean glowInkPlus$isGlowingWool() {
        return ((Sheep) (Object) this).getEntityData().get(DATA_GLOWING_WOOL);
    }

    @Override
    public void glowInkPlus$setGlowingWool(boolean glowing) {
        ((Sheep) (Object) this).getEntityData().set(DATA_GLOWING_WOOL, glowing);
    }

    @Unique
    private static Item glowInkPlus$getGlowingWoolItem(DyeColor color) {
        return switch (color) {
            case WHITE -> ModItems.GLOW_WHITE_WOOL;
            case ORANGE -> ModItems.GLOW_ORANGE_WOOL;
            case MAGENTA -> ModItems.GLOW_MAGENTA_WOOL;
            case LIGHT_BLUE -> ModItems.GLOW_LIGHT_BLUE_WOOL;
            case YELLOW -> ModItems.GLOW_YELLOW_WOOL;
            case LIME -> ModItems.GLOW_LIME_WOOL;
            case PINK -> ModItems.GLOW_PINK_WOOL;
            case GRAY -> ModItems.GLOW_GRAY_WOOL;
            case LIGHT_GRAY -> ModItems.GLOW_LIGHT_GRAY_WOOL;
            case CYAN -> ModItems.GLOW_CYAN_WOOL;
            case PURPLE -> ModItems.GLOW_PURPLE_WOOL;
            case BLUE -> ModItems.GLOW_BLUE_WOOL;
            case BROWN -> ModItems.GLOW_BROWN_WOOL;
            case GREEN -> ModItems.GLOW_GREEN_WOOL;
            case RED -> ModItems.GLOW_RED_WOOL;
            case BLACK -> ModItems.GLOW_BLACK_WOOL;
        };
    }
}
