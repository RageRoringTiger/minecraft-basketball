package me.rageroringtiger.basketball;

import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class UseBasketBallEvent implements Listener {
    private Plugin plugin = Basketball.getPlugin(Basketball.class);
    @EventHandler
    public void onPlayerRightClick(PlayerInteractEvent event) {
        String valueStr = plugin.getConfig().getString("UseBasketBallEvent.BallPowerValue");
        int valueInt = Integer.parseInt(valueStr);
        Player p = event.getPlayer();
        Action a = event.getAction();
        ItemStack inHand = p.getInventory().getItemInMainHand();
        if (a == Action.RIGHT_CLICK_AIR) {
            if (inHand.getType() == Material.ORANGE_CONCRETE){
                ArmorStand armorstand = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                armorstand.setVisible(false);
                armorstand.setInvulnerable(true);
                armorstand.getEquipment().setHelmet(new ItemStack(Material.ORANGE_CONCRETE));
                armorstand.setVelocity(p.getLocation().getDirection().multiply(valueInt));
            } else {}
        } else {}

    }
}
