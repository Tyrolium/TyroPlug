package fr.maxime.tyrolium.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class plug extends JavaPlugin{
	
		public plug() {
		}

	    @Override
	    public void onEnable() {
	        this.getLogger().info("Plugin d�marr� !");
	    }

	    @Override
	    public void onDisable() {
	        this.getLogger().info("Plugin arret� !");
	    }
	
}
