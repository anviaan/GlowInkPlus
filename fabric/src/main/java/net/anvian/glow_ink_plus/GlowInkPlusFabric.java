package net.anvian.glow_ink_plus;

import net.anvian.glow_ink_plus.core.ModTab;
import net.anvian.glow_ink_plus.core.registry.ModBlockRegistry;
import net.anvian.glow_ink_plus.core.registry.ModItemRegistry;
import net.fabricmc.api.ModInitializer;

public class GlowInkPlusFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        GlowInkPlusCommon.init();
        ModBlockRegistry.registerBlocks();
        ModItemRegistry.registerItems();
        ModTab.registerTab();
    }
}
