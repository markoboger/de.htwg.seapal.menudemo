package de.htwg.seapal.menudemo.views.tui;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.google.inject.Inject;

import de.htwg.util.observer.Event;
import de.htwg.util.observer.IObserver;
import de.htwg.util.plugin.Plugin;

public class MenuTUI implements IObserver {

	Set<Plugin> plugins;
	Scanner scanner = new Scanner(System.in);

	@Inject
	public MenuTUI(Set<Plugin> plugins) {
		this.plugins = plugins;
	}

	public void update(Event e) {
		printTUI();
	}

	public boolean processInputLine(String line) {
		boolean continu = true;
		if (line.equalsIgnoreCase("q")) {
			continu = false;
		}
		Iterator<Plugin> itr = plugins.iterator();
		while (itr.hasNext()) {
			Plugin plugin = itr.next();
			if (line.toLowerCase().charAt(0) == plugin.getMenuKey()) {
				plugin.printTUI();
				plugin.processInputLine(scanner.next());
			}
		}
		return continu;
	}

	public void printTUI() {
		System.out.println("MenuDemo: ");
		System.out.println("q - Quit");

		Iterator<Plugin> itr = plugins.iterator();
		while (itr.hasNext()) {
			Plugin plugin = itr.next();
			System.out.print(plugin.getMenuKey() + " - ");
			System.out.println(plugin.getMenuEntry());
		}

	}

}
