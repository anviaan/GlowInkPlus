package net.anvian.glow_ink_plus;

import net.anvian.glow_ink_plus.core.ModTab;
import net.anvian.glow_ink_plus.core.registry.ModBlockRegistry;
import net.anvian.glow_ink_plus.core.registry.ModItemRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class GlowInkPlusNeoForge {
    public GlowInkPlusNeoForge(IEventBus eventBus) {
        Constants.LOG.info("Hello NeoForge world!");
        GlowInkPlusCommon.init();
        Constants.LOG.info("Registering blocks for " + Constants.MOD_NAME + "...");
        ModBlockRegistry.BLOCKS.register(eventBus);
        Constants.LOG.info("Registering items for " + Constants.MOD_NAME + "...");
        ModItemRegistry.ITEMS.register(eventBus);
        Constants.LOG.info("Registering creative tab for " + Constants.MOD_ID);
        ModTab.TABS.register(eventBus);
    }
}