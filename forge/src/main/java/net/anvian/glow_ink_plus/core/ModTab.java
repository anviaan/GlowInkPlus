package net.anvian.glow_ink_plus.core;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.registry.ModItemRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModTab {
    private ModTab() {}

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);
    static final RegistryObject<CreativeModeTab> TAB = TABS.register("tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.glow_ink_plus"))
            .icon(Items.GLOW_INK_SAC::getDefaultInstance)
            .build());

    @SubscribeEvent
    public static void onRegisterCreativeModeTabEvent(final BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTab() != ModTab.TAB.get())
            return;

        ModItemRegistry.ITEMS.getEntries().stream().map(RegistryObject::get).forEach(event::accept);
    }
}
