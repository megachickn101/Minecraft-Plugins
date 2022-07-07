package io.github.megachickn101.garbageore.handlers;

import io.github.megachickn101.garbageore.GarbageOre;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;


public class oreHandler implements Listener {
    public oreHandler(GarbageOre plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onBlockBroken(BlockBreakEvent event){
        if(event.getBlock().getType() != Material.AIR || event.getBlock().getType() != Material.CAVE_AIR || event.getBlock().getType() != Material.VOID_AIR) {
            Player player = event.getPlayer();
            Location playerLocation = player.getLocation();
            Random randomNumberGenerator = new Random();
            event.setDropItems(false);
            int oreAmount;
            switch (event.getBlock().getType()) {
                case IRON_ORE:
                case DEEPSLATE_IRON_ORE:
                    oreAmount = randomNumberGenerator.nextInt(3);
                    player.getWorld().dropItem(playerLocation, new ItemStack(Material.IRON_NUGGET, oreAmount));
                    break;
                case GOLD_ORE:
                case DEEPSLATE_GOLD_ORE:
                case NETHER_GOLD_ORE:
                    oreAmount = randomNumberGenerator.nextInt(2);
                    player.getWorld().dropItem(playerLocation, new ItemStack(Material.GOLD_NUGGET, oreAmount));
                    break;
                case ANCIENT_DEBRIS:
                    player.getWorld().dropItem(playerLocation, new ItemStack(Material.EMERALD, 1));
                    break;
                case EMERALD_ORE:
                case DEEPSLATE_EMERALD_ORE:
                    player.getWorld().dropItem(playerLocation, new ItemStack(Material.DIAMOND, 1));
                    break;
                case DIAMOND_ORE:
                case DEEPSLATE_DIAMOND_ORE:
                    oreAmount = randomNumberGenerator.nextInt(2);
                    player.getWorld().dropItem(playerLocation, new ItemStack(Material.LAPIS_LAZULI, oreAmount));
                    break;
                case LAPIS_LAZULI:
                case DEEPSLATE_LAPIS_ORE:
                    oreAmount = randomNumberGenerator.nextInt(3);
                    player.getWorld().dropItem(playerLocation, new ItemStack(Material.REDSTONE, oreAmount));
                    break;
                case REDSTONE_ORE:
                case DEEPSLATE_REDSTONE_ORE:
                    oreAmount = randomNumberGenerator.nextInt(3);
                    player.getWorld().dropItem(playerLocation, new ItemStack(Material.RAW_COPPER, oreAmount));
                    break;
                case COPPER_ORE:
                case DEEPSLATE_COPPER_ORE:
                    player.getWorld().dropItem(playerLocation, new ItemStack(Material.RAW_COPPER, 1));
                    break;
                case COAL_ORE:
                case DEEPSLATE_COAL_ORE:
                    player.getWorld().dropItem(playerLocation, new ItemStack(Material.COAL, 1));
                    break;
                default:
                    event.setDropItems(false);
            }
        }
    }
}
