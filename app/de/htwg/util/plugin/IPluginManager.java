package de.htwg.util.plugin;

import java.util.List;

public interface IPluginManager {

	void addPlugin(Plugin plugin);

	void removePlugin(Plugin plugin);

	List<Plugin> getPlugins();

	void setPlugins(List<Plugin> plugins);

}