package thefloorislava.thefloorislava.handlers;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import thefloorislava.thefloorislava.TheFloorIsLava;

public class playerHandler implements Listener {
    public playerHandler(TheFloorIsLava plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerTouch(PlayerMoveEvent event){
        Material replacedBlock = Material.MAGMA_BLOCK;
        if(event.getPlayer().isSprinting()){
            replacedBlock = Material.LAVA;
        }
        Location underBlock = new Location(event.getTo().getWorld(), event.getTo().getBlockX(), event.getTo().getBlockY() - 1, event.getTo().getBlockZ());
        Block userBlock = underBlock.getBlock();
        switch(userBlock.getType()) {
            case GRASS_BLOCK:
            case PODZOL:
            case SOUL_SAND:
            case NETHERRACK:
            case SOUL_SOIL:
            case MAGMA_BLOCK:
            case LAVA:
            case GRANITE:
            case ANDESITE:
            case COARSE_DIRT:
            case ROOTED_DIRT:
            case DIRT:
            case DIRT_PATH:
            case GRAVEL:
            case MUD:
            case MYCELIUM:
            case SAND:
            case CRIMSON_NYLIUM:
            case WARPED_NYLIUM:
            case END_STONE:
                userBlock.setType(replacedBlock);
                break;
        }
    }
}
