package de.htwg.util.plugin;

public abstract class ActivatorSingleton {
	
	protected IPluginManager pluginManager;
	protected Plugin plugin;
	

	public void start(){
		pluginManager.addPlugin(plugin);
	}
	
	void stop(){
		pluginManager.removePlugin(plugin);
	}

}
