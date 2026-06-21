package net.anvian.glow_ink_plus.core.registry;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import net.anvian.glow_ink_plus.core.recipe.ModRecipeSerializers;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ModDataComponentRegistry {
    public static void register() {
        Registry.register(BuiltInRegistries.DATA_COMPONENT_TYPE,
                Identifier.fromNamespaceAndPath(Constants.MOD_ID, "glowing"),
                ModDataComponents.GLOWING);

        Registry.register(BuiltInRegistries.RECIPE_SERIALIZER,
                Identifier.fromNamespaceAndPath(Constants.MOD_ID, "glow_armor_smithing"),
                ModRecipeSerializers.GLOW_ARMOR_SMITHING);

        Registry.register(BuiltInRegistries.RECIPE_SERIALIZER,
                Identifier.fromNamespaceAndPath(Constants.MOD_ID, "glow_banner_crafting"),
                ModRecipeSerializers.GLOW_BANNER_CRAFTING);
    }
}
