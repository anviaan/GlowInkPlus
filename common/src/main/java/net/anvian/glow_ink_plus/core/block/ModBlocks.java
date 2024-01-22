package net.anvian.glow_ink_plus.core.block;

import net.anvian.glow_ink_plus.core.block.custom.ModWoolCarpetBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
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
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_ORANGE_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_MAGENTA_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_LIGHT_BLUE_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_YELLOW_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_LIME_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_PINK_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_GRAY_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_LIGHT_GRAY_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_CYAN_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_PURPLE_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_BLUE_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_BROWN_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_GREEN_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_RED_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_BLACK_WOOL = new Block(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .instrument(NoteBlockInstrument.GUITAR)
                    .strength(0.8F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));

    //carpet
    public static final Block GLOW_WHITE_CARPET = new ModWoolCarpetBlock(
            DyeColor.WHITE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_ORANGE_CARPET = new ModWoolCarpetBlock(
            DyeColor.ORANGE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_MAGENTA_CARPET = new ModWoolCarpetBlock(
            DyeColor.MAGENTA,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_LIGHT_BLUE_CARPET = new ModWoolCarpetBlock(
            DyeColor.LIGHT_BLUE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_YELLOW_CARPET = new ModWoolCarpetBlock(
            DyeColor.YELLOW,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_LIME_CARPET = new ModWoolCarpetBlock(
            DyeColor.LIME,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_PINK_CARPET = new ModWoolCarpetBlock(
            DyeColor.PINK,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_GRAY_CARPET = new ModWoolCarpetBlock(
            DyeColor.GRAY,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_LIGHT_GRAY_CARPET = new ModWoolCarpetBlock(
            DyeColor.LIGHT_GRAY,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_CYAN_CARPET = new ModWoolCarpetBlock(
            DyeColor.CYAN,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_PURPLE_CARPET = new ModWoolCarpetBlock(
            DyeColor.PURPLE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_BLUE_CARPET = new ModWoolCarpetBlock(
            DyeColor.BLUE,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_BROWN_CARPET = new ModWoolCarpetBlock(
            DyeColor.BROWN,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_GREEN_CARPET = new ModWoolCarpetBlock(
            DyeColor.GREEN,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_RED_CARPET = new ModWoolCarpetBlock(
            DyeColor.RED,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));
    public static final Block GLOW_BLACK_CARPET = new ModWoolCarpetBlock(
            DyeColor.BLACK,
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(0.1F)
                    .sound(SoundType.WOOL)
                    .ignitedByLava()
                    .lightLevel(level -> 3)
                    .hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always));

    private static boolean always(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return true;
    }
}
