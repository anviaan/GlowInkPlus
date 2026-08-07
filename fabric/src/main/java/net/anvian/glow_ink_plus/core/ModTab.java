package net.anvian.glow_ink_plus.core;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import net.anvian.glow_ink_plus.core.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.Unit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModTab {
    private static ItemStack glowingStack(net.minecraft.world.level.ItemLike item) {
        ItemStack stack = new ItemStack(item);
        stack.set(ModDataComponents.GLOWING, Unit.INSTANCE);
        return stack;
    }

    public static void registerTab() {
        Constants.LOG.info("Registering creative tab for " + Constants.MOD_ID);

        ResourceKey<CreativeModeTab> tab = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Constants.MOD_ID, "tab"));
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, tab, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                .icon(Items.GLOW_INK_SAC::getDefaultInstance)
                .title(Component.translatable("itemGroup.glow_ink_plus"))
                .displayItems((context, entries) -> {
                    // Wool
                    entries.accept(ModItems.GLOW_WHITE_WOOL);
                    entries.accept(ModItems.GLOW_ORANGE_WOOL);
                    entries.accept(ModItems.GLOW_MAGENTA_WOOL);
                    entries.accept(ModItems.GLOW_LIGHT_BLUE_WOOL);
                    entries.accept(ModItems.GLOW_YELLOW_WOOL);
                    entries.accept(ModItems.GLOW_LIME_WOOL);
                    entries.accept(ModItems.GLOW_PINK_WOOL);
                    entries.accept(ModItems.GLOW_GRAY_WOOL);
                    entries.accept(ModItems.GLOW_LIGHT_GRAY_WOOL);
                    entries.accept(ModItems.GLOW_CYAN_WOOL);
                    entries.accept(ModItems.GLOW_PURPLE_WOOL);
                    entries.accept(ModItems.GLOW_BLUE_WOOL);
                    entries.accept(ModItems.GLOW_BROWN_WOOL);
                    entries.accept(ModItems.GLOW_GREEN_WOOL);
                    entries.accept(ModItems.GLOW_RED_WOOL);
                    entries.accept(ModItems.GLOW_BLACK_WOOL);

                    // Carpet
                    entries.accept(ModItems.GLOW_WHITE_CARPET);
                    entries.accept(ModItems.GLOW_ORANGE_CARPET);
                    entries.accept(ModItems.GLOW_MAGENTA_CARPET);
                    entries.accept(ModItems.GLOW_LIGHT_BLUE_CARPET);
                    entries.accept(ModItems.GLOW_YELLOW_CARPET);
                    entries.accept(ModItems.GLOW_LIME_CARPET);
                    entries.accept(ModItems.GLOW_PINK_CARPET);
                    entries.accept(ModItems.GLOW_GRAY_CARPET);
                    entries.accept(ModItems.GLOW_LIGHT_GRAY_CARPET);
                    entries.accept(ModItems.GLOW_CYAN_CARPET);
                    entries.accept(ModItems.GLOW_PURPLE_CARPET);
                    entries.accept(ModItems.GLOW_BLUE_CARPET);
                    entries.accept(ModItems.GLOW_BROWN_CARPET);
                    entries.accept(ModItems.GLOW_GREEN_CARPET);
                    entries.accept(ModItems.GLOW_RED_CARPET);
                    entries.accept(ModItems.GLOW_BLACK_CARPET);

                    // Glow Beds
                    entries.accept(ModItems.GLOW_WHITE_BED);
                    entries.accept(ModItems.GLOW_ORANGE_BED);
                    entries.accept(ModItems.GLOW_MAGENTA_BED);
                    entries.accept(ModItems.GLOW_LIGHT_BLUE_BED);
                    entries.accept(ModItems.GLOW_YELLOW_BED);
                    entries.accept(ModItems.GLOW_LIME_BED);
                    entries.accept(ModItems.GLOW_PINK_BED);
                    entries.accept(ModItems.GLOW_GRAY_BED);
                    entries.accept(ModItems.GLOW_LIGHT_GRAY_BED);
                    entries.accept(ModItems.GLOW_CYAN_BED);
                    entries.accept(ModItems.GLOW_PURPLE_BED);
                    entries.accept(ModItems.GLOW_BLUE_BED);
                    entries.accept(ModItems.GLOW_BROWN_BED);
                    entries.accept(ModItems.GLOW_GREEN_BED);
                    entries.accept(ModItems.GLOW_RED_BED);
                    entries.accept(ModItems.GLOW_BLACK_BED);

                    // Glowing Glass
                    entries.accept(ModItems.GLOW_WHITE_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_ORANGE_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_MAGENTA_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_LIGHT_BLUE_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_YELLOW_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_LIME_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_PINK_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_GRAY_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_LIGHT_GRAY_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_CYAN_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_PURPLE_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_BLUE_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_BROWN_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_GREEN_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_RED_STAINED_GLASS);
                    entries.accept(ModItems.GLOW_BLACK_STAINED_GLASS);


                    // Glowing Candles
                    entries.accept(ModItems.GLOW_WHITE_CANDLE);
                    entries.accept(ModItems.GLOW_ORANGE_CANDLE);
                    entries.accept(ModItems.GLOW_MAGENTA_CANDLE);
                    entries.accept(ModItems.GLOW_LIGHT_BLUE_CANDLE);
                    entries.accept(ModItems.GLOW_YELLOW_CANDLE);
                    entries.accept(ModItems.GLOW_LIME_CANDLE);
                    entries.accept(ModItems.GLOW_PINK_CANDLE);
                    entries.accept(ModItems.GLOW_GRAY_CANDLE);
                    entries.accept(ModItems.GLOW_LIGHT_GRAY_CANDLE);
                    entries.accept(ModItems.GLOW_CYAN_CANDLE);
                    entries.accept(ModItems.GLOW_PURPLE_CANDLE);
                    entries.accept(ModItems.GLOW_BLUE_CANDLE);
                    entries.accept(ModItems.GLOW_BROWN_CANDLE);
                    entries.accept(ModItems.GLOW_GREEN_CANDLE);
                    entries.accept(ModItems.GLOW_RED_CANDLE);
                    entries.accept(ModItems.GLOW_BLACK_CANDLE);

                    // Glowing Glass Panes
                    entries.accept(ModItems.GLOW_WHITE_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_ORANGE_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_MAGENTA_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_LIGHT_BLUE_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_YELLOW_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_LIME_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_PINK_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_GRAY_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_LIGHT_GRAY_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_CYAN_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_PURPLE_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_BLUE_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_BROWN_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_GREEN_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_RED_STAINED_GLASS_PANE);
                    entries.accept(ModItems.GLOW_BLACK_STAINED_GLASS_PANE);

                    // Glowing Concrete
                    entries.accept(ModItems.GLOW_WHITE_CONCRETE);
                    entries.accept(ModItems.GLOW_ORANGE_CONCRETE);
                    entries.accept(ModItems.GLOW_MAGENTA_CONCRETE);
                    entries.accept(ModItems.GLOW_LIGHT_BLUE_CONCRETE);
                    entries.accept(ModItems.GLOW_YELLOW_CONCRETE);
                    entries.accept(ModItems.GLOW_LIME_CONCRETE);
                    entries.accept(ModItems.GLOW_PINK_CONCRETE);
                    entries.accept(ModItems.GLOW_GRAY_CONCRETE);
                    entries.accept(ModItems.GLOW_LIGHT_GRAY_CONCRETE);
                    entries.accept(ModItems.GLOW_CYAN_CONCRETE);
                    entries.accept(ModItems.GLOW_PURPLE_CONCRETE);
                    entries.accept(ModItems.GLOW_BLUE_CONCRETE);
                    entries.accept(ModItems.GLOW_BROWN_CONCRETE);
                    entries.accept(ModItems.GLOW_GREEN_CONCRETE);
                    entries.accept(ModItems.GLOW_RED_CONCRETE);
                    entries.accept(ModItems.GLOW_BLACK_CONCRETE);

                    // Glowing Glazed Terracotta
                    entries.accept(ModItems.GLOW_WHITE_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_ORANGE_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_MAGENTA_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_LIGHT_BLUE_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_YELLOW_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_LIME_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_PINK_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_GRAY_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_LIGHT_GRAY_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_CYAN_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_PURPLE_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_BLUE_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_BROWN_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_GREEN_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_RED_GLAZED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_BLACK_GLAZED_TERRACOTTA);

                    // Glowing Terracotta
                    entries.accept(ModItems.GLOW_WHITE_TERRACOTTA);
                    entries.accept(ModItems.GLOW_ORANGE_TERRACOTTA);
                    entries.accept(ModItems.GLOW_MAGENTA_TERRACOTTA);
                    entries.accept(ModItems.GLOW_LIGHT_BLUE_TERRACOTTA);
                    entries.accept(ModItems.GLOW_YELLOW_TERRACOTTA);
                    entries.accept(ModItems.GLOW_LIME_TERRACOTTA);
                    entries.accept(ModItems.GLOW_PINK_TERRACOTTA);
                    entries.accept(ModItems.GLOW_GRAY_TERRACOTTA);
                    entries.accept(ModItems.GLOW_LIGHT_GRAY_TERRACOTTA);
                    entries.accept(ModItems.GLOW_CYAN_TERRACOTTA);
                    entries.accept(ModItems.GLOW_PURPLE_TERRACOTTA);
                    entries.accept(ModItems.GLOW_BLUE_TERRACOTTA);
                    entries.accept(ModItems.GLOW_BROWN_TERRACOTTA);
                    entries.accept(ModItems.GLOW_GREEN_TERRACOTTA);
                    entries.accept(ModItems.GLOW_RED_TERRACOTTA);
                    entries.accept(ModItems.GLOW_BLACK_TERRACOTTA);

                    // Glowing Concrete Powder
                    entries.accept(ModItems.GLOW_WHITE_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_ORANGE_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_MAGENTA_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_LIGHT_BLUE_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_YELLOW_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_LIME_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_PINK_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_GRAY_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_LIGHT_GRAY_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_CYAN_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_PURPLE_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_BLUE_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_BROWN_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_GREEN_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_RED_CONCRETE_POWDER);
                    entries.accept(ModItems.GLOW_BLACK_CONCRETE_POWDER);

                    // Glowing Leather Armor
                    entries.accept(glowingStack(Items.LEATHER_HELMET));
                    entries.accept(glowingStack(Items.LEATHER_CHESTPLATE));
                    entries.accept(glowingStack(Items.LEATHER_LEGGINGS));
                    entries.accept(glowingStack(Items.LEATHER_BOOTS));

                    // Glowing Banners
                    Items.BANNER.forEach(banner -> entries.accept(glowingStack(banner)));
                })
                .build()
        );
    }
}