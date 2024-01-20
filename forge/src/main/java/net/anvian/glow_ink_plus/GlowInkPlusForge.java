package net.anvian.glow_ink_plus;

import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class GlowInkPlusForge {
    public GlowInkPlusForge() {
        Constants.LOG.info("Hello Forge world!");
        GlowInkPlusCommon.init();

    }
}