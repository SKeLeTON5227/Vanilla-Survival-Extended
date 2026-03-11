package me.skeleton5227.vanillaSurvivalExtended;

import me.skeleton5227.vanillaSurvivalExtended.commands.test.FiberCmd;
import me.skeleton5227.vanillaSurvivalExtended.commands.test.RockCmd;
import me.skeleton5227.vanillaSurvivalExtended.commands.test.StickCmd;
import me.skeleton5227.vanillaSurvivalExtended.managers.CraftManager;
import me.skeleton5227.vanillaSurvivalExtended.managers.EventManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class VanillaSurvivalExtended extends JavaPlugin {

    private static VanillaSurvivalExtended instance;

    public static VanillaSurvivalExtended getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        saveDefaultConfig();
        instance = this;

        Objects.requireNonNull(getCommand("rock")).setExecutor(new RockCmd());
        Objects.requireNonNull(getCommand("fiber")).setExecutor(new FiberCmd());
        Objects.requireNonNull(getCommand("stick")).setExecutor(new StickCmd());

        EventManager.register();
        CraftManager.register();
    }
}
