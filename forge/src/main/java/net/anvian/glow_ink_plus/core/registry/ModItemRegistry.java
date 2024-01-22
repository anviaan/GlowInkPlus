package net.anvian.glow_ink_plus.core.registry;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);

    public static final RegistryObject<Item> GLOW_WHITE_WOOL = ITEMS.register("glow_white_wool", () -> ModItems.GLOW_WHITE_WOOL);
    public static final RegistryObject<Item> GLOW_ORANGE_WOOL = ITEMS.register("glow_orange_wool", () -> ModItems.GLOW_ORANGE_WOOL);
    public static final RegistryObject<Item> GLOW_MAGENTA_WOOL = ITEMS.register("glow_magenta_wool", () -> ModItems.GLOW_MAGENTA_WOOL);
    public static final RegistryObject<Item> GLOW_LIGHT_BLUE_WOOL = ITEMS.register("glow_light_blue_wool", () -> ModItems.GLOW_LIGHT_BLUE_WOOL);
    public static final RegistryObject<Item> GLOW_YELLOW_WOOL = ITEMS.register("glow_yellow_wool", () -> ModItems.GLOW_YELLOW_WOOL);
    public static final RegistryObject<Item> GLOW_LIME_WOOL = ITEMS.register("glow_lime_wool", () -> ModItems.GLOW_LIME_WOOL);
    public static final RegistryObject<Item> GLOW_PINK_WOOL = ITEMS.register("glow_pink_wool", () -> ModItems.GLOW_PINK_WOOL);
    public static final RegistryObject<Item> GLOW_GRAY_WOOL = ITEMS.register("glow_gray_wool", () -> ModItems.GLOW_GRAY_WOOL);
    public static final RegistryObject<Item> GLOW_LIGHT_GRAY_WOOL = ITEMS.register("glow_light_gray_wool", () -> ModItems.GLOW_LIGHT_GRAY_WOOL);
    public static final RegistryObject<Item> GLOW_CYAN_WOOL = ITEMS.register("glow_cyan_wool", () -> ModItems.GLOW_CYAN_WOOL);
    public static final RegistryObject<Item> GLOW_PURPLE_WOOL = ITEMS.register("glow_purple_wool", () -> ModItems.GLOW_PURPLE_WOOL);
    public static final RegistryObject<Item> GLOW_BLUE_WOOL = ITEMS.register("glow_blue_wool", () -> ModItems.GLOW_BLUE_WOOL);
    public static final RegistryObject<Item> GLOW_BROWN_WOOL = ITEMS.register("glow_brown_wool", () -> ModItems.GLOW_BROWN_WOOL);
    public static final RegistryObject<Item> GLOW_GREEN_WOOL = ITEMS.register("glow_green_wool", () -> ModItems.GLOW_GREEN_WOOL);
    public static final RegistryObject<Item> GLOW_RED_WOOL = ITEMS.register("glow_red_wool", () -> ModItems.GLOW_RED_WOOL);
    public static final RegistryObject<Item> GLOW_BLACK_WOOL = ITEMS.register("glow_black_wool", () -> ModItems.GLOW_BLACK_WOOL);

    //carpet
    public static final RegistryObject<Item> GLOW_WHITE_CARPET = ITEMS.register("glow_white_carpet", () -> ModItems.GLOW_WHITE_CARPET);
    public static final RegistryObject<Item> GLOW_ORANGE_CARPET = ITEMS.register("glow_orange_carpet", () -> ModItems.GLOW_ORANGE_CARPET);
    public static final RegistryObject<Item> GLOW_MAGENTA_CARPET = ITEMS.register("glow_magenta_carpet", () -> ModItems.GLOW_MAGENTA_CARPET);
    public static final RegistryObject<Item> GLOW_LIGHT_BLUE_CARPET = ITEMS.register("glow_light_blue_carpet", () -> ModItems.GLOW_LIGHT_BLUE_CARPET);
    public static final RegistryObject<Item> GLOW_YELLOW_CARPET = ITEMS.register("glow_yellow_carpet", () -> ModItems.GLOW_YELLOW_CARPET);
    public static final RegistryObject<Item> GLOW_LIME_CARPET = ITEMS.register("glow_lime_carpet", () -> ModItems.GLOW_LIME_CARPET);
    public static final RegistryObject<Item> GLOW_PINK_CARPET = ITEMS.register("glow_pink_carpet", () -> ModItems.GLOW_PINK_CARPET);
    public static final RegistryObject<Item> GLOW_GRAY_CARPET = ITEMS.register("glow_gray_carpet", () -> ModItems.GLOW_GRAY_CARPET);
    public static final RegistryObject<Item> GLOW_LIGHT_GRAY_CARPET = ITEMS.register("glow_light_gray_carpet", () -> ModItems.GLOW_LIGHT_GRAY_CARPET);
    public static final RegistryObject<Item> GLOW_CYAN_CARPET = ITEMS.register("glow_cyan_carpet", () -> ModItems.GLOW_CYAN_CARPET);
    public static final RegistryObject<Item> GLOW_PURPLE_CARPET = ITEMS.register("glow_purple_carpet", () -> ModItems.GLOW_PURPLE_CARPET);
    public static final RegistryObject<Item> GLOW_BLUE_CARPET = ITEMS.register("glow_blue_carpet", () -> ModItems.GLOW_BLUE_CARPET);
    public static final RegistryObject<Item> GLOW_BROWN_CARPET = ITEMS.register("glow_brown_carpet", () -> ModItems.GLOW_BROWN_CARPET);
    public static final RegistryObject<Item> GLOW_GREEN_CARPET = ITEMS.register("glow_green_carpet", () -> ModItems.GLOW_GREEN_CARPET);
    public static final RegistryObject<Item> GLOW_RED_CARPET = ITEMS.register("glow_red_carpet", () -> ModItems.GLOW_RED_CARPET);
    public static final RegistryObject<Item> GLOW_BLACK_CARPET = ITEMS.register("glow_black_carpet", () -> ModItems.GLOW_BLACK_CARPET);
}
