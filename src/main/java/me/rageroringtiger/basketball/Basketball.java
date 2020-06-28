package me.rageroringtiger.basketball;

import org.bukkit.plugin.java.JavaPlugin;

public final class Basketball extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Minecraft-Basketball has loaded.");
        getServer().getPluginManager().registerEvents(new UseBasketBallEvent(), this);
    }

}
