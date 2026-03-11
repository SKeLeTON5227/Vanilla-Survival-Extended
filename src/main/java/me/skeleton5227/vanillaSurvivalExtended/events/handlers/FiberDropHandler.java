package me.skeleton5227.vanillaSurvivalExtended.events.handlers;

import me.skeleton5227.vanillaSurvivalExtended.data.items.simple.Fiber;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.Random;

public class FiberDropHandler implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        Random rand = new Random();

        if (e.getBlock().getType() == Material.SHORT_GRASS ||  e.getBlock().getType() == Material.TALL_GRASS) {
            if (rand.nextInt(2) == 1) {
                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation().add(0,0.5,0), Fiber.getInstance().getItem());
            }
        }
    }
}
