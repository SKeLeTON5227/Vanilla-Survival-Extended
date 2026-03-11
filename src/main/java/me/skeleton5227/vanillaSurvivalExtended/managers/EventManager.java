package me.skeleton5227.vanillaSurvivalExtended.managers;

import me.skeleton5227.vanillaSurvivalExtended.VanillaSurvivalExtended;
import me.skeleton5227.vanillaSurvivalExtended.events.handlers.FiberDropHandler;
import me.skeleton5227.vanillaSurvivalExtended.events.handlers.GlobalHandler;
import me.skeleton5227.vanillaSurvivalExtended.events.handlers.LyingItemsHandler;
import org.bukkit.Bukkit;

public class EventManager {

    public static void register() {
        VanillaSurvivalExtended instance = VanillaSurvivalExtended.getInstance();

        Bukkit.getPluginManager().registerEvents(new FiberDropHandler(), instance);
        Bukkit.getPluginManager().registerEvents(new GlobalHandler(), instance);
        Bukkit.getPluginManager().registerEvents(new LyingItemsHandler(), instance);

        Bukkit.getPluginManager().registerEvents(new CraftManager(), instance);
    }
}
