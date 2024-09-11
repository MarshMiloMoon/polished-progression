package net.starglobe.polishedprogression.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.starglobe.polishedprogression.PolishedProgression;

public class ModBlocks {

    public static final Block IRON_PLATING_BLOCK = registerBlock("iron_plating_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
    public static final Block DIAMOND_PLATING_BLOCK = registerBlock("diamond_plating_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PolishedProgression.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(PolishedProgression.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        PolishedProgression.LOGGER.info("Registering Mod Blocks for " + PolishedProgression.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.IRON_PLATING_BLOCK);
            entries.add(ModBlocks.DIAMOND_PLATING_BLOCK);
        });
    }
}
