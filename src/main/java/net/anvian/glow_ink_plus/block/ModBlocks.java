package net.anvian.glow_ink_plus.block;

import net.anvian.glow_ink_plus.GlowInkPlusMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DyedCarpetBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModBlocks {
    //wool
    public static final Block GLOW_WHITE_WOOL = registerBlock("glow_white_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.WHITE).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always).burnable()));
    public static final Block GLOW_ORANGE_WOOL = registerBlock("glow_orange_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.ORANGE).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_MAGENTA_WOOL = registerBlock("glow_magenta_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.MAGENTA).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_LIGHT_BLUE_WOOL = registerBlock("glow_light_blue_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_YELLOW_WOOL = registerBlock("glow_yellow_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.YELLOW).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_LIME_WOOL = registerBlock("glow_lime_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.LIME).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_PINK_WOOL = registerBlock("glow_pink_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PINK).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_GRAY_WOOL = registerBlock("glow_gray_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GRAY).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_LIGHT_GRAY_WOOL = registerBlock("glow_light_gray_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_CYAN_WOOL = registerBlock("glow_cyan_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.CYAN).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_PURPLE_WOOL = registerBlock("glow_purple_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PURPLE).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_BLUE_WOOL = registerBlock("glow_blue_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BLUE).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_BROWN_WOOL = registerBlock("glow_brown_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BROWN).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_GREEN_WOOL = registerBlock("glow_green_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.GREEN).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_RED_WOOL = registerBlock("glow_red_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.RED).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_BLACK_WOOL = registerBlock("glow_black_wool",
            new Block(FabricBlockSettings.create().mapColor(MapColor.BLACK).instrument(Instrument.GUITAR)
                    .strength(0.8f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));

    //carpet
    public static final Block GLOW_WHITE_CARPET = registerBlock("glow_white_carpet",
            new DyedCarpetBlock(DyeColor.WHITE, FabricBlockSettings.create().mapColor(MapColor.WHITE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_ORANGE_CARPET = registerBlock("glow_orange_carpet", 
            new DyedCarpetBlock(DyeColor.ORANGE, FabricBlockSettings.create().mapColor(MapColor.ORANGE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_MAGENTA_CARPET = registerBlock("glow_magenta_carpet", 
            new DyedCarpetBlock(DyeColor.MAGENTA, FabricBlockSettings.create().mapColor(MapColor.MAGENTA)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_LIGHT_BLUE_CARPET = registerBlock("glow_light_blue_carpet", 
            new DyedCarpetBlock(DyeColor.LIGHT_BLUE, FabricBlockSettings.create().mapColor(MapColor.LIGHT_BLUE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_YELLOW_CARPET = registerBlock("glow_yellow_carpet", 
            new DyedCarpetBlock(DyeColor.YELLOW, FabricBlockSettings.create().mapColor(MapColor.YELLOW)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_LIME_CARPET = registerBlock("glow_lime_carpet", 
            new DyedCarpetBlock(DyeColor.LIME, FabricBlockSettings.create().mapColor(MapColor.LIME)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_PINK_CARPET = registerBlock("glow_pink_carpet", 
            new DyedCarpetBlock(DyeColor.PINK, FabricBlockSettings.create().mapColor(MapColor.PINK)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_GRAY_CARPET = registerBlock("glow_gray_carpet", 
            new DyedCarpetBlock(DyeColor.GRAY, FabricBlockSettings.create().mapColor(MapColor.GRAY)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_LIGHT_GRAY_CARPET = registerBlock("glow_light_gray_carpet", 
            new DyedCarpetBlock(DyeColor.LIGHT_GRAY, FabricBlockSettings.create().mapColor(MapColor.LIGHT_GRAY)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_CYAN_CARPET = registerBlock("glow_cyan_carpet", 
            new DyedCarpetBlock(DyeColor.CYAN, FabricBlockSettings.create().mapColor(MapColor.CYAN)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_PURPLE_CARPET = registerBlock("glow_purple_carpet", 
            new DyedCarpetBlock(DyeColor.PURPLE, FabricBlockSettings.create().mapColor(MapColor.PURPLE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_BLUE_CARPET = registerBlock("glow_blue_carpet", 
            new DyedCarpetBlock(DyeColor.BLUE, FabricBlockSettings.create().mapColor(MapColor.BLUE)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_BROWN_CARPET = registerBlock("glow_brown_carpet", 
            new DyedCarpetBlock(DyeColor.BROWN, FabricBlockSettings.create().mapColor(MapColor.BROWN)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_GREEN_CARPET = registerBlock("glow_green_carpet", 
            new DyedCarpetBlock(DyeColor.GREEN, FabricBlockSettings.create().mapColor(MapColor.GREEN)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_RED_CARPET = registerBlock("glow_red_carpet", 
            new DyedCarpetBlock(DyeColor.RED, FabricBlockSettings.create().mapColor(MapColor.RED)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));
    public static final Block GLOW_BLACK_CARPET = registerBlock("glow_black_carpet", 
            new DyedCarpetBlock(DyeColor.BLACK, FabricBlockSettings.create().mapColor(MapColor.BLACK)
                    .strength(0.3f).sounds(BlockSoundGroup.WOOL).luminance(state -> 3)
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)));

    private static boolean always(BlockState state, BlockView world, BlockPos pos) {return true;}

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(GlowInkPlusMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        //hate it...
        //wool
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_WHITE_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_ORANGE_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_MAGENTA_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_LIGHT_BLUE_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_YELLOW_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_LIME_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_PINK_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_GRAY_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_LIGHT_GRAY_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_CYAN_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_PURPLE_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_BLUE_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_BROWN_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_GREEN_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_RED_WOOL));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_BLACK_WOOL));
        //carpet
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_WHITE_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_ORANGE_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_MAGENTA_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_LIGHT_BLUE_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_YELLOW_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_LIME_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_PINK_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_GRAY_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_LIGHT_GRAY_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_CYAN_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_PURPLE_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_BLUE_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_BROWN_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_GREEN_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_RED_CARPET));
        ItemGroupEvents.modifyEntriesEvent(GlowInkPlusMod.GLOW_INK_SAC).register(entries -> entries.add(GLOW_BLACK_CARPET));
        return Registry.register(Registries.ITEM, new Identifier(GlowInkPlusMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        System.out.println("Registering ModBlocks for " + GlowInkPlusMod.MOD_ID);
    }
}
