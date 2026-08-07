package net.anvian.glow_ink_plus.core.block;

import net.anvian.glow_ink_plus.Constants;
import net.anvian.glow_ink_plus.core.block.custom.GlowConcretePowderBlock;
import net.anvian.glow_ink_plus.core.block.custom.GlowStainedGlassBlock;
import net.anvian.glow_ink_plus.core.block.custom.GlowStainedGlassPaneBlock;
import net.anvian.glow_ink_plus.core.block.custom.ModWoolCarpetBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CandleBlock;
import net.minecraft.world.level.block.GlazedTerracottaBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public final class ModBlocks {
    //wool
    public static final Block GLOW_WHITE_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_WHITE_WOOL_ID)));
    public static final Block GLOW_ORANGE_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_ORANGE_WOOL_ID)));
    public static final Block GLOW_MAGENTA_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_MAGENTA_WOOL_ID)));
    public static final Block GLOW_LIGHT_BLUE_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_LIGHT_BLUE_WOOL_ID)));
    public static final Block GLOW_YELLOW_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_YELLOW_WOOL_ID)));
    public static final Block GLOW_LIME_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_LIME_WOOL_ID)));
    public static final Block GLOW_PINK_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_PINK_WOOL_ID)));
    public static final Block GLOW_GRAY_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_GRAY_WOOL_ID)));
    public static final Block GLOW_LIGHT_GRAY_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_LIGHT_GRAY_WOOL_ID)));
    public static final Block GLOW_CYAN_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_CYAN_WOOL_ID)));
    public static final Block GLOW_PURPLE_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_PURPLE_WOOL_ID)));
    public static final Block GLOW_BLUE_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_BLUE_WOOL_ID)));
    public static final Block GLOW_BROWN_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_BROWN_WOOL_ID)));
    public static final Block GLOW_GREEN_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_GREEN_WOOL_ID)));
    public static final Block GLOW_RED_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_RED_WOOL_ID)));
    public static final Block GLOW_BLACK_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_BLACK_WOOL_ID)));

    //carpet
    public static final Block GLOW_WHITE_CARPET = new ModWoolCarpetBlock(
            DyeColor.WHITE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_WHITE_CARPET_ID)));
    public static final Block GLOW_ORANGE_CARPET = new ModWoolCarpetBlock(
            DyeColor.ORANGE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_ORANGE_CARPET_ID)));
    public static final Block GLOW_MAGENTA_CARPET = new ModWoolCarpetBlock(
            DyeColor.MAGENTA,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_MAGENTA_CARPET_ID)));
    public static final Block GLOW_LIGHT_BLUE_CARPET = new ModWoolCarpetBlock(
            DyeColor.LIGHT_BLUE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_LIGHT_BLUE_CARPET_ID)));
    public static final Block GLOW_YELLOW_CARPET = new ModWoolCarpetBlock(
            DyeColor.YELLOW,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_YELLOW_CARPET_ID)));
    public static final Block GLOW_LIME_CARPET = new ModWoolCarpetBlock(
            DyeColor.LIME,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_LIME_CARPET_ID)));
    public static final Block GLOW_PINK_CARPET = new ModWoolCarpetBlock(
            DyeColor.PINK,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_PINK_CARPET_ID)));
    public static final Block GLOW_GRAY_CARPET = new ModWoolCarpetBlock(
            DyeColor.GRAY,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_GRAY_CARPET_ID)));
    public static final Block GLOW_LIGHT_GRAY_CARPET = new ModWoolCarpetBlock(
            DyeColor.LIGHT_GRAY,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_LIGHT_GRAY_CARPET_ID)));
    public static final Block GLOW_CYAN_CARPET = new ModWoolCarpetBlock(
            DyeColor.CYAN,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_CYAN_CARPET_ID)));
    public static final Block GLOW_PURPLE_CARPET = new ModWoolCarpetBlock(
            DyeColor.PURPLE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_PURPLE_CARPET_ID)));
    public static final Block GLOW_BLUE_CARPET = new ModWoolCarpetBlock(
            DyeColor.BLUE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_BLUE_CARPET_ID)));
    public static final Block GLOW_BROWN_CARPET = new ModWoolCarpetBlock(
            DyeColor.BROWN,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_BROWN_CARPET_ID)));
    public static final Block GLOW_GREEN_CARPET = new ModWoolCarpetBlock(
            DyeColor.GREEN,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_GREEN_CARPET_ID)));
    public static final Block GLOW_RED_CARPET = new ModWoolCarpetBlock(
            DyeColor.RED,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_RED_CARPET_ID)));
    public static final Block GLOW_BLACK_CARPET = new ModWoolCarpetBlock(
            DyeColor.BLACK,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .ignitedByLava()
                    .setId(key(Constants.GLOW_BLACK_CARPET_ID)));

    //bed
    public static final Block GLOW_WHITE_BED = new BedBlock(
            DyeColor.WHITE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_WHITE_BED_ID)));
    public static final Block GLOW_ORANGE_BED = new BedBlock(
            DyeColor.ORANGE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_ORANGE_BED_ID)));
    public static final Block GLOW_MAGENTA_BED = new BedBlock(
            DyeColor.MAGENTA,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_MAGENTA_BED_ID)));
    public static final Block GLOW_LIGHT_BLUE_BED = new BedBlock(
            DyeColor.LIGHT_BLUE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_BLUE_BED_ID)));
    public static final Block GLOW_YELLOW_BED = new BedBlock(
            DyeColor.YELLOW,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_YELLOW_BED_ID)));
    public static final Block GLOW_LIME_BED = new BedBlock(
            DyeColor.LIME,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIME_BED_ID)));
    public static final Block GLOW_PINK_BED = new BedBlock(
            DyeColor.PINK,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PINK_BED_ID)));
    public static final Block GLOW_GRAY_BED = new BedBlock(
            DyeColor.GRAY,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GRAY_BED_ID)));
    public static final Block GLOW_LIGHT_GRAY_BED = new BedBlock(
            DyeColor.LIGHT_GRAY,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_GRAY_BED_ID)));
    public static final Block GLOW_CYAN_BED = new BedBlock(
            DyeColor.CYAN,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_CYAN_BED_ID)));
    public static final Block GLOW_PURPLE_BED = new BedBlock(
            DyeColor.PURPLE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PURPLE_BED_ID)));
    public static final Block GLOW_BLUE_BED = new BedBlock(
            DyeColor.BLUE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLUE_BED_ID)));
    public static final Block GLOW_BROWN_BED = new BedBlock(
            DyeColor.BROWN,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BROWN_BED_ID)));
    public static final Block GLOW_GREEN_BED = new BedBlock(
            DyeColor.GREEN,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GREEN_BED_ID)));
    public static final Block GLOW_RED_BED = new BedBlock(
            DyeColor.RED,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_RED_BED_ID)));
    public static final Block GLOW_BLACK_BED = new BedBlock(
            DyeColor.BLACK,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_BED)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLACK_BED_ID)));

    //concrete
    public static final Block GLOW_WHITE_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_WHITE_CONCRETE_ID)));
    public static final Block GLOW_ORANGE_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_ORANGE_CONCRETE_ID)));
    public static final Block GLOW_MAGENTA_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_MAGENTA_CONCRETE_ID)));
    public static final Block GLOW_LIGHT_BLUE_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_BLUE_CONCRETE_ID)));
    public static final Block GLOW_YELLOW_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_YELLOW_CONCRETE_ID)));
    public static final Block GLOW_LIME_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIME_CONCRETE_ID)));
    public static final Block GLOW_PINK_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PINK_CONCRETE_ID)));
    public static final Block GLOW_GRAY_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GRAY_CONCRETE_ID)));
    public static final Block GLOW_LIGHT_GRAY_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_GRAY_CONCRETE_ID)));
    public static final Block GLOW_CYAN_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_CYAN_CONCRETE_ID)));
    public static final Block GLOW_PURPLE_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PURPLE_CONCRETE_ID)));
    public static final Block GLOW_BLUE_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLUE_CONCRETE_ID)));
    public static final Block GLOW_BROWN_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BROWN_CONCRETE_ID)));
    public static final Block GLOW_GREEN_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GREEN_CONCRETE_ID)));
    public static final Block GLOW_RED_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_RED_CONCRETE_ID)));
    public static final Block GLOW_BLACK_CONCRETE = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLACK_CONCRETE_ID)));

    //stained glass
    public static final Block GLOW_WHITE_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.WHITE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_WHITE_STAINED_GLASS_ID)));
    public static final Block GLOW_ORANGE_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.ORANGE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_ORANGE_STAINED_GLASS_ID)));
    public static final Block GLOW_MAGENTA_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.MAGENTA,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_MAGENTA_STAINED_GLASS_ID)));
    public static final Block GLOW_LIGHT_BLUE_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.LIGHT_BLUE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_BLUE_STAINED_GLASS_ID)));
    public static final Block GLOW_YELLOW_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.YELLOW,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_YELLOW_STAINED_GLASS_ID)));
    public static final Block GLOW_LIME_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.LIME,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIME_STAINED_GLASS_ID)));
    public static final Block GLOW_PINK_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.PINK,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PINK_STAINED_GLASS_ID)));
    public static final Block GLOW_GRAY_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.GRAY,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GRAY_STAINED_GLASS_ID)));
    public static final Block GLOW_LIGHT_GRAY_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.LIGHT_GRAY,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_GRAY_STAINED_GLASS_ID)));
    public static final Block GLOW_CYAN_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.CYAN,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_CYAN_STAINED_GLASS_ID)));
    public static final Block GLOW_PURPLE_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.PURPLE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PURPLE_STAINED_GLASS_ID)));
    public static final Block GLOW_BLUE_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.BLUE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLUE_STAINED_GLASS_ID)));
    public static final Block GLOW_BROWN_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.BROWN,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BROWN_STAINED_GLASS_ID)));
    public static final Block GLOW_GREEN_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.GREEN,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GREEN_STAINED_GLASS_ID)));
    public static final Block GLOW_RED_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.RED,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_RED_STAINED_GLASS_ID)));
    public static final Block GLOW_BLACK_STAINED_GLASS = new GlowStainedGlassBlock(
            DyeColor.BLACK,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLACK_STAINED_GLASS_ID)));
    //candle
    public static final Block GLOW_WHITE_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_WHITE_CANDLE_ID)));
    public static final Block GLOW_ORANGE_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_ORANGE_CANDLE_ID)));
    public static final Block GLOW_MAGENTA_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_MAGENTA_CANDLE_ID)));
    public static final Block GLOW_LIGHT_BLUE_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_BLUE_CANDLE_ID)));
    public static final Block GLOW_YELLOW_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_YELLOW_CANDLE_ID)));
    public static final Block GLOW_LIME_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIME_CANDLE_ID)));
    public static final Block GLOW_PINK_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PINK_CANDLE_ID)));
    public static final Block GLOW_GRAY_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GRAY_CANDLE_ID)));
    public static final Block GLOW_LIGHT_GRAY_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_GRAY_CANDLE_ID)));
    public static final Block GLOW_CYAN_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_CYAN_CANDLE_ID)));
    public static final Block GLOW_PURPLE_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PURPLE_CANDLE_ID)));
    public static final Block GLOW_BLUE_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLUE_CANDLE_ID)));
    public static final Block GLOW_BROWN_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BROWN_CANDLE_ID)));
    public static final Block GLOW_GREEN_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GREEN_CANDLE_ID)));
    public static final Block GLOW_RED_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_RED_CANDLE_ID)));
    public static final Block GLOW_BLACK_CANDLE = new CandleBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CANDLE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLACK_CANDLE_ID)));
    //stained glass pane
    public static final Block GLOW_WHITE_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.WHITE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_WHITE_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_ORANGE_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.ORANGE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_ORANGE_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_MAGENTA_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.MAGENTA,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_MAGENTA_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_LIGHT_BLUE_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.LIGHT_BLUE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_BLUE_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_YELLOW_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.YELLOW,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_YELLOW_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_LIME_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.LIME,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIME_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_PINK_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.PINK,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PINK_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_GRAY_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.GRAY,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GRAY_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_LIGHT_GRAY_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.LIGHT_GRAY,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_GRAY_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_CYAN_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.CYAN,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_CYAN_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_PURPLE_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.PURPLE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PURPLE_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_BLUE_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.BLUE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLUE_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_BROWN_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.BROWN,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BROWN_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_GREEN_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.GREEN,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GREEN_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_RED_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.RED,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_RED_STAINED_GLASS_PANE_ID)));
    public static final Block GLOW_BLACK_STAINED_GLASS_PANE = new GlowStainedGlassPaneBlock(
            DyeColor.BLACK,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_STAINED_GLASS_PANE)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLACK_STAINED_GLASS_PANE_ID)));
    //glazed terracotta
    public static final Block GLOW_WHITE_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_WHITE_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_ORANGE_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_ORANGE_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_MAGENTA_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_MAGENTA_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_LIGHT_BLUE_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_BLUE_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_YELLOW_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_YELLOW_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_LIME_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIME_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_PINK_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PINK_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_GRAY_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GRAY_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_LIGHT_GRAY_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_GRAY_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_CYAN_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_CYAN_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_PURPLE_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PURPLE_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_BLUE_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLUE_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_BROWN_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BROWN_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_GREEN_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GREEN_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_RED_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_RED_GLAZED_TERRACOTTA_ID)));
    public static final Block GLOW_BLACK_GLAZED_TERRACOTTA = new GlazedTerracottaBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_GLAZED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLACK_GLAZED_TERRACOTTA_ID)));
    //terracotta
    public static final Block GLOW_WHITE_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_WHITE_TERRACOTTA_ID)));
    public static final Block GLOW_ORANGE_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_ORANGE_TERRACOTTA_ID)));
    public static final Block GLOW_MAGENTA_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_MAGENTA_TERRACOTTA_ID)));
    public static final Block GLOW_LIGHT_BLUE_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_BLUE_TERRACOTTA_ID)));
    public static final Block GLOW_YELLOW_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_YELLOW_TERRACOTTA_ID)));
    public static final Block GLOW_LIME_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIME_TERRACOTTA_ID)));
    public static final Block GLOW_PINK_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PINK_TERRACOTTA_ID)));
    public static final Block GLOW_GRAY_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GRAY_TERRACOTTA_ID)));
    public static final Block GLOW_LIGHT_GRAY_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_GRAY_TERRACOTTA_ID)));
    public static final Block GLOW_CYAN_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_CYAN_TERRACOTTA_ID)));
    public static final Block GLOW_PURPLE_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PURPLE_TERRACOTTA_ID)));
    public static final Block GLOW_BLUE_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLUE_TERRACOTTA_ID)));
    public static final Block GLOW_BROWN_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BROWN_TERRACOTTA_ID)));
    public static final Block GLOW_GREEN_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GREEN_TERRACOTTA_ID)));
    public static final Block GLOW_RED_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_RED_TERRACOTTA_ID)));
    public static final Block GLOW_BLACK_TERRACOTTA = new Block(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_TERRACOTTA)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLACK_TERRACOTTA_ID)));

    //concrete powder
    public static final Block GLOW_WHITE_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_WHITE_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_WHITE_CONCRETE_POWDER_ID)));
    public static final Block GLOW_ORANGE_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_ORANGE_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_ORANGE_CONCRETE_POWDER_ID)));
    public static final Block GLOW_MAGENTA_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_MAGENTA_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_MAGENTA_CONCRETE_POWDER_ID)));
    public static final Block GLOW_LIGHT_BLUE_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_LIGHT_BLUE_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_BLUE_CONCRETE_POWDER_ID)));
    public static final Block GLOW_YELLOW_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_YELLOW_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_YELLOW_CONCRETE_POWDER_ID)));
    public static final Block GLOW_LIME_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_LIME_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIME_CONCRETE_POWDER_ID)));
    public static final Block GLOW_PINK_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_PINK_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PINK_CONCRETE_POWDER_ID)));
    public static final Block GLOW_GRAY_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_GRAY_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GRAY_CONCRETE_POWDER_ID)));
    public static final Block GLOW_LIGHT_GRAY_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_LIGHT_GRAY_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_LIGHT_GRAY_CONCRETE_POWDER_ID)));
    public static final Block GLOW_CYAN_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_CYAN_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_CYAN_CONCRETE_POWDER_ID)));
    public static final Block GLOW_PURPLE_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_PURPLE_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_PURPLE_CONCRETE_POWDER_ID)));
    public static final Block GLOW_BLUE_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_BLUE_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLUE_CONCRETE_POWDER_ID)));
    public static final Block GLOW_BROWN_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_BROWN_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BROWN_CONCRETE_POWDER_ID)));
    public static final Block GLOW_GREEN_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_GREEN_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_GREEN_CONCRETE_POWDER_ID)));
    public static final Block GLOW_RED_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_RED_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_RED_CONCRETE_POWDER_ID)));
    public static final Block GLOW_BLACK_CONCRETE_POWDER = new GlowConcretePowderBlock(
            ModBlocks.GLOW_BLACK_CONCRETE,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_CONCRETE_POWDER)
                    .lightLevel(level -> 3)
                    .postProcess(ModBlocks::alwaysPostProcess)
                    .emissiveRendering(ModBlocks::always)
                    .setId(key(Constants.GLOW_BLACK_CONCRETE_POWDER_ID)));
    private static boolean always(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return true;
    }

    private static BlockPos alwaysPostProcess(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return blockPos;
    }

    private static ResourceKey<Block> key(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
    }
}