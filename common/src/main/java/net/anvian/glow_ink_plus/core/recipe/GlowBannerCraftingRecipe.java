package net.anvian.glow_ink_plus.core.recipe;

import com.mojang.serialization.MapCodec;
import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.Unit;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BannerPatternLayers;

public class GlowBannerCraftingRecipe extends CustomRecipe {

    public static final MapCodec<GlowBannerCraftingRecipe> MAP_CODEC = MapCodec.unit(GlowBannerCraftingRecipe::new);

    public static final StreamCodec<RegistryFriendlyByteBuf, GlowBannerCraftingRecipe> STREAM_CODEC =
            StreamCodec.unit(new GlowBannerCraftingRecipe());

    public static final RecipeSerializer<GlowBannerCraftingRecipe> SERIALIZER =
            new RecipeSerializer<>(MAP_CODEC, STREAM_CODEC);

    @Override
    public boolean matches(CraftingInput input, Level level) {
        if (input.ingredientCount() != 2) {
            return false;
        }

        boolean hasTarget = false;
        boolean hasGlowInk = false;

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.isEmpty()) continue;

            if (stack.is(Items.GLOW_INK_SAC)) {
                if (hasGlowInk) return false;
                hasGlowInk = true;
            } else if (isValidTarget(stack)) {
                if (hasTarget) return false;
                hasTarget = true;
            } else {
                return false;
            }
        }

        return hasTarget && hasGlowInk;
    }

    @Override
    public ItemStack assemble(CraftingInput input) {
        ItemStack target = ItemStack.EMPTY;

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (!stack.isEmpty() && isValidTarget(stack)) {
                target = stack;
                break;
            }
        }

        if (target.isEmpty()) return ItemStack.EMPTY;

        ItemStack result = target.copyWithCount(1);
        result.set(ModDataComponents.GLOWING, Unit.INSTANCE);
        return result;
    }

    private static boolean isValidTarget(ItemStack stack) {
        if (stack.has(ModDataComponents.GLOWING)) return false;

        if (stack.getItem() instanceof BannerItem) {
            return true;
        }

        if (stack.is(Items.SHIELD)) {
            BannerPatternLayers patterns = stack.getOrDefault(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY);
            return !patterns.layers().isEmpty() || stack.has(DataComponents.BASE_COLOR);
        }

        return false;
    }

    @Override
    public RecipeSerializer<GlowBannerCraftingRecipe> getSerializer() {
        return SERIALIZER;
    }
}
