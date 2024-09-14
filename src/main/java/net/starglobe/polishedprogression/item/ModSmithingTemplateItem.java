package net.starglobe.polishedprogression.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.resource.featuretoggle.FeatureFlag;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.starglobe.polishedprogression.PolishedProgression;

import java.util.List;

public class ModSmithingTemplateItem extends SmithingTemplateItem {
    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    private static final Text IRON_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", Identifier.ofVanilla("iron_upgrade")))
            .formatted(TITLE_FORMATTING);
    private static final Text IRON_UPGRADE_APPLIES_TO_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.iron_upgrade.applies_to"))
            )
            .formatted(DESCRIPTION_FORMATTING);
    private static final Text IRON_UPGRADE_INGREDIENTS_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.iron_upgrade.ingredients"))
            )
            .formatted(DESCRIPTION_FORMATTING);
    private static final Text IRON_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.iron_upgrade.base_slot_description"))
    );
    private static final Text IRON_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.iron_upgrade.additions_slot_description"))
    );
    private static final Text DIAMOND_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", Identifier.ofVanilla("diamond_upgrade")))
            .formatted(TITLE_FORMATTING);
    private static final Text DIAMOND_UPGRADE_APPLIES_TO_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.diamond_upgrade.applies_to"))
            )
            .formatted(DESCRIPTION_FORMATTING);
    private static final Text DIAMOND_UPGRADE_INGREDIENTS_TEXT = Text.translatable(
                    Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.diamond_upgrade.ingredients"))
            )
            .formatted(DESCRIPTION_FORMATTING);
    private static final Text DIAMOND_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.diamond_upgrade.base_slot_description"))
    );
    private static final Text DIAMOND_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(
            Util.createTranslationKey("item", Identifier.ofVanilla("smithing_template.diamond_upgrade.additions_slot_description"))
    );

    private static final Identifier EMPTY_ARMOR_SLOT_HELMET_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_helmet");
    private static final Identifier EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_chestplate");
    private static final Identifier EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_leggings");
    private static final Identifier EMPTY_ARMOR_SLOT_BOOTS_TEXTURE = Identifier.ofVanilla("item/empty_armor_slot_boots");
    private static final Identifier EMPTY_SLOT_HOE_TEXTURE = Identifier.ofVanilla("item/empty_slot_hoe");
    private static final Identifier EMPTY_SLOT_AXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_axe");
    private static final Identifier EMPTY_SLOT_SWORD_TEXTURE = Identifier.ofVanilla("item/empty_slot_sword");
    private static final Identifier EMPTY_SLOT_SHOVEL_TEXTURE = Identifier.ofVanilla("item/empty_slot_shovel");
    private static final Identifier EMPTY_SLOT_PICKAXE_TEXTURE = Identifier.ofVanilla("item/empty_slot_pickaxe");
    private static final Identifier EMPTY_SLOT_DIAMOND_TEXTURE = Identifier.ofVanilla("item/empty_slot_diamond");
    private static final Identifier EMPTY_SLOT_ARMOR_PLATING_TEXTURE = Identifier.of("empty_slot_armor_plating");

    public ModSmithingTemplateItem(Text appliesToText, Text ingredientsText, Text titleText, Text baseSlotDescriptionText,
                                   Text additionsSlotDescriptionText, List<Identifier> emptyBaseSlotTextures,
                                   List<Identifier> emptyAdditionsSlotTextures, FeatureFlag... requiredFeatures) {
        super(appliesToText, ingredientsText, titleText, baseSlotDescriptionText, additionsSlotDescriptionText,
                emptyBaseSlotTextures, emptyAdditionsSlotTextures, requiredFeatures);
    }

    public static SmithingTemplateItem createIronUpgrade() {
        return new SmithingTemplateItem(
                IRON_UPGRADE_APPLIES_TO_TEXT,
                IRON_UPGRADE_INGREDIENTS_TEXT,
                IRON_UPGRADE_TEXT,
                IRON_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT,
                IRON_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT,
                getIronUpgradeEmptyBaseSlotTextures(),
                getIronUpgradeEmptyAdditionsSlotTextures()
        );
    }

    public static SmithingTemplateItem createDiamondUpgrade() {
        return new SmithingTemplateItem(
                DIAMOND_UPGRADE_APPLIES_TO_TEXT,
                DIAMOND_UPGRADE_INGREDIENTS_TEXT,
                DIAMOND_UPGRADE_TEXT,
                DIAMOND_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT,
                DIAMOND_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT,
                getDiamondUpgradeEmptyBaseSlotTextures(),
                getDiamondUpgradeEmptyAdditionsSlotTextures()
        );
    }


    private static List<Identifier> getIronUpgradeEmptyBaseSlotTextures() {
        return List.of(
                EMPTY_ARMOR_SLOT_HELMET_TEXTURE,
                EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE,
                EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE,
                EMPTY_ARMOR_SLOT_BOOTS_TEXTURE
        );
    }

    private static List<Identifier> getIronUpgradeEmptyAdditionsSlotTextures() {
        return List.of(EMPTY_SLOT_ARMOR_PLATING_TEXTURE);
    }

    private static List<Identifier> getDiamondUpgradeEmptyBaseSlotTextures() {
        return List.of(
                EMPTY_ARMOR_SLOT_HELMET_TEXTURE,
                EMPTY_SLOT_SWORD_TEXTURE,
                EMPTY_ARMOR_SLOT_CHESTPLATE_TEXTURE,
                EMPTY_SLOT_PICKAXE_TEXTURE,
                EMPTY_ARMOR_SLOT_LEGGINGS_TEXTURE,
                EMPTY_SLOT_AXE_TEXTURE,
                EMPTY_ARMOR_SLOT_BOOTS_TEXTURE,
                EMPTY_SLOT_HOE_TEXTURE,
                EMPTY_SLOT_SHOVEL_TEXTURE
        );
    }

    private static List<Identifier> getDiamondUpgradeEmptyAdditionsSlotTextures() {
        return List.of(
                EMPTY_SLOT_ARMOR_PLATING_TEXTURE,
                EMPTY_SLOT_DIAMOND_TEXTURE,
                EMPTY_SLOT_ARMOR_PLATING_TEXTURE,
                EMPTY_SLOT_DIAMOND_TEXTURE,
                EMPTY_SLOT_ARMOR_PLATING_TEXTURE,
                EMPTY_SLOT_DIAMOND_TEXTURE,
                EMPTY_SLOT_ARMOR_PLATING_TEXTURE,
                EMPTY_SLOT_DIAMOND_TEXTURE,
                EMPTY_SLOT_DIAMOND_TEXTURE
        );
    }

    public static void registerModSmithingTemplateItems() {
        PolishedProgression.LOGGER.info("Registering Mod Smithing Template Items for " + PolishedProgression.MOD_ID);
    }
}
