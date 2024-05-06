package me.classy.pfag;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PartyFriendsAndGuilds extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("§e----------------------------------------------");
		getLogger().info("§bPartyFriendsAndGuilds plugin has been enabled!");
		getLogger().info("§e----------------------------------------------");
	}

	@Override
	public void onDisable() {
		getLogger().info("§e-----------------------------------------------");
		getLogger().info("§bPartyFriendsAndGuilds plugin has been disabled!");
		getLogger().info("§e-----------------------------------------------");
	}
}
