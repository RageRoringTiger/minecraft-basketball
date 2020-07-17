package me.rageroringtiger.basketball.commands;

import me.rageroringtiger.basketball.Basketball;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class ChangePower implements CommandExecutor {
    private Plugin plugin = Basketball.getPlugin(Basketball.class);
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[1].isEmpty()){
            sender.sendMessage(ChatColor.RED + "Please specify a power level.");
        } else {
            plugin.getConfig().set("UseBasketballEvent.BallPowerValue", args[1]);
        }
        return false;
    }
}
