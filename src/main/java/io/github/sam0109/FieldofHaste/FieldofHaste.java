package io.github.sam0109.FieldofHaste;

import org.bukkit.plugin.java.JavaPlugin;

public final class FieldofHaste extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoked for FoH!");
	}

	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked for FoH!");
	}
}
