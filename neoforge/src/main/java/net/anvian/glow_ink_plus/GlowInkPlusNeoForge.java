package net.anvian.glow_ink_plus;

import net.anvian.glow_ink_plus.core.ModTab;
import net.anvian.glow_ink_plus.core.registry.ModBlockRegistry;
import net.anvian.glow_ink_plus.core.registry.ModDataComponentRegistry;
import net.anvian.glow_ink_plus.core.registry.ModItemRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class GlowInkPlusNeoForge {
    public GlowInkPlusNeoForge(IEventBus eventBus) {
        GlowInkPlusCommon.init();

        ModDataComponentRegistry.DATA_COMPONENTS.register(eventBus);
        ModDataComponentRegistry.RECIPE_SERIALIZERS.register(eventBus);
        ModBlockRegistry.BLOCKS.register(eventBus);
        ModItemRegistry.ITEMS.register(eventBus);
        ModTab.TABS.register(eventBus);
    }
}