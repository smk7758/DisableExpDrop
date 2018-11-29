package com.github.smk7758.DisableExpDrop;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandExecuter implements CommandExecutor {
	public Main main = null;

	public CommandExecuter(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("DisableExpDrop")) {
			if (args.length < 1) {
				SendLog.error("Too short arguments.", sender);
				sendCommandList(sender);
			} else if (args[0].equalsIgnoreCase("enable")) {
				Main.enable = !Main.enable;
				SendLog.debug("Enable: " + Main.enable, sender);
			} else if (args[0].equalsIgnoreCase("debugmode")) {
				Main.debug_mode = !Main.debug_mode;
				SendLog.debug("DebugMode: " + Main.enable, sender);
			} else {
				sendCommandList(sender);
			}
			return true;
		}
		return false;
	}

	private void sendCommandList(CommandSender sender) {
		SendLog.send("Args: enable, debugmode", sender);
	}
}
