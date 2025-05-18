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
        Constants.LOG.info("Hello NeoForge world!");
        GlowInkPlusCommon.init();

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Constants.LOG.info("Registering blocks for " + Constants.MOD_NAME + "...");
        ModBlockRegistry.BLOCKS.register(eventBus);

        Constants.LOG.info("Registering items for " + Constants.MOD_NAME + "...");
        ModItemRegistry.ITEMS.register(eventBus);

        Constants.LOG.info("Registering creative tab for " + Constants.MOD_ID);
        ModTab.CREATIVE_MODE_TAB.register(eventBus);
    }
}