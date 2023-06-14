package net.anvian.glow_ink_plus;

import com.mojang.logging.LogUtils;
import net.anvian.glow_ink_plus.block.ModBlocks;
import net.anvian.glow_ink_plus.item.ModItemGroup;
import net.anvian.glow_ink_plus.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
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

       ModItemGroup.register(eventBus);

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::addCreative);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event){
        if (event.getTab() == ModItemGroup.GLOW_INK_SAC.get()){
            event.accept(ModBlocks.GLOW_WHITE_WOOL);
            event.accept(ModBlocks.GLOW_ORANGE_WOOL);
            event.accept(ModBlocks.GLOW_MAGENTA_WOOL);
            event.accept(ModBlocks.GLOW_LIGHT_BLUE_WOOL);
            event.accept(ModBlocks.GLOW_YELLOW_WOOL);
            event.accept(ModBlocks.GLOW_LIME_WOOL);
            event.accept(ModBlocks.GLOW_PINK_WOOL);
            event.accept(ModBlocks.GLOW_GRAY_WOOL);
            event.accept(ModBlocks.GLOW_LIGHT_GRAY_WOOL);
            event.accept(ModBlocks.GLOW_CYAN_WOOL);
            event.accept(ModBlocks.GLOW_PURPLE_WOOL);
            event.accept(ModBlocks.GLOW_BLUE_WOOL); 
            event.accept(ModBlocks.GLOW_BROWN_WOOL);
            event.accept(ModBlocks.GLOW_GREEN_WOOL);
            event.accept(ModBlocks.GLOW_RED_WOOL);
            event.accept(ModBlocks.GLOW_BLACK_WOOL);

            //carpets
            event.accept(ModBlocks.GLOW_WHITE_CARPET);
            event.accept(ModBlocks.GLOW_ORANGE_CARPET);
            event.accept(ModBlocks.GLOW_MAGENTA_CARPET);
            event.accept(ModBlocks.GLOW_LIGHT_BLUE_CARPET);
            event.accept(ModBlocks.GLOW_YELLOW_CARPET);
            event.accept(ModBlocks.GLOW_LIME_CARPET);
            event.accept(ModBlocks.GLOW_PINK_CARPET);
            event.accept(ModBlocks.GLOW_GRAY_CARPET);
            event.accept(ModBlocks.GLOW_LIGHT_GRAY_CARPET);
            event.accept(ModBlocks.GLOW_CYAN_CARPET);
            event.accept(ModBlocks.GLOW_PURPLE_CARPET);
            event.accept(ModBlocks.GLOW_BLUE_CARPET);
            event.accept(ModBlocks.GLOW_BROWN_CARPET);
            event.accept(ModBlocks.GLOW_GREEN_CARPET);
            event.accept(ModBlocks.GLOW_RED_CARPET);
            event.accept(ModBlocks.GLOW_BLACK_CARPET);
        }

    }
}
