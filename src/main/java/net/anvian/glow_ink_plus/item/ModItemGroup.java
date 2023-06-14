package net.anvian.glow_ink_plus.item;

import net.anvian.glow_ink_plus.GlowInkPlusMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItemGroup {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            GlowInkPlusMod.MOD_ID);

    public static RegistryObject<CreativeModeTab> GLOW_INK_SAC = CREATIVE_MODE_TAB.register("glow_ink_sac", () ->
            CreativeModeTab.builder()
                    .icon(()-> new ItemStack(Items.GLOW_INK_SAC))
                    .title(Component.translatable("itemGroup.glow_ink_sac"))
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
