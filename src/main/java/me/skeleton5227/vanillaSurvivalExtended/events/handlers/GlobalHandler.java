package me.skeleton5227.vanillaSurvivalExtended.events.handlers;

import me.skeleton5227.vanillaSurvivalExtended.populators.LyingPopulator;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldLoadEvent;

public class GlobalHandler implements Listener {

    @EventHandler
    public void onWorldLoad(WorldLoadEvent event) {
        if (event.getWorld().getName().equals("world")) {
            event.getWorld().getPopulators().add(new LyingPopulator());
        }
    }
}