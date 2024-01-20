package net.anvian.glow_ink_plus;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class GlowInkPlusNeoForge {
    public GlowInkPlusNeoForge(IEventBus eventBus) {
        Constants.LOG.info("Hello NeoForge world!");
        GlowInkPlusCommon.init();
    }
}