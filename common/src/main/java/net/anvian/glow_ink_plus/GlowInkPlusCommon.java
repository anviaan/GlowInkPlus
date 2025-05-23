package net.anvian.glow_ink_plus;

import net.anvian.anvianslib.util.LibUtil;

public class GlowInkPlusCommon {
    public static void init() {
        LibUtil.setupTelemetry(Constants.MOD_ID, Constants.MOD_VERSION);
    }
}