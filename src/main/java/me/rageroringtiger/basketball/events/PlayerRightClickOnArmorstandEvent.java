package me.rageroringtiger.basketball.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerRightClickOnArmorstandEvent implements Listener {
    public void onPlayerArmorStand(PlayerArmorStandManipulateEvent e){
        if(e.getRightClicked().hasMetadata("basketball")){
            Player p = e.getPlayer();
            e.getRightClicked().remove();
            ItemStack itemStack = new ItemStack(Material.ORANGE_CONCRETE);
            p.getInventory().getItemInMainHand().setType(Material.ORANGE_CONCRETE);
            p.getInventory().getItemInMainHand().setAmount(1);
            p.getInventory().getItemInMainHand().getItemMeta().setDisplayName("Basketball");
        }
    }
}
