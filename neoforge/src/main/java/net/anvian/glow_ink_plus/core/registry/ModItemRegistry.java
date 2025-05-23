package net.anvian.glow_ink_plus.core.registry;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);

    //wool
    public static final DeferredItem<BlockItem> GLOW_WHITE_WOOL = ITEMS.register(Constants.GLOW_WHITE_WOOL_ID, () -> ModItems.GLOW_WHITE_WOOL);
    public static final DeferredItem<BlockItem> GLOW_ORANGE_WOOL = ITEMS.register(Constants.GLOW_ORANGE_WOOL_ID, () -> ModItems.GLOW_ORANGE_WOOL);
    public static final DeferredItem<BlockItem> GLOW_MAGENTA_WOOL = ITEMS.register(Constants.GLOW_MAGENTA_WOOL_ID, () -> ModItems.GLOW_MAGENTA_WOOL);
    public static final DeferredItem<BlockItem> GLOW_LIGHT_BLUE_WOOL = ITEMS.register(Constants.GLOW_LIGHT_BLUE_WOOL_ID, () -> ModItems.GLOW_LIGHT_BLUE_WOOL);
    public static final DeferredItem<BlockItem> GLOW_YELLOW_WOOL = ITEMS.register(Constants.GLOW_YELLOW_WOOL_ID, () -> ModItems.GLOW_YELLOW_WOOL);
    public static final DeferredItem<BlockItem> GLOW_LIME_WOOL = ITEMS.register(Constants.GLOW_LIME_WOOL_ID, () -> ModItems.GLOW_LIME_WOOL);
    public static final DeferredItem<BlockItem> GLOW_PINK_WOOL = ITEMS.register(Constants.GLOW_PINK_WOOL_ID, () -> ModItems.GLOW_PINK_WOOL);
    public static final DeferredItem<BlockItem> GLOW_GRAY_WOOL = ITEMS.register(Constants.GLOW_GRAY_WOOL_ID, () -> ModItems.GLOW_GRAY_WOOL);
    public static final DeferredItem<BlockItem> GLOW_LIGHT_GRAY_WOOL = ITEMS.register(Constants.GLOW_LIGHT_GRAY_WOOL_ID, () -> ModItems.GLOW_LIGHT_GRAY_WOOL);
    public static final DeferredItem<BlockItem> GLOW_CYAN_WOOL = ITEMS.register(Constants.GLOW_CYAN_WOOL_ID, () -> ModItems.GLOW_CYAN_WOOL);
    public static final DeferredItem<BlockItem> GLOW_PURPLE_WOOL = ITEMS.register(Constants.GLOW_PURPLE_WOOL_ID, () -> ModItems.GLOW_PURPLE_WOOL);
    public static final DeferredItem<BlockItem> GLOW_BLUE_WOOL = ITEMS.register(Constants.GLOW_BLUE_WOOL_ID, () -> ModItems.GLOW_BLUE_WOOL);
    public static final DeferredItem<BlockItem> GLOW_BROWN_WOOL = ITEMS.register(Constants.GLOW_BROWN_WOOL_ID, () -> ModItems.GLOW_BROWN_WOOL);
    public static final DeferredItem<BlockItem> GLOW_GREEN_WOOL = ITEMS.register(Constants.GLOW_GREEN_WOOL_ID, () -> ModItems.GLOW_GREEN_WOOL);
    public static final DeferredItem<BlockItem> GLOW_RED_WOOL = ITEMS.register(Constants.GLOW_RED_WOOL_ID, () -> ModItems.GLOW_RED_WOOL);
    public static final DeferredItem<BlockItem> GLOW_BLACK_WOOL = ITEMS.register(Constants.GLOW_BLACK_WOOL_ID, () -> ModItems.GLOW_BLACK_WOOL);

    //carpet
    public static final DeferredItem<BlockItem> GLOW_WHITE_CARPET = ITEMS.register(Constants.GLOW_WHITE_CARPET_ID, () -> ModItems.GLOW_WHITE_CARPET);
    public static final DeferredItem<BlockItem> GLOW_ORANGE_CARPET = ITEMS.register(Constants.GLOW_ORANGE_CARPET_ID, () -> ModItems.GLOW_ORANGE_CARPET);
    public static final DeferredItem<BlockItem> GLOW_MAGENTA_CARPET = ITEMS.register(Constants.GLOW_MAGENTA_CARPET_ID, () -> ModItems.GLOW_MAGENTA_CARPET);
    public static final DeferredItem<BlockItem> GLOW_LIGHT_BLUE_CARPET = ITEMS.register(Constants.GLOW_LIGHT_BLUE_CARPET_ID, () -> ModItems.GLOW_LIGHT_BLUE_CARPET);
    public static final DeferredItem<BlockItem> GLOW_YELLOW_CARPET = ITEMS.register(Constants.GLOW_YELLOW_CARPET_ID, () -> ModItems.GLOW_YELLOW_CARPET);
    public static final DeferredItem<BlockItem> GLOW_LIME_CARPET = ITEMS.register(Constants.GLOW_LIME_CARPET_ID, () -> ModItems.GLOW_LIME_CARPET);
    public static final DeferredItem<BlockItem> GLOW_PINK_CARPET = ITEMS.register(Constants.GLOW_PINK_CARPET_ID, () -> ModItems.GLOW_PINK_CARPET);
    public static final DeferredItem<BlockItem> GLOW_GRAY_CARPET = ITEMS.register(Constants.GLOW_GRAY_CARPET_ID, () -> ModItems.GLOW_GRAY_CARPET);
    public static final DeferredItem<BlockItem> GLOW_LIGHT_GRAY_CARPET = ITEMS.register(Constants.GLOW_LIGHT_GRAY_CARPET_ID, () -> ModItems.GLOW_LIGHT_GRAY_CARPET);
    public static final DeferredItem<BlockItem> GLOW_CYAN_CARPET = ITEMS.register(Constants.GLOW_CYAN_CARPET_ID, () -> ModItems.GLOW_CYAN_CARPET);
    public static final DeferredItem<BlockItem> GLOW_PURPLE_CARPET = ITEMS.register(Constants.GLOW_PURPLE_CARPET_ID, () -> ModItems.GLOW_PURPLE_CARPET);
    public static final DeferredItem<BlockItem> GLOW_BLUE_CARPET = ITEMS.register(Constants.GLOW_BLUE_CARPET_ID, () -> ModItems.GLOW_BLUE_CARPET);
    public static final DeferredItem<BlockItem> GLOW_BROWN_CARPET = ITEMS.register(Constants.GLOW_BROWN_CARPET_ID, () -> ModItems.GLOW_BROWN_CARPET);
    public static final DeferredItem<BlockItem> GLOW_GREEN_CARPET = ITEMS.register(Constants.GLOW_GREEN_CARPET_ID, () -> ModItems.GLOW_GREEN_CARPET);
    public static final DeferredItem<BlockItem> GLOW_RED_CARPET = ITEMS.register(Constants.GLOW_RED_CARPET_ID, () -> ModItems.GLOW_RED_CARPET);
    public static final DeferredItem<BlockItem> GLOW_BLACK_CARPET = ITEMS.register(Constants.GLOW_BLACK_CARPET_ID, () -> ModItems.GLOW_BLACK_CARPET);
}
