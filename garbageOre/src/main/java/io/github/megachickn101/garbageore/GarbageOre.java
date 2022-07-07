package io.github.megachickn101.garbageore;

import io.github.megachickn101.garbageore.handlers.oreHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GarbageOre extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Enabling: Garbage Ore");
        Bukkit.getLogger().info("megachickn101.github.io");
        new oreHandler(this);
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Disabling: Garbage Ore");
    }
}
