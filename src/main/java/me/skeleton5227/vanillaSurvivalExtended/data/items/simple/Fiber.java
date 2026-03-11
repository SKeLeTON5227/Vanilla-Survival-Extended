package me.skeleton5227.vanillaSurvivalExtended.data.items.simple;

import me.skeleton5227.vanillaSurvivalExtended.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Fiber {

    private final ItemStack item;

    private static final Fiber instance = new Fiber();

    public static Fiber getInstance() {
        return instance;
    }

    public ItemStack getItem() {
        return item;
    }

    private Fiber() {
        item = ItemBuilder
                .of(Material.WHEAT)
                .setName("&rВолокно")
                .setId("fiber")
                .setLore(List.of("&r&8Легкое и гибкое волокно, собранное из травы.", "&r&8Подходит для первых веревок,", "&r&8простых тканей и прочих базовых изделий."))
                .build();
    }
}
