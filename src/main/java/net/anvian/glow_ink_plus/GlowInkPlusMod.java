package net.anvian.glow_ink_plus;

import net.anvian.glow_ink_plus.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlowInkPlusMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("glow_ink_plus");
	public static final String MOD_ID = "glow_ink_plus";
	public static final RegistryKey<ItemGroup> GLOW_INK_SAC = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "glow_ink_sac"));
	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModBlocks.registerModBlocks();

		Registry.register(Registries.ITEM_GROUP, GlowInkPlusMod.GLOW_INK_SAC, FabricItemGroup.builder()
				.icon(() -> new ItemStack(Items.GLOW_INK_SAC))
				.displayName(Text.translatable("itemGroup.glow_ink_plus.glow_ink_sac"))
				.build());
	}
}
