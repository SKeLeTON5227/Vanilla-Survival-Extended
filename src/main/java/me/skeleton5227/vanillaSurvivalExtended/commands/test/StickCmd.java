package me.skeleton5227.vanillaSurvivalExtended.commands.test;

import me.skeleton5227.vanillaSurvivalExtended.data.items.simple.Stick;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class StickCmd implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        Player player = (Player) commandSender;

        player.getInventory().addItem(Stick.getInstance().getItem());

        return true;
    }
}
