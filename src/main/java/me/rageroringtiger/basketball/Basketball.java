package me.rageroringtiger.basketball;

import me.rageroringtiger.basketball.events.UseBasketBallEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Basketball extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        loadConfig();
        getServer().getPluginManager().registerEvents(new UseBasketBallEvent(), this);
        System.out.println("Minecraft-Basketball has loaded.");
    }

    public void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

}
