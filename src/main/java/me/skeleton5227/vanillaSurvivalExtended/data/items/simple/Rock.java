package me.skeleton5227.vanillaSurvivalExtended.data.items.simple;

import me.skeleton5227.vanillaSurvivalExtended.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Rock {

    private final ItemStack item;

    private static final Rock instance = new Rock();

    public static Rock getInstance() {
        return instance;
    }

    public ItemStack getItem() {
        return item;
    }

    private Rock() {
        item = ItemBuilder
                .of(Material.FLINT)
                .setName("&rКамень")
                .setId("rock")
                .setLore(List.of("&r&8Простой камень, лежащий на земле.", "&r&8Подходит для первых инструментов."))
                .build();
    }
}
