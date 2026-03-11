package me.skeleton5227.vanillaSurvivalExtended.data.items.simple;

import me.skeleton5227.vanillaSurvivalExtended.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Stick {

    private final ItemStack item;

    private static final Stick instance = new Stick();

    public static Stick getInstance() {
        return instance;
    }

    public ItemStack getItem() {
        return item;
    }

    private Stick() {
        item = ItemBuilder
                .of(Material.STICK)
                .setName("&rПалка")
                .setId("stick")
                .setLore(List.of("&r&8Обычная деревянная палка.", "&r&8Простая, но удивительно полезная."))
                .build();
    }
}
