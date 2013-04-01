package de.htwg.util.plugin;

import java.util.ArrayList;
import java.util.List;

public class PluginManager {
	
	private List<Plugin> plugins = new ArrayList<Plugin>();

	public void addPlugin(Plugin plugin) {
		getPlugins().add(plugin);
	}

	public void removePlugin(Plugin plugin) {
		getPlugins().remove(plugin);
	}

	public List<Plugin> getPlugins() {
		return plugins;
	}

	public void setPlugins(List<Plugin> plugins) {
		this.plugins = plugins;
	}


}
