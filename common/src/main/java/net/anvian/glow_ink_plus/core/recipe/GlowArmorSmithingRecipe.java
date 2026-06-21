package net.anvian.glow_ink_plus.core.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.anvian.glow_ink_plus.core.component.ModDataComponents;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.util.Unit;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.item.crafting.display.RecipeDisplay;
import net.minecraft.world.item.crafting.display.SlotDisplay;
import net.minecraft.world.item.crafting.display.SmithingRecipeDisplay;

import java.util.List;
import java.util.Optional;

public class GlowArmorSmithingRecipe extends SimpleSmithingRecipe {
    public static final MapCodec<GlowArmorSmithingRecipe> MAP_CODEC = RecordCodecBuilder.mapCodec(i -> i.group(
            Recipe.CommonInfo.MAP_CODEC.forGetter(o -> o.commonInfo),
            Ingredient.CODEC.fieldOf("base").forGetter(o -> o.base),
            Ingredient.CODEC.fieldOf("addition").forGetter(o -> o.addition)
    ).apply(i, GlowArmorSmithingRecipe::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, GlowArmorSmithingRecipe> STREAM_CODEC = StreamCodec.composite(
            Recipe.CommonInfo.STREAM_CODEC, o -> o.commonInfo,
            Ingredient.CONTENTS_STREAM_CODEC, o -> o.base,
            Ingredient.CONTENTS_STREAM_CODEC, o -> o.addition,
            GlowArmorSmithingRecipe::new
    );

    public static final RecipeSerializer<GlowArmorSmithingRecipe> SERIALIZER = new RecipeSerializer<>(MAP_CODEC, STREAM_CODEC);

    private final Ingredient base;
    private final Ingredient addition;

    public GlowArmorSmithingRecipe(Recipe.CommonInfo commonInfo, Ingredient base, Ingredient addition) {
        super(commonInfo);
        this.base = base;
        this.addition = addition;
    }

    @Override
    public ItemStack assemble(SmithingRecipeInput input) {
        ItemStack baseItem = input.base();
        if (baseItem.has(ModDataComponents.GLOWING)) {
            return ItemStack.EMPTY;
        }
        ItemStack result = baseItem.copyWithCount(1);
        result.set(ModDataComponents.GLOWING, Unit.INSTANCE);
        return result;
    }

    @Override
    public Optional<Ingredient> templateIngredient() {
        return Optional.empty();
    }

    @Override
    public Ingredient baseIngredient() {
        return this.base;
    }

    @Override
    public Optional<Ingredient> additionIngredient() {
        return Optional.of(this.addition);
    }

    @Override
    public RecipeSerializer<GlowArmorSmithingRecipe> getSerializer() {
        return SERIALIZER;
    }

    @Override
    protected PlacementInfo createPlacementInfo() {
        return PlacementInfo.create(List.of(this.base, this.addition));
    }

    @Override
    public List<RecipeDisplay> display() {
        SlotDisplay baseDisplay = this.base.display();
        SlotDisplay additionDisplay = this.addition.display();
        return List.of(new SmithingRecipeDisplay(
                SlotDisplay.Empty.INSTANCE,
                baseDisplay,
                additionDisplay,
                baseDisplay,
                new SlotDisplay.ItemSlotDisplay(Items.SMITHING_TABLE)
        ));
    }
}
