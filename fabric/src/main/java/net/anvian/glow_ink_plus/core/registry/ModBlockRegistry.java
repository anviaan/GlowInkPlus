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

        //bed
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_WHITE_BED_ID), ModBlocks.GLOW_WHITE_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_ORANGE_BED_ID), ModBlocks.GLOW_ORANGE_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_MAGENTA_BED_ID), ModBlocks.GLOW_MAGENTA_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_BLUE_BED_ID), ModBlocks.GLOW_LIGHT_BLUE_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_YELLOW_BED_ID), ModBlocks.GLOW_YELLOW_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIME_BED_ID), ModBlocks.GLOW_LIME_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PINK_BED_ID), ModBlocks.GLOW_PINK_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GRAY_BED_ID), ModBlocks.GLOW_GRAY_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_GRAY_BED_ID), ModBlocks.GLOW_LIGHT_GRAY_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_CYAN_BED_ID), ModBlocks.GLOW_CYAN_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PURPLE_BED_ID), ModBlocks.GLOW_PURPLE_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLUE_BED_ID), ModBlocks.GLOW_BLUE_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BROWN_BED_ID), ModBlocks.GLOW_BROWN_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GREEN_BED_ID), ModBlocks.GLOW_GREEN_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_RED_BED_ID), ModBlocks.GLOW_RED_BED);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLACK_BED_ID), ModBlocks.GLOW_BLACK_BED);

        //stained glass
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_WHITE_STAINED_GLASS_ID), ModBlocks.GLOW_WHITE_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_ORANGE_STAINED_GLASS_ID), ModBlocks.GLOW_ORANGE_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_MAGENTA_STAINED_GLASS_ID), ModBlocks.GLOW_MAGENTA_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_BLUE_STAINED_GLASS_ID), ModBlocks.GLOW_LIGHT_BLUE_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_YELLOW_STAINED_GLASS_ID), ModBlocks.GLOW_YELLOW_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIME_STAINED_GLASS_ID), ModBlocks.GLOW_LIME_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PINK_STAINED_GLASS_ID), ModBlocks.GLOW_PINK_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GRAY_STAINED_GLASS_ID), ModBlocks.GLOW_GRAY_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_GRAY_STAINED_GLASS_ID), ModBlocks.GLOW_LIGHT_GRAY_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_CYAN_STAINED_GLASS_ID), ModBlocks.GLOW_CYAN_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PURPLE_STAINED_GLASS_ID), ModBlocks.GLOW_PURPLE_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLUE_STAINED_GLASS_ID), ModBlocks.GLOW_BLUE_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BROWN_STAINED_GLASS_ID), ModBlocks.GLOW_BROWN_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GREEN_STAINED_GLASS_ID), ModBlocks.GLOW_GREEN_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_RED_STAINED_GLASS_ID), ModBlocks.GLOW_RED_STAINED_GLASS);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLACK_STAINED_GLASS_ID), ModBlocks.GLOW_BLACK_STAINED_GLASS);

        //candle
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_WHITE_CANDLE_ID), ModBlocks.GLOW_WHITE_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_ORANGE_CANDLE_ID), ModBlocks.GLOW_ORANGE_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_MAGENTA_CANDLE_ID), ModBlocks.GLOW_MAGENTA_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_BLUE_CANDLE_ID), ModBlocks.GLOW_LIGHT_BLUE_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_YELLOW_CANDLE_ID), ModBlocks.GLOW_YELLOW_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIME_CANDLE_ID), ModBlocks.GLOW_LIME_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PINK_CANDLE_ID), ModBlocks.GLOW_PINK_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GRAY_CANDLE_ID), ModBlocks.GLOW_GRAY_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_GRAY_CANDLE_ID), ModBlocks.GLOW_LIGHT_GRAY_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_CYAN_CANDLE_ID), ModBlocks.GLOW_CYAN_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PURPLE_CANDLE_ID), ModBlocks.GLOW_PURPLE_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLUE_CANDLE_ID), ModBlocks.GLOW_BLUE_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BROWN_CANDLE_ID), ModBlocks.GLOW_BROWN_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GREEN_CANDLE_ID), ModBlocks.GLOW_GREEN_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_RED_CANDLE_ID), ModBlocks.GLOW_RED_CANDLE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLACK_CANDLE_ID), ModBlocks.GLOW_BLACK_CANDLE);

        //stained glass pane
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_WHITE_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_WHITE_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_ORANGE_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_ORANGE_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_MAGENTA_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_MAGENTA_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_BLUE_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_LIGHT_BLUE_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_YELLOW_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_YELLOW_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIME_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_LIME_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PINK_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_PINK_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GRAY_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_GRAY_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_GRAY_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_LIGHT_GRAY_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_CYAN_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_CYAN_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PURPLE_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_PURPLE_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLUE_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_BLUE_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BROWN_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_BROWN_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GREEN_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_GREEN_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_RED_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_RED_STAINED_GLASS_PANE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLACK_STAINED_GLASS_PANE_ID), ModBlocks.GLOW_BLACK_STAINED_GLASS_PANE);

        //concrete
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_WHITE_CONCRETE_ID), ModBlocks.GLOW_WHITE_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_ORANGE_CONCRETE_ID), ModBlocks.GLOW_ORANGE_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_MAGENTA_CONCRETE_ID), ModBlocks.GLOW_MAGENTA_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_BLUE_CONCRETE_ID), ModBlocks.GLOW_LIGHT_BLUE_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_YELLOW_CONCRETE_ID), ModBlocks.GLOW_YELLOW_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIME_CONCRETE_ID), ModBlocks.GLOW_LIME_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PINK_CONCRETE_ID), ModBlocks.GLOW_PINK_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GRAY_CONCRETE_ID), ModBlocks.GLOW_GRAY_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_GRAY_CONCRETE_ID), ModBlocks.GLOW_LIGHT_GRAY_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_CYAN_CONCRETE_ID), ModBlocks.GLOW_CYAN_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PURPLE_CONCRETE_ID), ModBlocks.GLOW_PURPLE_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLUE_CONCRETE_ID), ModBlocks.GLOW_BLUE_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BROWN_CONCRETE_ID), ModBlocks.GLOW_BROWN_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GREEN_CONCRETE_ID), ModBlocks.GLOW_GREEN_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_RED_CONCRETE_ID), ModBlocks.GLOW_RED_CONCRETE);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLACK_CONCRETE_ID), ModBlocks.GLOW_BLACK_CONCRETE);

        //glazed terracotta
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_WHITE_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_WHITE_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_ORANGE_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_ORANGE_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_MAGENTA_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_MAGENTA_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_BLUE_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_LIGHT_BLUE_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_YELLOW_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_YELLOW_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIME_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_LIME_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PINK_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_PINK_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GRAY_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_GRAY_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_GRAY_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_LIGHT_GRAY_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_CYAN_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_CYAN_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PURPLE_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_PURPLE_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLUE_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_BLUE_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BROWN_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_BROWN_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GREEN_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_GREEN_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_RED_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_RED_GLAZED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLACK_GLAZED_TERRACOTTA_ID), ModBlocks.GLOW_BLACK_GLAZED_TERRACOTTA);

        //terracotta
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_WHITE_TERRACOTTA_ID), ModBlocks.GLOW_WHITE_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_ORANGE_TERRACOTTA_ID), ModBlocks.GLOW_ORANGE_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_MAGENTA_TERRACOTTA_ID), ModBlocks.GLOW_MAGENTA_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_BLUE_TERRACOTTA_ID), ModBlocks.GLOW_LIGHT_BLUE_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_YELLOW_TERRACOTTA_ID), ModBlocks.GLOW_YELLOW_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIME_TERRACOTTA_ID), ModBlocks.GLOW_LIME_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PINK_TERRACOTTA_ID), ModBlocks.GLOW_PINK_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GRAY_TERRACOTTA_ID), ModBlocks.GLOW_GRAY_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_GRAY_TERRACOTTA_ID), ModBlocks.GLOW_LIGHT_GRAY_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_CYAN_TERRACOTTA_ID), ModBlocks.GLOW_CYAN_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PURPLE_TERRACOTTA_ID), ModBlocks.GLOW_PURPLE_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLUE_TERRACOTTA_ID), ModBlocks.GLOW_BLUE_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BROWN_TERRACOTTA_ID), ModBlocks.GLOW_BROWN_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GREEN_TERRACOTTA_ID), ModBlocks.GLOW_GREEN_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_RED_TERRACOTTA_ID), ModBlocks.GLOW_RED_TERRACOTTA);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLACK_TERRACOTTA_ID), ModBlocks.GLOW_BLACK_TERRACOTTA);

        //concrete powder
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_WHITE_CONCRETE_POWDER_ID), ModBlocks.GLOW_WHITE_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_ORANGE_CONCRETE_POWDER_ID), ModBlocks.GLOW_ORANGE_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_MAGENTA_CONCRETE_POWDER_ID), ModBlocks.GLOW_MAGENTA_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_BLUE_CONCRETE_POWDER_ID), ModBlocks.GLOW_LIGHT_BLUE_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_YELLOW_CONCRETE_POWDER_ID), ModBlocks.GLOW_YELLOW_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIME_CONCRETE_POWDER_ID), ModBlocks.GLOW_LIME_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PINK_CONCRETE_POWDER_ID), ModBlocks.GLOW_PINK_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GRAY_CONCRETE_POWDER_ID), ModBlocks.GLOW_GRAY_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_LIGHT_GRAY_CONCRETE_POWDER_ID), ModBlocks.GLOW_LIGHT_GRAY_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_CYAN_CONCRETE_POWDER_ID), ModBlocks.GLOW_CYAN_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_PURPLE_CONCRETE_POWDER_ID), ModBlocks.GLOW_PURPLE_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLUE_CONCRETE_POWDER_ID), ModBlocks.GLOW_BLUE_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BROWN_CONCRETE_POWDER_ID), ModBlocks.GLOW_BROWN_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_GREEN_CONCRETE_POWDER_ID), ModBlocks.GLOW_GREEN_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_RED_CONCRETE_POWDER_ID), ModBlocks.GLOW_RED_CONCRETE_POWDER);
        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GLOW_BLACK_CONCRETE_POWDER_ID), ModBlocks.GLOW_BLACK_CONCRETE_POWDER);
    }
}
