package net.anvian.glow_ink_plus.core.registry;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class ModBlockRegistry {
    public static void registerBlocks() {
        //wool
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_white_wool"), ModBlocks.GLOW_WHITE_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_orange_wool"), ModBlocks.GLOW_ORANGE_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_magenta_wool"), ModBlocks.GLOW_MAGENTA_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_light_blue_wool"), ModBlocks.GLOW_LIGHT_BLUE_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_yellow_wool"), ModBlocks.GLOW_YELLOW_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_lime_wool"), ModBlocks.GLOW_LIME_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_pink_wool"), ModBlocks.GLOW_PINK_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_gray_wool"), ModBlocks.GLOW_GRAY_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_light_gray_wool"), ModBlocks.GLOW_LIGHT_GRAY_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_cyan_wool"), ModBlocks.GLOW_CYAN_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_purple_wool"), ModBlocks.GLOW_PURPLE_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_blue_wool"), ModBlocks.GLOW_BLUE_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_brown_wool"), ModBlocks.GLOW_BROWN_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_green_wool"), ModBlocks.GLOW_GREEN_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_red_wool"), ModBlocks.GLOW_RED_WOOL);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_black_wool"), ModBlocks.GLOW_BLACK_WOOL);

        //carpet
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_white_carpet"), ModBlocks.GLOW_WHITE_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_orange_carpet"), ModBlocks.GLOW_ORANGE_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_magenta_carpet"), ModBlocks.GLOW_MAGENTA_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_light_blue_carpet"), ModBlocks.GLOW_LIGHT_BLUE_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_yellow_carpet"), ModBlocks.GLOW_YELLOW_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_lime_carpet"), ModBlocks.GLOW_LIME_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_pink_carpet"), ModBlocks.GLOW_PINK_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_gray_carpet"), ModBlocks.GLOW_GRAY_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_light_gray_carpet"), ModBlocks.GLOW_LIGHT_GRAY_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_cyan_carpet"), ModBlocks.GLOW_CYAN_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_purple_carpet"), ModBlocks.GLOW_PURPLE_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_blue_carpet"), ModBlocks.GLOW_BLUE_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_brown_carpet"), ModBlocks.GLOW_BROWN_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_green_carpet"), ModBlocks.GLOW_GREEN_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_red_carpet"), ModBlocks.GLOW_RED_CARPET);
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(Constants.MOD_ID, "glow_black_carpet"), ModBlocks.GLOW_BLACK_CARPET);
    }
}
