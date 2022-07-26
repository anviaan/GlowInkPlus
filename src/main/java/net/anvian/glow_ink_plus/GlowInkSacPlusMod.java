package net.anvian.glow_ink_plus;

import net.anvian.glow_ink_plus.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlowInkSacPlusMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("glow_ink_plus");
	public static final String MOD_ID = "glow_ink_plus";
	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModBlocks.registerModBlocks();
	}
}
