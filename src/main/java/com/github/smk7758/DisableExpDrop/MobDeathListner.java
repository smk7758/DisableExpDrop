package com.github.smk7758.DisableExpDrop;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class MobDeathListner implements Listener {

	@EventHandler
	public void onEntitiyDeath(EntityDeathEvent event) {
		if (Main.enable) event.setDroppedExp(0);
		SendLog.debug("EntitiyName: " + event.getEntityType().toString());
	}
}
