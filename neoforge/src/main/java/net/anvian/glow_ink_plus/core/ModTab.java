package net.anvian.glow_ink_plus.core;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import net.anvian.glow_ink_plus.core.registry.ModItemRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Unit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@EventBusSubscriber(modid = Constants.MOD_ID)
public class ModTab {
    private ModTab() {
    }

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB = TABS.register("tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.glow_ink_plus"))
            .icon(Items.GLOW_INK_SAC::getDefaultInstance)
            .build());

    @SubscribeEvent
    public static void onRegisterCreativeModeTabEvent(final BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() != ModTab.TAB.get())
            return;

        ModItemRegistry.ITEMS.getEntries().stream().map(DeferredHolder::get).forEach(event::accept);

        // Glowing Leather Armor
        event.accept(glowingStack(Items.LEATHER_HELMET));
        event.accept(glowingStack(Items.LEATHER_CHESTPLATE));
        event.accept(glowingStack(Items.LEATHER_LEGGINGS));
        event.accept(glowingStack(Items.LEATHER_BOOTS));

        // Glowing Banners
        event.accept(glowingStack(Items.WHITE_BANNER));
        event.accept(glowingStack(Items.ORANGE_BANNER));
        event.accept(glowingStack(Items.MAGENTA_BANNER));
        event.accept(glowingStack(Items.LIGHT_BLUE_BANNER));
        event.accept(glowingStack(Items.YELLOW_BANNER));
        event.accept(glowingStack(Items.LIME_BANNER));
        event.accept(glowingStack(Items.PINK_BANNER));
        event.accept(glowingStack(Items.GRAY_BANNER));
        event.accept(glowingStack(Items.LIGHT_GRAY_BANNER));
        event.accept(glowingStack(Items.CYAN_BANNER));
        event.accept(glowingStack(Items.PURPLE_BANNER));
        event.accept(glowingStack(Items.BLUE_BANNER));
        event.accept(glowingStack(Items.BROWN_BANNER));
        event.accept(glowingStack(Items.GREEN_BANNER));
        event.accept(glowingStack(Items.RED_BANNER));
        event.accept(glowingStack(Items.BLACK_BANNER));
    }

    private static ItemStack glowingStack(ItemLike item) {
        ItemStack stack = new ItemStack(item);
        stack.set(ModDataComponents.GLOWING, Unit.INSTANCE);
        return stack;
    }
}
