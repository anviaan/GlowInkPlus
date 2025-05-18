package net.anvian.glow_ink_plus;

import net.anvian.glow_ink_plus.core.ModTab;
import net.anvian.glow_ink_plus.core.registry.ModBlockRegistry;
import net.anvian.glow_ink_plus.core.registry.ModItemRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class GlowInkPlusForge {
    public GlowInkPlusForge() {
        GlowInkPlusCommon.init();

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlockRegistry.BLOCKS.register(eventBus);
        ModItemRegistry.ITEMS.register(eventBus);
        ModTab.CREATIVE_MODE_TAB.register(eventBus);
    }
}