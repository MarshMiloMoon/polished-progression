package net.starglobe.polishedprogression.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.starglobe.polishedprogression.block.ModBlocks;
import net.starglobe.polishedprogression.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IRON_PLATING_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIAMOND_PLATING_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.IRON_ARMOR_PLATING, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_ARMOR_PLATING, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLINT_DAGGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLINT_HATCHET, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLINT_TROWEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_CLUB, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_SPADE, Models.GENERATED);
    }
}
