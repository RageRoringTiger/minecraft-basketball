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

public class UseBasketBallEvent implements Listener {
    @EventHandler
    public void onPlayerRightClick(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        Action a = event.getAction();
        ArmorStand armorstand = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
        if (a == Action.RIGHT_CLICK_AIR) {
            armorstand.setVisible(false);
            armorstand.setInvulnerable(true);
            armorstand.getEquipment().setHelmet(new ItemStack(Material.PLAYER_HEAD));
        }

    }
}
