package net.anvian.glow_ink_plus;

import net.anvian.glow_ink_plus.core.ModTab;
import net.anvian.glow_ink_plus.core.registry.ModBlockRegistry;
import net.anvian.glow_ink_plus.core.registry.ModItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class GlowInkPlusForge {
    public GlowInkPlusForge() {
        Constants.LOG.info("Hello Forge world!");
        GlowInkPlusCommon.init();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Constants.LOG.info("Registering blocks for " + Constants.MOD_NAME + "...");
        ModBlockRegistry.BLOCKS.register(bus);
        Constants.LOG.info("Registering items for " + Constants.MOD_NAME + "...");
        ModItemRegistry.ITEMS.register(bus);
        Constants.LOG.info("Registering creative tab for " + Constants.MOD_ID);
        ModTab.TABS.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}