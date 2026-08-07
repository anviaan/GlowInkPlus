package net.anvian.glow_ink_plus.core.registry;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Constants.MOD_ID);
    //wool

    public static final DeferredBlock<Block> GLOW_WHITE_WOOL = BLOCKS.register("glow_white_wool", () -> ModBlocks.GLOW_WHITE_WOOL);
    public static final DeferredBlock<Block> GLOW_ORANGE_WOOL = BLOCKS.register("glow_orange_wool", () -> ModBlocks.GLOW_ORANGE_WOOL);
    public static final DeferredBlock<Block> GLOW_MAGENTA_WOOL = BLOCKS.register("glow_magenta_wool", () -> ModBlocks.GLOW_MAGENTA_WOOL);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_WOOL = BLOCKS.register("glow_light_blue_wool", () -> ModBlocks.GLOW_LIGHT_BLUE_WOOL);
    public static final DeferredBlock<Block> GLOW_YELLOW_WOOL = BLOCKS.register("glow_yellow_wool", () -> ModBlocks.GLOW_YELLOW_WOOL);
    public static final DeferredBlock<Block> GLOW_LIME_WOOL = BLOCKS.register("glow_lime_wool", () -> ModBlocks.GLOW_LIME_WOOL);
    public static final DeferredBlock<Block> GLOW_PINK_WOOL = BLOCKS.register("glow_pink_wool", () -> ModBlocks.GLOW_PINK_WOOL);
    public static final DeferredBlock<Block> GLOW_GRAY_WOOL = BLOCKS.register("glow_gray_wool", () -> ModBlocks.GLOW_GRAY_WOOL);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_WOOL = BLOCKS.register("glow_light_gray_wool", () -> ModBlocks.GLOW_LIGHT_GRAY_WOOL);
    public static final DeferredBlock<Block> GLOW_CYAN_WOOL = BLOCKS.register("glow_cyan_wool", () -> ModBlocks.GLOW_CYAN_WOOL);
    public static final DeferredBlock<Block> GLOW_PURPLE_WOOL = BLOCKS.register("glow_purple_wool", () -> ModBlocks.GLOW_PURPLE_WOOL);
    public static final DeferredBlock<Block> GLOW_BLUE_WOOL = BLOCKS.register("glow_blue_wool", () -> ModBlocks.GLOW_BLUE_WOOL);
    public static final DeferredBlock<Block> GLOW_BROWN_WOOL = BLOCKS.register("glow_brown_wool", () -> ModBlocks.GLOW_BROWN_WOOL);
    public static final DeferredBlock<Block> GLOW_GREEN_WOOL = BLOCKS.register("glow_green_wool", () -> ModBlocks.GLOW_GREEN_WOOL);
    public static final DeferredBlock<Block> GLOW_RED_WOOL = BLOCKS.register("glow_red_wool", () -> ModBlocks.GLOW_RED_WOOL);
    public static final DeferredBlock<Block> GLOW_BLACK_WOOL = BLOCKS.register("glow_black_wool", () -> ModBlocks.GLOW_BLACK_WOOL);

    //carpet
    public static final DeferredBlock<Block> GLOW_WHITE_CARPET = BLOCKS.register("glow_white_carpet", () -> ModBlocks.GLOW_WHITE_CARPET);
    public static final DeferredBlock<Block> GLOW_ORANGE_CARPET = BLOCKS.register("glow_orange_carpet", () -> ModBlocks.GLOW_ORANGE_CARPET);
    public static final DeferredBlock<Block> GLOW_MAGENTA_CARPET = BLOCKS.register("glow_magenta_carpet", () -> ModBlocks.GLOW_MAGENTA_CARPET);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_CARPET = BLOCKS.register("glow_light_blue_carpet", () -> ModBlocks.GLOW_LIGHT_BLUE_CARPET);
    public static final DeferredBlock<Block> GLOW_YELLOW_CARPET = BLOCKS.register("glow_yellow_carpet", () -> ModBlocks.GLOW_YELLOW_CARPET);
    public static final DeferredBlock<Block> GLOW_LIME_CARPET = BLOCKS.register("glow_lime_carpet", () -> ModBlocks.GLOW_LIME_CARPET);
    public static final DeferredBlock<Block> GLOW_PINK_CARPET = BLOCKS.register("glow_pink_carpet", () -> ModBlocks.GLOW_PINK_CARPET);
    public static final DeferredBlock<Block> GLOW_GRAY_CARPET = BLOCKS.register("glow_gray_carpet", () -> ModBlocks.GLOW_GRAY_CARPET);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_CARPET = BLOCKS.register("glow_light_gray_carpet", () -> ModBlocks.GLOW_LIGHT_GRAY_CARPET);
    public static final DeferredBlock<Block> GLOW_CYAN_CARPET = BLOCKS.register("glow_cyan_carpet", () -> ModBlocks.GLOW_CYAN_CARPET);
    public static final DeferredBlock<Block> GLOW_PURPLE_CARPET = BLOCKS.register("glow_purple_carpet", () -> ModBlocks.GLOW_PURPLE_CARPET);
    public static final DeferredBlock<Block> GLOW_BLUE_CARPET = BLOCKS.register("glow_blue_carpet", () -> ModBlocks.GLOW_BLUE_CARPET);
    public static final DeferredBlock<Block> GLOW_BROWN_CARPET = BLOCKS.register("glow_brown_carpet", () -> ModBlocks.GLOW_BROWN_CARPET);
    public static final DeferredBlock<Block> GLOW_GREEN_CARPET = BLOCKS.register("glow_green_carpet", () -> ModBlocks.GLOW_GREEN_CARPET);
    public static final DeferredBlock<Block> GLOW_RED_CARPET = BLOCKS.register("glow_red_carpet", () -> ModBlocks.GLOW_RED_CARPET);
    public static final DeferredBlock<Block> GLOW_BLACK_CARPET = BLOCKS.register("glow_black_carpet", () -> ModBlocks.GLOW_BLACK_CARPET);

    //bed
    public static final DeferredBlock<Block> GLOW_WHITE_BED = BLOCKS.register("glow_white_bed", () -> ModBlocks.GLOW_WHITE_BED);
    public static final DeferredBlock<Block> GLOW_ORANGE_BED = BLOCKS.register("glow_orange_bed", () -> ModBlocks.GLOW_ORANGE_BED);
    public static final DeferredBlock<Block> GLOW_MAGENTA_BED = BLOCKS.register("glow_magenta_bed", () -> ModBlocks.GLOW_MAGENTA_BED);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_BED = BLOCKS.register("glow_light_blue_bed", () -> ModBlocks.GLOW_LIGHT_BLUE_BED);
    public static final DeferredBlock<Block> GLOW_YELLOW_BED = BLOCKS.register("glow_yellow_bed", () -> ModBlocks.GLOW_YELLOW_BED);
    public static final DeferredBlock<Block> GLOW_LIME_BED = BLOCKS.register("glow_lime_bed", () -> ModBlocks.GLOW_LIME_BED);
    public static final DeferredBlock<Block> GLOW_PINK_BED = BLOCKS.register("glow_pink_bed", () -> ModBlocks.GLOW_PINK_BED);
    public static final DeferredBlock<Block> GLOW_GRAY_BED = BLOCKS.register("glow_gray_bed", () -> ModBlocks.GLOW_GRAY_BED);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_BED = BLOCKS.register("glow_light_gray_bed", () -> ModBlocks.GLOW_LIGHT_GRAY_BED);
    public static final DeferredBlock<Block> GLOW_CYAN_BED = BLOCKS.register("glow_cyan_bed", () -> ModBlocks.GLOW_CYAN_BED);
    public static final DeferredBlock<Block> GLOW_PURPLE_BED = BLOCKS.register("glow_purple_bed", () -> ModBlocks.GLOW_PURPLE_BED);
    public static final DeferredBlock<Block> GLOW_BLUE_BED = BLOCKS.register("glow_blue_bed", () -> ModBlocks.GLOW_BLUE_BED);
    public static final DeferredBlock<Block> GLOW_BROWN_BED = BLOCKS.register("glow_brown_bed", () -> ModBlocks.GLOW_BROWN_BED);
    public static final DeferredBlock<Block> GLOW_GREEN_BED = BLOCKS.register("glow_green_bed", () -> ModBlocks.GLOW_GREEN_BED);
    public static final DeferredBlock<Block> GLOW_RED_BED = BLOCKS.register("glow_red_bed", () -> ModBlocks.GLOW_RED_BED);
    public static final DeferredBlock<Block> GLOW_BLACK_BED = BLOCKS.register("glow_black_bed", () -> ModBlocks.GLOW_BLACK_BED);

    //stained glass
    public static final DeferredBlock<Block> GLOW_WHITE_STAINED_GLASS = BLOCKS.register("glow_white_stained_glass", () -> ModBlocks.GLOW_WHITE_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_ORANGE_STAINED_GLASS = BLOCKS.register("glow_orange_stained_glass", () -> ModBlocks.GLOW_ORANGE_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_MAGENTA_STAINED_GLASS = BLOCKS.register("glow_magenta_stained_glass", () -> ModBlocks.GLOW_MAGENTA_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_STAINED_GLASS = BLOCKS.register("glow_light_blue_stained_glass", () -> ModBlocks.GLOW_LIGHT_BLUE_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_YELLOW_STAINED_GLASS = BLOCKS.register("glow_yellow_stained_glass", () -> ModBlocks.GLOW_YELLOW_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_LIME_STAINED_GLASS = BLOCKS.register("glow_lime_stained_glass", () -> ModBlocks.GLOW_LIME_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_PINK_STAINED_GLASS = BLOCKS.register("glow_pink_stained_glass", () -> ModBlocks.GLOW_PINK_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_GRAY_STAINED_GLASS = BLOCKS.register("glow_gray_stained_glass", () -> ModBlocks.GLOW_GRAY_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_STAINED_GLASS = BLOCKS.register("glow_light_gray_stained_glass", () -> ModBlocks.GLOW_LIGHT_GRAY_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_CYAN_STAINED_GLASS = BLOCKS.register("glow_cyan_stained_glass", () -> ModBlocks.GLOW_CYAN_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_PURPLE_STAINED_GLASS = BLOCKS.register("glow_purple_stained_glass", () -> ModBlocks.GLOW_PURPLE_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_BLUE_STAINED_GLASS = BLOCKS.register("glow_blue_stained_glass", () -> ModBlocks.GLOW_BLUE_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_BROWN_STAINED_GLASS = BLOCKS.register("glow_brown_stained_glass", () -> ModBlocks.GLOW_BROWN_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_GREEN_STAINED_GLASS = BLOCKS.register("glow_green_stained_glass", () -> ModBlocks.GLOW_GREEN_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_RED_STAINED_GLASS = BLOCKS.register("glow_red_stained_glass", () -> ModBlocks.GLOW_RED_STAINED_GLASS);
    public static final DeferredBlock<Block> GLOW_BLACK_STAINED_GLASS = BLOCKS.register("glow_black_stained_glass", () -> ModBlocks.GLOW_BLACK_STAINED_GLASS);
    //candle
    public static final DeferredBlock<Block> GLOW_WHITE_CANDLE = BLOCKS.register("glow_white_candle", () -> ModBlocks.GLOW_WHITE_CANDLE);
    public static final DeferredBlock<Block> GLOW_ORANGE_CANDLE = BLOCKS.register("glow_orange_candle", () -> ModBlocks.GLOW_ORANGE_CANDLE);
    public static final DeferredBlock<Block> GLOW_MAGENTA_CANDLE = BLOCKS.register("glow_magenta_candle", () -> ModBlocks.GLOW_MAGENTA_CANDLE);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_CANDLE = BLOCKS.register("glow_light_blue_candle", () -> ModBlocks.GLOW_LIGHT_BLUE_CANDLE);
    public static final DeferredBlock<Block> GLOW_YELLOW_CANDLE = BLOCKS.register("glow_yellow_candle", () -> ModBlocks.GLOW_YELLOW_CANDLE);
    public static final DeferredBlock<Block> GLOW_LIME_CANDLE = BLOCKS.register("glow_lime_candle", () -> ModBlocks.GLOW_LIME_CANDLE);
    public static final DeferredBlock<Block> GLOW_PINK_CANDLE = BLOCKS.register("glow_pink_candle", () -> ModBlocks.GLOW_PINK_CANDLE);
    public static final DeferredBlock<Block> GLOW_GRAY_CANDLE = BLOCKS.register("glow_gray_candle", () -> ModBlocks.GLOW_GRAY_CANDLE);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_CANDLE = BLOCKS.register("glow_light_gray_candle", () -> ModBlocks.GLOW_LIGHT_GRAY_CANDLE);
    public static final DeferredBlock<Block> GLOW_CYAN_CANDLE = BLOCKS.register("glow_cyan_candle", () -> ModBlocks.GLOW_CYAN_CANDLE);
    public static final DeferredBlock<Block> GLOW_PURPLE_CANDLE = BLOCKS.register("glow_purple_candle", () -> ModBlocks.GLOW_PURPLE_CANDLE);
    public static final DeferredBlock<Block> GLOW_BLUE_CANDLE = BLOCKS.register("glow_blue_candle", () -> ModBlocks.GLOW_BLUE_CANDLE);
    public static final DeferredBlock<Block> GLOW_BROWN_CANDLE = BLOCKS.register("glow_brown_candle", () -> ModBlocks.GLOW_BROWN_CANDLE);
    public static final DeferredBlock<Block> GLOW_GREEN_CANDLE = BLOCKS.register("glow_green_candle", () -> ModBlocks.GLOW_GREEN_CANDLE);
    public static final DeferredBlock<Block> GLOW_RED_CANDLE = BLOCKS.register("glow_red_candle", () -> ModBlocks.GLOW_RED_CANDLE);
    public static final DeferredBlock<Block> GLOW_BLACK_CANDLE = BLOCKS.register("glow_black_candle", () -> ModBlocks.GLOW_BLACK_CANDLE);
    //stained glass pane
    public static final DeferredBlock<Block> GLOW_WHITE_STAINED_GLASS_PANE = BLOCKS.register("glow_white_stained_glass_pane", () -> ModBlocks.GLOW_WHITE_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_ORANGE_STAINED_GLASS_PANE = BLOCKS.register("glow_orange_stained_glass_pane", () -> ModBlocks.GLOW_ORANGE_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_MAGENTA_STAINED_GLASS_PANE = BLOCKS.register("glow_magenta_stained_glass_pane", () -> ModBlocks.GLOW_MAGENTA_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_STAINED_GLASS_PANE = BLOCKS.register("glow_light_blue_stained_glass_pane", () -> ModBlocks.GLOW_LIGHT_BLUE_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_YELLOW_STAINED_GLASS_PANE = BLOCKS.register("glow_yellow_stained_glass_pane", () -> ModBlocks.GLOW_YELLOW_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_LIME_STAINED_GLASS_PANE = BLOCKS.register("glow_lime_stained_glass_pane", () -> ModBlocks.GLOW_LIME_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_PINK_STAINED_GLASS_PANE = BLOCKS.register("glow_pink_stained_glass_pane", () -> ModBlocks.GLOW_PINK_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_GRAY_STAINED_GLASS_PANE = BLOCKS.register("glow_gray_stained_glass_pane", () -> ModBlocks.GLOW_GRAY_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_STAINED_GLASS_PANE = BLOCKS.register("glow_light_gray_stained_glass_pane", () -> ModBlocks.GLOW_LIGHT_GRAY_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_CYAN_STAINED_GLASS_PANE = BLOCKS.register("glow_cyan_stained_glass_pane", () -> ModBlocks.GLOW_CYAN_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_PURPLE_STAINED_GLASS_PANE = BLOCKS.register("glow_purple_stained_glass_pane", () -> ModBlocks.GLOW_PURPLE_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_BLUE_STAINED_GLASS_PANE = BLOCKS.register("glow_blue_stained_glass_pane", () -> ModBlocks.GLOW_BLUE_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_BROWN_STAINED_GLASS_PANE = BLOCKS.register("glow_brown_stained_glass_pane", () -> ModBlocks.GLOW_BROWN_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_GREEN_STAINED_GLASS_PANE = BLOCKS.register("glow_green_stained_glass_pane", () -> ModBlocks.GLOW_GREEN_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_RED_STAINED_GLASS_PANE = BLOCKS.register("glow_red_stained_glass_pane", () -> ModBlocks.GLOW_RED_STAINED_GLASS_PANE);
    public static final DeferredBlock<Block> GLOW_BLACK_STAINED_GLASS_PANE = BLOCKS.register("glow_black_stained_glass_pane", () -> ModBlocks.GLOW_BLACK_STAINED_GLASS_PANE);
    //concrete
    public static final DeferredBlock<Block> GLOW_WHITE_CONCRETE = BLOCKS.register("glow_white_concrete", () -> ModBlocks.GLOW_WHITE_CONCRETE);
    public static final DeferredBlock<Block> GLOW_ORANGE_CONCRETE = BLOCKS.register("glow_orange_concrete", () -> ModBlocks.GLOW_ORANGE_CONCRETE);
    public static final DeferredBlock<Block> GLOW_MAGENTA_CONCRETE = BLOCKS.register("glow_magenta_concrete", () -> ModBlocks.GLOW_MAGENTA_CONCRETE);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_CONCRETE = BLOCKS.register("glow_light_blue_concrete", () -> ModBlocks.GLOW_LIGHT_BLUE_CONCRETE);
    public static final DeferredBlock<Block> GLOW_YELLOW_CONCRETE = BLOCKS.register("glow_yellow_concrete", () -> ModBlocks.GLOW_YELLOW_CONCRETE);
    public static final DeferredBlock<Block> GLOW_LIME_CONCRETE = BLOCKS.register("glow_lime_concrete", () -> ModBlocks.GLOW_LIME_CONCRETE);
    public static final DeferredBlock<Block> GLOW_PINK_CONCRETE = BLOCKS.register("glow_pink_concrete", () -> ModBlocks.GLOW_PINK_CONCRETE);
    public static final DeferredBlock<Block> GLOW_GRAY_CONCRETE = BLOCKS.register("glow_gray_concrete", () -> ModBlocks.GLOW_GRAY_CONCRETE);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_CONCRETE = BLOCKS.register("glow_light_gray_concrete", () -> ModBlocks.GLOW_LIGHT_GRAY_CONCRETE);
    public static final DeferredBlock<Block> GLOW_CYAN_CONCRETE = BLOCKS.register("glow_cyan_concrete", () -> ModBlocks.GLOW_CYAN_CONCRETE);
    public static final DeferredBlock<Block> GLOW_PURPLE_CONCRETE = BLOCKS.register("glow_purple_concrete", () -> ModBlocks.GLOW_PURPLE_CONCRETE);
    public static final DeferredBlock<Block> GLOW_BLUE_CONCRETE = BLOCKS.register("glow_blue_concrete", () -> ModBlocks.GLOW_BLUE_CONCRETE);
    public static final DeferredBlock<Block> GLOW_BROWN_CONCRETE = BLOCKS.register("glow_brown_concrete", () -> ModBlocks.GLOW_BROWN_CONCRETE);
    public static final DeferredBlock<Block> GLOW_GREEN_CONCRETE = BLOCKS.register("glow_green_concrete", () -> ModBlocks.GLOW_GREEN_CONCRETE);
    public static final DeferredBlock<Block> GLOW_RED_CONCRETE = BLOCKS.register("glow_red_concrete", () -> ModBlocks.GLOW_RED_CONCRETE);
    public static final DeferredBlock<Block> GLOW_BLACK_CONCRETE = BLOCKS.register("glow_black_concrete", () -> ModBlocks.GLOW_BLACK_CONCRETE);
    //glazed terracotta
    public static final DeferredBlock<Block> GLOW_WHITE_GLAZED_TERRACOTTA = BLOCKS.register("glow_white_glazed_terracotta", () -> ModBlocks.GLOW_WHITE_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_ORANGE_GLAZED_TERRACOTTA = BLOCKS.register("glow_orange_glazed_terracotta", () -> ModBlocks.GLOW_ORANGE_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_MAGENTA_GLAZED_TERRACOTTA = BLOCKS.register("glow_magenta_glazed_terracotta", () -> ModBlocks.GLOW_MAGENTA_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_GLAZED_TERRACOTTA = BLOCKS.register("glow_light_blue_glazed_terracotta", () -> ModBlocks.GLOW_LIGHT_BLUE_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_YELLOW_GLAZED_TERRACOTTA = BLOCKS.register("glow_yellow_glazed_terracotta", () -> ModBlocks.GLOW_YELLOW_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_LIME_GLAZED_TERRACOTTA = BLOCKS.register("glow_lime_glazed_terracotta", () -> ModBlocks.GLOW_LIME_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_PINK_GLAZED_TERRACOTTA = BLOCKS.register("glow_pink_glazed_terracotta", () -> ModBlocks.GLOW_PINK_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_GRAY_GLAZED_TERRACOTTA = BLOCKS.register("glow_gray_glazed_terracotta", () -> ModBlocks.GLOW_GRAY_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_GLAZED_TERRACOTTA = BLOCKS.register("glow_light_gray_glazed_terracotta", () -> ModBlocks.GLOW_LIGHT_GRAY_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_CYAN_GLAZED_TERRACOTTA = BLOCKS.register("glow_cyan_glazed_terracotta", () -> ModBlocks.GLOW_CYAN_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_PURPLE_GLAZED_TERRACOTTA = BLOCKS.register("glow_purple_glazed_terracotta", () -> ModBlocks.GLOW_PURPLE_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_BLUE_GLAZED_TERRACOTTA = BLOCKS.register("glow_blue_glazed_terracotta", () -> ModBlocks.GLOW_BLUE_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_BROWN_GLAZED_TERRACOTTA = BLOCKS.register("glow_brown_glazed_terracotta", () -> ModBlocks.GLOW_BROWN_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_GREEN_GLAZED_TERRACOTTA = BLOCKS.register("glow_green_glazed_terracotta", () -> ModBlocks.GLOW_GREEN_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_RED_GLAZED_TERRACOTTA = BLOCKS.register("glow_red_glazed_terracotta", () -> ModBlocks.GLOW_RED_GLAZED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_BLACK_GLAZED_TERRACOTTA = BLOCKS.register("glow_black_glazed_terracotta", () -> ModBlocks.GLOW_BLACK_GLAZED_TERRACOTTA);
    //terracotta
    public static final DeferredBlock<Block> GLOW_WHITE_TERRACOTTA = BLOCKS.register("glow_white_terracotta", () -> ModBlocks.GLOW_WHITE_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_ORANGE_TERRACOTTA = BLOCKS.register("glow_orange_terracotta", () -> ModBlocks.GLOW_ORANGE_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_MAGENTA_TERRACOTTA = BLOCKS.register("glow_magenta_terracotta", () -> ModBlocks.GLOW_MAGENTA_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("glow_light_blue_terracotta", () -> ModBlocks.GLOW_LIGHT_BLUE_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_YELLOW_TERRACOTTA = BLOCKS.register("glow_yellow_terracotta", () -> ModBlocks.GLOW_YELLOW_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_LIME_TERRACOTTA = BLOCKS.register("glow_lime_terracotta", () -> ModBlocks.GLOW_LIME_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_PINK_TERRACOTTA = BLOCKS.register("glow_pink_terracotta", () -> ModBlocks.GLOW_PINK_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_GRAY_TERRACOTTA = BLOCKS.register("glow_gray_terracotta", () -> ModBlocks.GLOW_GRAY_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("glow_light_gray_terracotta", () -> ModBlocks.GLOW_LIGHT_GRAY_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_CYAN_TERRACOTTA = BLOCKS.register("glow_cyan_terracotta", () -> ModBlocks.GLOW_CYAN_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_PURPLE_TERRACOTTA = BLOCKS.register("glow_purple_terracotta", () -> ModBlocks.GLOW_PURPLE_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_BLUE_TERRACOTTA = BLOCKS.register("glow_blue_terracotta", () -> ModBlocks.GLOW_BLUE_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_BROWN_TERRACOTTA = BLOCKS.register("glow_brown_terracotta", () -> ModBlocks.GLOW_BROWN_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_GREEN_TERRACOTTA = BLOCKS.register("glow_green_terracotta", () -> ModBlocks.GLOW_GREEN_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_RED_TERRACOTTA = BLOCKS.register("glow_red_terracotta", () -> ModBlocks.GLOW_RED_TERRACOTTA);
    public static final DeferredBlock<Block> GLOW_BLACK_TERRACOTTA = BLOCKS.register("glow_black_terracotta", () -> ModBlocks.GLOW_BLACK_TERRACOTTA);
    //concrete powder
    public static final DeferredBlock<Block> GLOW_WHITE_CONCRETE_POWDER = BLOCKS.register("glow_white_concrete_powder", () -> ModBlocks.GLOW_WHITE_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_ORANGE_CONCRETE_POWDER = BLOCKS.register("glow_orange_concrete_powder", () -> ModBlocks.GLOW_ORANGE_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_MAGENTA_CONCRETE_POWDER = BLOCKS.register("glow_magenta_concrete_powder", () -> ModBlocks.GLOW_MAGENTA_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_CONCRETE_POWDER = BLOCKS.register("glow_light_blue_concrete_powder", () -> ModBlocks.GLOW_LIGHT_BLUE_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_YELLOW_CONCRETE_POWDER = BLOCKS.register("glow_yellow_concrete_powder", () -> ModBlocks.GLOW_YELLOW_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_LIME_CONCRETE_POWDER = BLOCKS.register("glow_lime_concrete_powder", () -> ModBlocks.GLOW_LIME_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_PINK_CONCRETE_POWDER = BLOCKS.register("glow_pink_concrete_powder", () -> ModBlocks.GLOW_PINK_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_GRAY_CONCRETE_POWDER = BLOCKS.register("glow_gray_concrete_powder", () -> ModBlocks.GLOW_GRAY_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_CONCRETE_POWDER = BLOCKS.register("glow_light_gray_concrete_powder", () -> ModBlocks.GLOW_LIGHT_GRAY_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_CYAN_CONCRETE_POWDER = BLOCKS.register("glow_cyan_concrete_powder", () -> ModBlocks.GLOW_CYAN_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_PURPLE_CONCRETE_POWDER = BLOCKS.register("glow_purple_concrete_powder", () -> ModBlocks.GLOW_PURPLE_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_BLUE_CONCRETE_POWDER = BLOCKS.register("glow_blue_concrete_powder", () -> ModBlocks.GLOW_BLUE_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_BROWN_CONCRETE_POWDER = BLOCKS.register("glow_brown_concrete_powder", () -> ModBlocks.GLOW_BROWN_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_GREEN_CONCRETE_POWDER = BLOCKS.register("glow_green_concrete_powder", () -> ModBlocks.GLOW_GREEN_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_RED_CONCRETE_POWDER = BLOCKS.register("glow_red_concrete_powder", () -> ModBlocks.GLOW_RED_CONCRETE_POWDER);
    public static final DeferredBlock<Block> GLOW_BLACK_CONCRETE_POWDER = BLOCKS.register("glow_black_concrete_powder", () -> ModBlocks.GLOW_BLACK_CONCRETE_POWDER);
}
