package me.skeleton5227.vanillaSurvivalExtended.managers;

import me.skeleton5227.vanillaSurvivalExtended.crafts.PrimitiveAxeCraft;
import me.skeleton5227.vanillaSurvivalExtended.data.NamespacedKeys;
import me.skeleton5227.vanillaSurvivalExtended.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftManager implements Listener {

    @EventHandler
    public void onCraft(PrepareItemCraftEvent event) {
        if (event.getInventory().getResult() == null) return;

        ItemMeta meta = event.getInventory().getResult().getItemMeta();

        if (!meta.getPersistentDataContainer().has(NamespacedKeys.ID.getKey())) {
            event.getInventory().setResult(ItemBuilder.of(Material.AIR).build());
        }
    }

    public static void register() {
        PrimitiveAxeCraft.register();
    }
}
