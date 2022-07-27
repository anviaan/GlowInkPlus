package net.anvian.glow_ink_plus.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ModItemGroup {
    public static final CreativeModeTab GLOW_INK_SAC = new CreativeModeTab("glow_ink_sac") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.GLOW_INK_SAC.asItem());
        }
    };
}
