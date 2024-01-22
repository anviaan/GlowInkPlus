package net.anvian.glow_ink_plus.core.registry;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class ModItemRegistry {
    public static void registerItems() {
        Constants.LOG.info("Registering items for " + Constants.MOD_NAME + "...");

        //wool
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_white_wool"), ModItems.GLOW_WHITE_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_orange_wool"), ModItems.GLOW_ORANGE_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_magenta_wool"), ModItems.GLOW_MAGENTA_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_light_blue_wool"), ModItems.GLOW_LIGHT_BLUE_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_yellow_wool"), ModItems.GLOW_YELLOW_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_lime_wool"), ModItems.GLOW_LIME_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_pink_wool"), ModItems.GLOW_PINK_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_gray_wool"), ModItems.GLOW_GRAY_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_light_gray_wool"), ModItems.GLOW_LIGHT_GRAY_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_cyan_wool"), ModItems.GLOW_CYAN_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_purple_wool"), ModItems.GLOW_PURPLE_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_blue_wool"), ModItems.GLOW_BLUE_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_brown_wool"), ModItems.GLOW_BROWN_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_green_wool"), ModItems.GLOW_GREEN_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_red_wool"), ModItems.GLOW_RED_WOOL);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_black_wool"), ModItems.GLOW_BLACK_WOOL);

        //carpet
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_white_carpet"), ModItems.GLOW_WHITE_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_orange_carpet"), ModItems.GLOW_ORANGE_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_magenta_carpet"), ModItems.GLOW_MAGENTA_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_light_blue_carpet"), ModItems.GLOW_LIGHT_BLUE_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_yellow_carpet"), ModItems.GLOW_YELLOW_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_lime_carpet"), ModItems.GLOW_LIME_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_pink_carpet"), ModItems.GLOW_PINK_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_gray_carpet"), ModItems.GLOW_GRAY_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_light_gray_carpet"), ModItems.GLOW_LIGHT_GRAY_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_cyan_carpet"), ModItems.GLOW_CYAN_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_purple_carpet"), ModItems.GLOW_PURPLE_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_blue_carpet"), ModItems.GLOW_BLUE_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_brown_carpet"), ModItems.GLOW_BROWN_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_green_carpet"), ModItems.GLOW_GREEN_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_red_carpet"), ModItems.GLOW_RED_CARPET);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, "glow_black_carpet"), ModItems.GLOW_BLACK_CARPET);
    }
}
