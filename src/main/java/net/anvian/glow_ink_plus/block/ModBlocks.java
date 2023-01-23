package net.anvian.glow_ink_plus.block;

import net.anvian.glow_ink_plus.GlowInkPlusMod;
import net.anvian.glow_ink_plus.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WoolCarpetBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GlowInkPlusMod.MOD_ID);
    //wools
    public static final RegistryObject<Block> GLOW_WHITE_WOOL = registerBlock("glow_white_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.SNOW)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_ORANGE_WOOL = registerBlock("glow_orange_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_ORANGE)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_MAGENTA_WOOL = registerBlock("glow_magenta_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_MAGENTA)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_LIGHT_BLUE_WOOL = registerBlock("glow_light_blue_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_BLUE)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_YELLOW_WOOL = registerBlock("glow_yellow_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_YELLOW)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_LIME_WOOL = registerBlock("glow_lime_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GREEN)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_PINK_WOOL = registerBlock("glow_pink_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_PINK)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_GRAY_WOOL = registerBlock("glow_gray_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GRAY)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_LIGHT_GRAY_WOOL = registerBlock("glow_light_gray_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_LIGHT_GRAY)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_CYAN_WOOL = registerBlock("glow_cyan_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_CYAN)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_PURPLE_WOOL = registerBlock("glow_purple_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_PURPLE)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_BLUE_WOOL = registerBlock("glow_blue_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BLUE)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_BROWN_WOOL = registerBlock("glow_brown_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BROWN)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_GREEN_WOOL = registerBlock("glow_green_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_GREEN)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_RED_WOOL = registerBlock("glow_red_wool",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_RED)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_BLACK_WOOL = registerBlock("glow_black_wool",
            () ->new Block(BlockBehaviour.Properties.of(Material.WOOL, MaterialColor.COLOR_BLACK)
                    .strength(0.8F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );

    //carpets
    public static final RegistryObject<Block> GLOW_WHITE_CARPET = registerBlock("glow_white_carpet",
            () -> new WoolCarpetBlock(DyeColor.WHITE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.SNOW)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_ORANGE_CARPET = registerBlock("glow_orange_carpet",
            () -> new WoolCarpetBlock(DyeColor.ORANGE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_ORANGE)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_MAGENTA_CARPET = registerBlock("glow_magenta_carpet",
            () -> new WoolCarpetBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_MAGENTA)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_LIGHT_BLUE_CARPET = registerBlock("glow_light_blue_carpet",
            () -> new WoolCarpetBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_LIGHT_BLUE)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_YELLOW_CARPET = registerBlock("glow_yellow_carpet",
            () -> new WoolCarpetBlock(DyeColor.YELLOW, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_YELLOW)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_LIME_CARPET = registerBlock("glow_lime_carpet",
            () -> new WoolCarpetBlock(DyeColor.LIME,BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_LIGHT_GREEN)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_PINK_CARPET = registerBlock("glow_pink_carpet",
            () -> new WoolCarpetBlock(DyeColor.PINK, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_PINK)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_GRAY_CARPET = registerBlock("glow_gray_carpet",
            () -> new WoolCarpetBlock(DyeColor.GRAY, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_GRAY)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_LIGHT_GRAY_CARPET = registerBlock("glow_light_gray_carpet",
            () -> new WoolCarpetBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_LIGHT_GRAY)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_CYAN_CARPET = registerBlock("glow_cyan_carpet",
            () -> new WoolCarpetBlock(DyeColor.CYAN, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_CYAN)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_PURPLE_CARPET = registerBlock("glow_purple_carpet",
            () -> new WoolCarpetBlock(DyeColor.PURPLE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_PURPLE)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_BLUE_CARPET = registerBlock("glow_blue_carpet",
            () -> new WoolCarpetBlock(DyeColor.BLUE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_BLUE)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_BROWN_CARPET = registerBlock("glow_brown_carpet",
            () -> new WoolCarpetBlock(DyeColor.BROWN, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_BROWN)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_GREEN_CARPET = registerBlock("glow_green_carpet",
            () -> new WoolCarpetBlock(DyeColor.GREEN, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_GREEN)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_RED_CARPET = registerBlock("glow_red_carpet",
            () -> new WoolCarpetBlock(DyeColor.RED, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_RED)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );
    public static final RegistryObject<Block> GLOW_BLACK_CARPET = registerBlock("glow_black_carpet",
            () ->new WoolCarpetBlock(DyeColor.BLACK, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION, MaterialColor.COLOR_BLACK)
                    .strength(0.1F).sound(SoundType.WOOL)
                    .lightLevel((p_152684_) -> 3).hasPostProcess(ModBlocks::always)
                    .emissiveRendering(ModBlocks::always)) );

    private static boolean always(BlockState p_50775_, BlockGetter p_50776_, BlockPos p_50777_) {
        return true;
    }
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
