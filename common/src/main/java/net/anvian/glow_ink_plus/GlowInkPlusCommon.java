package net.anvian.glow_ink_plus;

import net.anvian.glow_ink_plus.platform.Services;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;

public class GlowInkPlusCommon {
    public static void init() {
        Constants.LOG.info("Hello from Common init on {}! we are currently in a {} environment!", Services.PLATFORM.getPlatformName(), Services.PLATFORM.getEnvironmentName());
        Constants.LOG.info("The ID for diamonds is {}", BuiltInRegistries.ITEM.getKey(Items.DIAMOND));

        if (Services.PLATFORM.isModLoaded("glow_ink_plus")) {
            Constants.LOG.info("Hello to " + Constants.MOD_NAME);
        }
    }
}