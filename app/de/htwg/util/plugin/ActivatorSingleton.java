package de.htwg.util.plugin;

public abstract class ActivatorSingleton {
	
	private PluginManager pluginManager;
	protected Plugin plugin;
	

	public void start(){
		pluginManager.addPlugin(plugin);
	}
	
	void stop(){
		pluginManager.removePlugin(plugin);
	}

}
