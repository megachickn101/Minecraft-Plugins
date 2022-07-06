package thefloorislava.thefloorislava;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import thefloorislava.thefloorislava.handlers.playerHandler;

public final class TheFloorIsLava extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Enabling: Floor Is Lava");
        Bukkit.getLogger().info("megachickn101.github.io");
        new playerHandler(this);
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Disabling: Floor Is Lava");
    }
}
