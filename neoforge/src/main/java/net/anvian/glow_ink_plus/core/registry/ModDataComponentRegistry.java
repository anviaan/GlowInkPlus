package net.anvian.glow_ink_plus.core.registry;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import net.anvian.glow_ink_plus.core.recipe.GlowArmorSmithingRecipe;
import net.anvian.glow_ink_plus.core.recipe.GlowBannerCraftingRecipe;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModDataComponentRegistry {
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENTS =
            DeferredRegister.create(Registries.DATA_COMPONENT_TYPE, Constants.MOD_ID);

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, Constants.MOD_ID);

    public static final Supplier<DataComponentType<?>> GLOWING =
            DATA_COMPONENTS.register("glowing", () -> ModDataComponents.GLOWING);

    public static final Supplier<RecipeSerializer<GlowArmorSmithingRecipe>> GLOW_ARMOR_SMITHING =
            RECIPE_SERIALIZERS.register("glow_armor_smithing", () -> GlowArmorSmithingRecipe.SERIALIZER);

    public static final Supplier<RecipeSerializer<GlowBannerCraftingRecipe>> GLOW_BANNER_CRAFTING =
            RECIPE_SERIALIZERS.register("glow_banner_crafting", () -> GlowBannerCraftingRecipe.SERIALIZER);
}
