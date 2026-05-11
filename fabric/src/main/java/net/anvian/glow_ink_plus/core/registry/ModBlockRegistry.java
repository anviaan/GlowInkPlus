package net.anvian.glow_ink_plus.core.registry;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class ModBlockRegistry {
    public static void registerBlocks() {
        Constants.LOG.info("Registering blocks for " + Constants.MOD_NAME + "...");

        //wool
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_WHITE_WOOL_ID), ModBlocks.GLOW_WHITE_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_ORANGE_WOOL_ID), ModBlocks.GLOW_ORANGE_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_MAGENTA_WOOL_ID), ModBlocks.GLOW_MAGENTA_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_BLUE_WOOL_ID), ModBlocks.GLOW_LIGHT_BLUE_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_YELLOW_WOOL_ID), ModBlocks.GLOW_YELLOW_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIME_WOOL_ID), ModBlocks.GLOW_LIME_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PINK_WOOL_ID), ModBlocks.GLOW_PINK_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GRAY_WOOL_ID), ModBlocks.GLOW_GRAY_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_GRAY_WOOL_ID), ModBlocks.GLOW_LIGHT_GRAY_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_CYAN_WOOL_ID), ModBlocks.GLOW_CYAN_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PURPLE_WOOL_ID), ModBlocks.GLOW_PURPLE_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLUE_WOOL_ID), ModBlocks.GLOW_BLUE_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BROWN_WOOL_ID), ModBlocks.GLOW_BROWN_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GREEN_WOOL_ID), ModBlocks.GLOW_GREEN_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_RED_WOOL_ID), ModBlocks.GLOW_RED_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLACK_WOOL_ID), ModBlocks.GLOW_BLACK_WOOL);

        //carpet
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_WHITE_CARPET_ID), ModBlocks.GLOW_WHITE_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_ORANGE_CARPET_ID), ModBlocks.GLOW_ORANGE_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_MAGENTA_CARPET_ID), ModBlocks.GLOW_MAGENTA_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_BLUE_CARPET_ID), ModBlocks.GLOW_LIGHT_BLUE_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_YELLOW_CARPET_ID), ModBlocks.GLOW_YELLOW_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIME_CARPET_ID), ModBlocks.GLOW_LIME_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PINK_CARPET_ID), ModBlocks.GLOW_PINK_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GRAY_CARPET_ID), ModBlocks.GLOW_GRAY_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_GRAY_CARPET_ID), ModBlocks.GLOW_LIGHT_GRAY_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_CYAN_CARPET_ID), ModBlocks.GLOW_CYAN_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PURPLE_CARPET_ID), ModBlocks.GLOW_PURPLE_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLUE_CARPET_ID), ModBlocks.GLOW_BLUE_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BROWN_CARPET_ID), ModBlocks.GLOW_BROWN_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GREEN_CARPET_ID), ModBlocks.GLOW_GREEN_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_RED_CARPET_ID), ModBlocks.GLOW_RED_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLACK_CARPET_ID), ModBlocks.GLOW_BLACK_CARPET);
    }
}
