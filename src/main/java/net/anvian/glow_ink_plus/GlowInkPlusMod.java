package net.anvian.glow_ink_plus;

import com.mojang.logging.LogUtils;
import net.anvian.glow_ink_plus.block.ModBlocks;
import net.anvian.glow_ink_plus.item.ModItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(GlowInkPlusMod.MOD_ID)
public class GlowInkPlusMod
{
    public static final String MOD_ID = "glow_ink_plus";
    private static final Logger LOGGER = LogUtils.getLogger();

    public GlowInkPlusMod() {
       IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
