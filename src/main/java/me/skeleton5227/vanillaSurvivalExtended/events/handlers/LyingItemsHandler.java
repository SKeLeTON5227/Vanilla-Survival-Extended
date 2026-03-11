package me.skeleton5227.vanillaSurvivalExtended.events.handlers;

import me.skeleton5227.vanillaSurvivalExtended.data.NamespacedKeys;
import me.skeleton5227.vanillaSurvivalExtended.data.items.simple.Rock;
import me.skeleton5227.vanillaSurvivalExtended.data.items.simple.Stick;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.persistence.PersistentDataContainer;

public class LyingItemsHandler implements Listener {

    @EventHandler
    public void onPunch(EntityDamageByEntityEvent e) {
        if (e.getEntity().getType() != EntityType.ITEM_FRAME) return;

        if (e.getDamager().getType() != EntityType.PLAYER) return;

        System.out.println("Event fired");

        PersistentDataContainer container = e.getEntity().getPersistentDataContainer();

        if (container.has(NamespacedKeys.CONTAINS_ROCK.getKey())) {
            e.getEntity().remove();
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation().add(0,0.5,0), Rock.getInstance().getItem());
        }
        else if (container.has(NamespacedKeys.CONTAINS_STICK.getKey())){
            e.getEntity().remove();
            e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation().add(0,0.5,0), Stick.getInstance().getItem());
        }
    }
}
