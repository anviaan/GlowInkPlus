package net.anvian.glow_ink_plus;

import net.fabricmc.api.ModInitializer;

public class GlowInkPlusFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOG.info("Hello Fabric world!");
        GlowInkPlusCommon.init();
    }
}
