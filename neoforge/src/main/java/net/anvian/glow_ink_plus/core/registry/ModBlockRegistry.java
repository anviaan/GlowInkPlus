package net.anvian.glow_ink_plus.core.registry;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Constants.MOD_ID);

    //wool
    public static final DeferredBlock<Block> GLOW_WHITE_WOOL = BLOCKS.register(Constants.GLOW_WHITE_WOOL_ID, () -> ModBlocks.GLOW_WHITE_WOOL);
    public static final DeferredBlock<Block> GLOW_ORANGE_WOOL = BLOCKS.register(Constants.GLOW_ORANGE_WOOL_ID, () -> ModBlocks.GLOW_ORANGE_WOOL);
    public static final DeferredBlock<Block> GLOW_MAGENTA_WOOL = BLOCKS.register(Constants.GLOW_MAGENTA_WOOL_ID, () -> ModBlocks.GLOW_MAGENTA_WOOL);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_WOOL = BLOCKS.register(Constants.GLOW_LIGHT_BLUE_WOOL_ID, () -> ModBlocks.GLOW_LIGHT_BLUE_WOOL);
    public static final DeferredBlock<Block> GLOW_YELLOW_WOOL = BLOCKS.register(Constants.GLOW_YELLOW_WOOL_ID, () -> ModBlocks.GLOW_YELLOW_WOOL);
    public static final DeferredBlock<Block> GLOW_LIME_WOOL = BLOCKS.register(Constants.GLOW_LIME_WOOL_ID, () -> ModBlocks.GLOW_LIME_WOOL);
    public static final DeferredBlock<Block> GLOW_PINK_WOOL = BLOCKS.register(Constants.GLOW_PINK_WOOL_ID, () -> ModBlocks.GLOW_PINK_WOOL);
    public static final DeferredBlock<Block> GLOW_GRAY_WOOL = BLOCKS.register(Constants.GLOW_GRAY_WOOL_ID, () -> ModBlocks.GLOW_GRAY_WOOL);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_WOOL = BLOCKS.register(Constants.GLOW_LIGHT_GRAY_WOOL_ID, () -> ModBlocks.GLOW_LIGHT_GRAY_WOOL);
    public static final DeferredBlock<Block> GLOW_CYAN_WOOL = BLOCKS.register(Constants.GLOW_CYAN_WOOL_ID, () -> ModBlocks.GLOW_CYAN_WOOL);
    public static final DeferredBlock<Block> GLOW_PURPLE_WOOL = BLOCKS.register(Constants.GLOW_PURPLE_WOOL_ID, () -> ModBlocks.GLOW_PURPLE_WOOL);
    public static final DeferredBlock<Block> GLOW_BLUE_WOOL = BLOCKS.register(Constants.GLOW_BLUE_WOOL_ID, () -> ModBlocks.GLOW_BLUE_WOOL);
    public static final DeferredBlock<Block> GLOW_BROWN_WOOL = BLOCKS.register(Constants.GLOW_BROWN_WOOL_ID, () -> ModBlocks.GLOW_BROWN_WOOL);
    public static final DeferredBlock<Block> GLOW_GREEN_WOOL = BLOCKS.register(Constants.GLOW_GREEN_WOOL_ID, () -> ModBlocks.GLOW_GREEN_WOOL);
    public static final DeferredBlock<Block> GLOW_RED_WOOL = BLOCKS.register(Constants.GLOW_RED_WOOL_ID, () -> ModBlocks.GLOW_RED_WOOL);
    public static final DeferredBlock<Block> GLOW_BLACK_WOOL = BLOCKS.register(Constants.GLOW_BLACK_WOOL_ID, () -> ModBlocks.GLOW_BLACK_WOOL);

    //carpet
    public static final DeferredBlock<Block> GLOW_WHITE_CARPET = BLOCKS.register(Constants.GLOW_WHITE_CARPET_ID, () -> ModBlocks.GLOW_WHITE_CARPET);
    public static final DeferredBlock<Block> GLOW_ORANGE_CARPET = BLOCKS.register(Constants.GLOW_ORANGE_CARPET_ID, () -> ModBlocks.GLOW_ORANGE_CARPET);
    public static final DeferredBlock<Block> GLOW_MAGENTA_CARPET = BLOCKS.register(Constants.GLOW_MAGENTA_CARPET_ID, () -> ModBlocks.GLOW_MAGENTA_CARPET);
    public static final DeferredBlock<Block> GLOW_LIGHT_BLUE_CARPET = BLOCKS.register(Constants.GLOW_LIGHT_BLUE_CARPET_ID, () -> ModBlocks.GLOW_LIGHT_BLUE_CARPET);
    public static final DeferredBlock<Block> GLOW_YELLOW_CARPET = BLOCKS.register(Constants.GLOW_YELLOW_CARPET_ID, () -> ModBlocks.GLOW_YELLOW_CARPET);
    public static final DeferredBlock<Block> GLOW_LIME_CARPET = BLOCKS.register(Constants.GLOW_LIME_CARPET_ID, () -> ModBlocks.GLOW_LIME_CARPET);
    public static final DeferredBlock<Block> GLOW_PINK_CARPET = BLOCKS.register(Constants.GLOW_PINK_CARPET_ID, () -> ModBlocks.GLOW_PINK_CARPET);
    public static final DeferredBlock<Block> GLOW_GRAY_CARPET = BLOCKS.register(Constants.GLOW_GRAY_CARPET_ID, () -> ModBlocks.GLOW_GRAY_CARPET);
    public static final DeferredBlock<Block> GLOW_LIGHT_GRAY_CARPET = BLOCKS.register(Constants.GLOW_LIGHT_GRAY_CARPET_ID, () -> ModBlocks.GLOW_LIGHT_GRAY_CARPET);
    public static final DeferredBlock<Block> GLOW_CYAN_CARPET = BLOCKS.register(Constants.GLOW_CYAN_CARPET_ID, () -> ModBlocks.GLOW_CYAN_CARPET);
    public static final DeferredBlock<Block> GLOW_PURPLE_CARPET = BLOCKS.register(Constants.GLOW_PURPLE_CARPET_ID, () -> ModBlocks.GLOW_PURPLE_CARPET);
    public static final DeferredBlock<Block> GLOW_BLUE_CARPET = BLOCKS.register(Constants.GLOW_BLUE_CARPET_ID, () -> ModBlocks.GLOW_BLUE_CARPET);
    public static final DeferredBlock<Block> GLOW_BROWN_CARPET = BLOCKS.register(Constants.GLOW_BROWN_CARPET_ID, () -> ModBlocks.GLOW_BROWN_CARPET);
    public static final DeferredBlock<Block> GLOW_GREEN_CARPET = BLOCKS.register(Constants.GLOW_GREEN_CARPET_ID, () -> ModBlocks.GLOW_GREEN_CARPET);
    public static final DeferredBlock<Block> GLOW_RED_CARPET = BLOCKS.register(Constants.GLOW_RED_CARPET_ID, () -> ModBlocks.GLOW_RED_CARPET);
    public static final DeferredBlock<Block> GLOW_BLACK_CARPET = BLOCKS.register(Constants.GLOW_BLACK_CARPET_ID, () -> ModBlocks.GLOW_BLACK_CARPET);
}
