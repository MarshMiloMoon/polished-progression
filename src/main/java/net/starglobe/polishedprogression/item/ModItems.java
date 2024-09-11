package net.starglobe.polishedprogression.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.starglobe.polishedprogression.PolishedProgression;

public class ModItems {
    public static final Item IRON_ARMOR_PLATING = registerItem("iron_armor_plating", new Item(new Item.Settings()));
    public static final Item DIAMOND_ARMOR_PLATING = registerItem("diamond_armor_plating", new Item(new Item.Settings()));

    public static final Item IRON_UPGRADE_SMITHING_TEMPLATE = registerItem("iron_upgrade_smithing_template",
            new Item(new Item.Settings()));
    public static final Item DIAMOND_UPGRADE_SMITHING_TEMPLATE = registerItem("diamond_upgrade_smithing_template",
            new Item(new Item.Settings()));

    public static final Item FLINT_DAGGER = registerItem("flint_dagger",
            new SwordItem(ToolMaterials.WOOD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(
                    ToolMaterials.WOOD, 3, 4996))));
    public static final Item FLINT_HATCHET = registerItem("flint_hatchet",
            new AxeItem(ToolMaterials.WOOD, new Item.Settings()));
    public static final Item FLINT_TROWEL = registerItem("flint_trowel",
            new ShovelItem(ToolMaterials.WOOD, new Item.Settings()));

    public static final Item STONE_CLUB = registerItem("stone_club",
            new AxeItem(ToolMaterials.STONE, new Item.Settings()));
    public static final Item STONE_SPADE = registerItem("stone_spade",
            new ShovelItem(ToolMaterials.STONE, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PolishedProgression.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PolishedProgression.LOGGER.info("Registering Mod Items for " + PolishedProgression.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(IRON_ARMOR_PLATING);
            entries.add(DIAMOND_ARMOR_PLATING);
            entries.add(IRON_UPGRADE_SMITHING_TEMPLATE);
            entries.add(DIAMOND_UPGRADE_SMITHING_TEMPLATE);
        });
    }
}
