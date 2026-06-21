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