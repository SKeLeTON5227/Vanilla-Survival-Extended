package me.skeleton5227.vanillaSurvivalExtended.data.items.tools;

import me.skeleton5227.vanillaSurvivalExtended.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class PrimitiveAxe {

    private final ItemStack item;

    private static final PrimitiveAxe instance = new PrimitiveAxe();

    public static PrimitiveAxe getInstance() {
        return instance;
    }

    public ItemStack getItem() {
        return item;
    }

    private PrimitiveAxe() {

        item = ItemBuilder
                .of(Material.STONE_AXE)
                .setName("&rПримитивный топор")
                .setMiningSpeed(0.8f)
                .setId("primitive_axe")
                .setLore(List.of("&r&8Тяжелый и грубый, с неровным лезвием.", "&r&8Неидеален, но справляется с деревом.", "&r&8Отличный первый инструмент для выживания."))
                .build();
    }
}
