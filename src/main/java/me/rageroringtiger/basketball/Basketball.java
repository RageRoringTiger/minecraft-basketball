package me.rageroringtiger.basketball;

import me.rageroringtiger.basketball.commands.ChangePower;
import me.rageroringtiger.basketball.events.PlayerRightClickOnArmorstandEvent;
import me.rageroringtiger.basketball.events.UseBasketBallEvent;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class Basketball extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        loadConfig();
        getServer().getPluginManager().registerEvents(new UseBasketBallEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerRightClickOnArmorstandEvent(), this);
        getCommand("power").setExecutor(new ChangePower());
        System.out.println("Minecraft-Basketball has loaded.");
    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

}
