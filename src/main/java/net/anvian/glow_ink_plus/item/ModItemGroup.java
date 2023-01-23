package net.anvian.glow_ink_plus.item;

import net.anvian.glow_ink_plus.GlowInkPlusMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GlowInkPlusMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemGroup {
    public static CreativeModeTab GLOW_INK_SAC;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        GLOW_INK_SAC = event.registerCreativeModeTab(new ResourceLocation(GlowInkPlusMod.MOD_ID, "glow_ink_sac"),
                builder -> builder
                        .icon(()-> new ItemStack(Items.GLOW_INK_SAC))
                        .title(Component.translatable("itemGroup.glow_ink_sac"))
                        .build());
    }
}
