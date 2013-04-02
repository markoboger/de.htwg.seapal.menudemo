package de.htwg.seapal.menudemo.views.tui;

import java.util.Iterator;
import java.util.Scanner;

import com.google.inject.Inject;

import de.htwg.util.observer.Event;
import de.htwg.util.observer.IObserver;
import de.htwg.util.plugin.IPluginManager;
import de.htwg.util.plugin.Plugin;

public class MenuTUI implements IObserver {

	
	private IPluginManager pluginManager;
	Scanner scanner = new Scanner(System.in);

	public MenuTUI(IPluginManager pluginManager) {
		this.pluginManager = pluginManager;
//		Iterator<Plugin> itr = pluginManager.getPlugins().iterator();
//		while (itr.hasNext()) {
//			Plugin plugin = itr.next();
//			plugin.addObserver(this);
//		}
	}

	public void update(Event e) {
		printTUI();
	}

	public boolean processInputLine(String line) {
		boolean continu = true;
		if (line.equalsIgnoreCase("q")) {
			continu = false;
		}
		Iterator<Plugin> itr = pluginManager.getPlugins().iterator();
		while (itr.hasNext()) {
			Plugin plugin = itr.next();
			if (line.equalsIgnoreCase(plugin.getMenuKey())) {
				plugin.printTUI();
				plugin.processInputLine(scanner.next());
			}
		}
		return continu;
	}

	public void printTUI() {
		System.out.println("MenuDemo: q - Quit");

		Iterator<Plugin> itr = pluginManager.getPlugins().iterator();
		while (itr.hasNext()) {
			Plugin plugin = itr.next();
			System.out.print(plugin.getMenuEntry());
		}

	}

}
