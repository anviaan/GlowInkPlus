package net.anvian.glow_ink_plus.block;

import net.anvian.glow_ink_plus.GlowInkPlusMod;
import net.anvian.glow_ink_plus.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class ModBlocks {
    public static final Block GLOW_WHITE_WOOL = registerBlock("glow_white_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.WHITE)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_ORANGE_WOOL = registerBlock("glow_orange_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.ORANGE)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_MAGENTA_WOOL = registerBlock("glow_magenta_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.MAGENTA)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_LIGHT_BLUE_WOOL = registerBlock("glow_light_blue_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.LIGHT_BLUE)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_YELLOW_WOOL = registerBlock("glow_yellow_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.YELLOW)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_LIME_WOOL = registerBlock("glow_lime_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.LIME)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_PINK_WOOL = registerBlock("glow_pink_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.PINK)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_GRAY_WOOL = registerBlock("glow_gray_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.GRAY)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_LIGHT_GRAY_WOOL = registerBlock("glow_light_gray_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.LIGHT_GRAY)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_CYAN_WOOL = registerBlock("glow_cyan_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.CYAN)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_PURPLE_WOOL = registerBlock("glow_purple_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.PURPLE)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_BLUE_WOOL = registerBlock("glow_blue_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.BLUE)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_BROWN_WOOL = registerBlock("glow_brown_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.BROWN)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_GREEN_WOOL = registerBlock("glow_green_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.GREEN)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_RED_WOOL = registerBlock("glow_red_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.RED)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_BLACK_WOOL = registerBlock("glow_black_wool",
            new Block(FabricBlockSettings.of(Material.WOOL, MapColor.BLACK)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));

    public static boolean always(BlockState state, BlockView world, BlockPos pos) {return true;}

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(GlowInkPlusMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(GlowInkPlusMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.GLOW_INK_SAC)));
    }

    public static void registerModBlocks(){
        System.out.println("Registering ModBlocks for " + GlowInkPlusMod.MOD_ID);
    }
}
