package me.skeleton5227.vanillaSurvivalExtended.data;

import me.skeleton5227.vanillaSurvivalExtended.VanillaSurvivalExtended;
import org.bukkit.NamespacedKey;

public enum NamespacedKeys {

    // Utils

    ID("id"),

    DURABILITY("durability"),
    MAX_DURABILITY("maxDurability"),

    CONTAINS_STICK("containsStick"),
    CONTAINS_ROCK("containsRock"),

    // Crafts

    PRIMITIVE_AXE("primitive_axe_craft");

    private final NamespacedKey key;

    public NamespacedKey getKey() {
        return key;
    }

    NamespacedKeys(String keyName) {
        key = new NamespacedKey(VanillaSurvivalExtended.getInstance(), keyName);
    }
}
