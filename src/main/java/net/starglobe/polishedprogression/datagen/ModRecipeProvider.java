package net.starglobe.polishedprogression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.starglobe.polishedprogression.block.ModBlocks;
import net.starglobe.polishedprogression.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.IRON_ARMOR_PLATING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.IRON_PLATING_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DIAMOND_ARMOR_PLATING, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMOND_PLATING_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_DAGGER)
                .pattern(" X")
                .pattern("# ")
                .input('X', Items.FLINT)
                .input('#', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_HATCHET)
                .pattern("X#")
                .pattern(" #")
                .input('X', Items.FLINT)
                .input('#', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.FLINT_TROWEL)
                .pattern("X")
                .pattern("#")
                .input('X', Items.FLINT)
                .input('#', Items.STICK)
                .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_CLUB)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', Items.STICK)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STONE_SPADE)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .input('X', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', Items.STICK)
                .criterion(hasItem(Items.COBBLESTONE), conditionsFromItem(Items.FLINT))
                .offerTo(exporter);
    }
}
