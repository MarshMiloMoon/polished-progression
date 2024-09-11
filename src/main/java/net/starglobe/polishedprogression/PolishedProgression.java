package net.starglobe.polishedprogression;

import net.fabricmc.api.ModInitializer;

import net.starglobe.polishedprogression.block.ModBlocks;
import net.starglobe.polishedprogression.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PolishedProgression implements ModInitializer {
	public static final String MOD_ID = "polishedprogression";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}