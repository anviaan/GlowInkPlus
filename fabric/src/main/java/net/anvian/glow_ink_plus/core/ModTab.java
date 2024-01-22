package net.anvian.glow_ink_plus.core;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;

public class ModTab {
    public static void registerTab() {
        ResourceKey<CreativeModeTab> tab = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(Constants.MOD_ID, "tab"));
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, tab, FabricItemGroup.builder()
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
                })
                .build()
        );
    }
}