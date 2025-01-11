package zmod.discordplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Discordplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DiscordPlugin for Minecraft 1.21.4 has been enabled!");

        // Register the /discord command
        if (getCommand("discord") != null) {
            getCommand("discord").setExecutor(new DiscordCommand());
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("DiscordPlugin has been disabled.");
    }
}
