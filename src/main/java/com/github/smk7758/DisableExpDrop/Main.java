package com.github.smk7758.DisableExpDrop;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static final String plugin_name = "DisableExpDrop";
	public static boolean debug_mode = false;
	public static boolean enable = true;

	@Override
	public void onEnable() {
		if (!Main.plugin_name.equals(getDescription().getName())) getPluginLoader().disablePlugin(this);
		getServer().getPluginManager().registerEvents(new MobDeathListner(), this);
		getCommand(plugin_name).setExecutor(new CommandExecuter(this));
		saveDefaultConfig();
		debug_mode = getConfig().getBoolean("DebugMode", false);
		enable = getConfig().getBoolean("Enable", true);
		SendLog.debug("Enable: " + enable);
	}

	@Override
	public void onDisable() {
	}
}