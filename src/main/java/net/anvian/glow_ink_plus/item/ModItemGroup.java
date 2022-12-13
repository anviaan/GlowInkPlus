package net.anvian.glow_ink_plus.item;

import net.anvian.glow_ink_plus.GlowInkPlusMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup GLOW_INK_SAC =
            FabricItemGroup.builder(new Identifier(GlowInkPlusMod.MOD_ID, "glow_ink_sac"))
                    .icon(() -> new ItemStack(Items.GLOW_INK_SAC))
                    .build();
}
