package de.htwg.util.plugin;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Singleton;

@Singleton
public class PluginManager implements IPluginManager {
	
	private List<Plugin> plugins = new ArrayList<Plugin>();

	@Override
	public void addPlugin(Plugin plugin) {
		getPlugins().add(plugin);
	}

	@Override
	public void removePlugin(Plugin plugin) {
		getPlugins().remove(plugin);
	}

	@Override
	public List<Plugin> getPlugins() {
		return plugins;
	}

	@Override
	public void setPlugins(List<Plugin> plugins) {
		this.plugins = plugins;
	}


}
