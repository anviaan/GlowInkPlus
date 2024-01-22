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
        ModBlockRegistry.BLOCKS.register(eventBus);
        ModItemRegistry.ITEMS.register(eventBus);
        ModTab.TABS.register(eventBus);
    }
}