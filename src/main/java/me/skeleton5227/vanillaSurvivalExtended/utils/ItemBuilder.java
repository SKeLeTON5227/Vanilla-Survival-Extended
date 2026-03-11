package me.skeleton5227.vanillaSurvivalExtended.utils;

import me.skeleton5227.vanillaSurvivalExtended.data.NamespacedKeys;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.components.ToolComponent;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;
import java.util.Objects;

public class ItemBuilder {

    private final ItemStack item;

    private ItemBuilder(Material material) {
        this.item = new ItemStack(Objects.requireNonNull(material, "Material cannot be null! Even Minecraft agrees."));
    }

    // Create a builder
    public static ItemBuilder of(Material material) {
        return new ItemBuilder(material);
    }

    // Set item name
    public ItemBuilder setName(String name) {
        ItemMeta meta = Objects.requireNonNull(item.getItemMeta(), "ItemMeta is null! The universe is broken");
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        item.setItemMeta(meta);
        return this;
    }

    // Set item lore
    public ItemBuilder setLore(List<String> lore) {
        ItemMeta meta = Objects.requireNonNull(item.getItemMeta(), "ItemMeta is null! Your lore is lost");
        List<String> coloredLore = lore.stream()
                .map(line -> ChatColor.translateAlternateColorCodes('&', line))
                .toList();
        meta.setLore(coloredLore);
        item.setItemMeta(meta);
        return this;
    }

    // Override enchant glint
    public ItemBuilder overrideGlint(Boolean value) {
        ItemMeta meta = Objects.requireNonNull(item.getItemMeta(), "ItemMeta is null! Cannot shine");
        meta.setEnchantmentGlintOverride(value);
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setMiningSpeed(float value) {
        ItemMeta meta = item.getItemMeta();

        ToolComponent tool = meta.getTool();
        tool.setDefaultMiningSpeed(value);
        meta.setTool(tool);
        item.setItemMeta(meta);
        return this;
    }

    // PersistentData
    public <T, Z> ItemBuilder setPersistentValue(NamespacedKey key, PersistentDataType<T, Z> type, Z value) {
        ItemMeta meta = Objects.requireNonNull(item.getItemMeta(), "ItemMeta is null! PDC failed");
        meta.getPersistentDataContainer().set(key, type, value);
        item.setItemMeta(meta);
        return this;
    }

    public ItemBuilder setId(String id) {
        setPersistentValue(NamespacedKeys.ID.getKey(), PersistentDataType.STRING, id);
        return this;
    }

    // Get the finished item
    public ItemStack build() {
        return this.item;
    }
}
