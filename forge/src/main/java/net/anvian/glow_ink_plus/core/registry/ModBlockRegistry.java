package net.anvian.glow_ink_plus.core.registry;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Constants.MOD_ID);
    //wool

    public static final RegistryObject<Block> GLOW_WHITE_WOOL = BLOCKS.register("glow_white_wool", () -> ModBlocks.GLOW_WHITE_WOOL);
    public static final RegistryObject<Block> GLOW_ORANGE_WOOL = BLOCKS.register("glow_orange_wool", () -> ModBlocks.GLOW_ORANGE_WOOL);
    public static final RegistryObject<Block> GLOW_MAGENTA_WOOL = BLOCKS.register("glow_magenta_wool", () -> ModBlocks.GLOW_MAGENTA_WOOL);
    public static final RegistryObject<Block> GLOW_LIGHT_BLUE_WOOL = BLOCKS.register("glow_light_blue_wool", () -> ModBlocks.GLOW_LIGHT_BLUE_WOOL);
    public static final RegistryObject<Block> GLOW_YELLOW_WOOL = BLOCKS.register("glow_yellow_wool", () -> ModBlocks.GLOW_YELLOW_WOOL);
    public static final RegistryObject<Block> GLOW_LIME_WOOL = BLOCKS.register("glow_lime_wool", () -> ModBlocks.GLOW_LIME_WOOL);
    public static final RegistryObject<Block> GLOW_PINK_WOOL = BLOCKS.register("glow_pink_wool", () -> ModBlocks.GLOW_PINK_WOOL);
    public static final RegistryObject<Block> GLOW_GRAY_WOOL = BLOCKS.register("glow_gray_wool", () -> ModBlocks.GLOW_GRAY_WOOL);
    public static final RegistryObject<Block> GLOW_LIGHT_GRAY_WOOL = BLOCKS.register("glow_light_gray_wool", () -> ModBlocks.GLOW_LIGHT_GRAY_WOOL);
    public static final RegistryObject<Block> GLOW_CYAN_WOOL = BLOCKS.register("glow_cyan_wool", () -> ModBlocks.GLOW_CYAN_WOOL);
    public static final RegistryObject<Block> GLOW_PURPLE_WOOL = BLOCKS.register("glow_purple_wool", () -> ModBlocks.GLOW_PURPLE_WOOL);
    public static final RegistryObject<Block> GLOW_BLUE_WOOL = BLOCKS.register("glow_blue_wool", () -> ModBlocks.GLOW_BLUE_WOOL);
    public static final RegistryObject<Block> GLOW_BROWN_WOOL = BLOCKS.register("glow_brown_wool", () -> ModBlocks.GLOW_BROWN_WOOL);
    public static final RegistryObject<Block> GLOW_GREEN_WOOL = BLOCKS.register("glow_green_wool", () -> ModBlocks.GLOW_GREEN_WOOL);
    public static final RegistryObject<Block> GLOW_RED_WOOL = BLOCKS.register("glow_red_wool", () -> ModBlocks.GLOW_RED_WOOL);
    public static final RegistryObject<Block> GLOW_BLACK_WOOL = BLOCKS.register("glow_black_wool", () -> ModBlocks.GLOW_BLACK_WOOL);

    //carpet
    public static final RegistryObject<Block> GLOW_WHITE_CARPET = BLOCKS.register("glow_white_carpet", () -> ModBlocks.GLOW_WHITE_CARPET);
    public static final RegistryObject<Block> GLOW_ORANGE_CARPET = BLOCKS.register("glow_orange_carpet", () -> ModBlocks.GLOW_ORANGE_CARPET);
    public static final RegistryObject<Block> GLOW_MAGENTA_CARPET = BLOCKS.register("glow_magenta_carpet", () -> ModBlocks.GLOW_MAGENTA_CARPET);
    public static final RegistryObject<Block> GLOW_LIGHT_BLUE_CARPET = BLOCKS.register("glow_light_blue_carpet", () -> ModBlocks.GLOW_LIGHT_BLUE_CARPET);
    public static final RegistryObject<Block> GLOW_YELLOW_CARPET = BLOCKS.register("glow_yellow_carpet", () -> ModBlocks.GLOW_YELLOW_CARPET);
    public static final RegistryObject<Block> GLOW_LIME_CARPET = BLOCKS.register("glow_lime_carpet", () -> ModBlocks.GLOW_LIME_CARPET);
    public static final RegistryObject<Block> GLOW_PINK_CARPET = BLOCKS.register("glow_pink_carpet", () -> ModBlocks.GLOW_PINK_CARPET);
    public static final RegistryObject<Block> GLOW_GRAY_CARPET = BLOCKS.register("glow_gray_carpet", () -> ModBlocks.GLOW_GRAY_CARPET);
    public static final RegistryObject<Block> GLOW_LIGHT_GRAY_CARPET = BLOCKS.register("glow_light_gray_carpet", () -> ModBlocks.GLOW_LIGHT_GRAY_CARPET);
    public static final RegistryObject<Block> GLOW_CYAN_CARPET = BLOCKS.register("glow_cyan_carpet", () -> ModBlocks.GLOW_CYAN_CARPET);
    public static final RegistryObject<Block> GLOW_PURPLE_CARPET = BLOCKS.register("glow_purple_carpet", () -> ModBlocks.GLOW_PURPLE_CARPET);
    public static final RegistryObject<Block> GLOW_BLUE_CARPET = BLOCKS.register("glow_blue_carpet", () -> ModBlocks.GLOW_BLUE_CARPET);
    public static final RegistryObject<Block> GLOW_BROWN_CARPET = BLOCKS.register("glow_brown_carpet", () -> ModBlocks.GLOW_BROWN_CARPET);
    public static final RegistryObject<Block> GLOW_GREEN_CARPET = BLOCKS.register("glow_green_carpet", () -> ModBlocks.GLOW_GREEN_CARPET);
    public static final RegistryObject<Block> GLOW_RED_CARPET = BLOCKS.register("glow_red_carpet", () -> ModBlocks.GLOW_RED_CARPET);
    public static final RegistryObject<Block> GLOW_BLACK_CARPET = BLOCKS.register("glow_black_carpet", () -> ModBlocks.GLOW_BLACK_CARPET);
}
