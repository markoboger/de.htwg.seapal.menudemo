package app;

import java.util.Scanner;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.boatdemo.controllers.IBoatController;
import de.htwg.seapal.menudemo.views.tui.MenuTUI;
import de.htwg.util.plugin.ActivatorSingleton;
import de.htwg.util.plugin.IPluginManager;
import de.htwg.util.plugin.PluginManager;


public class MenuDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Set up Google Guice Dependency Injector
		Injector injector = Guice.createInjector(new MenuDemoMockModule());
		
		// Build up the application, resolving dependencies automatically by Guice
		ActivatorSingleton boatActivator = injector.getInstance(ActivatorSingleton.class);

		MenuTUI tui = injector.getInstance(MenuTUI.class);

		tui.printTUI();
		// continue to read user input on the tui until the user decides to quit
		boolean continu = true;
		Scanner scanner = new Scanner(System.in);
		while (continu) {
			continu = tui.processInputLine(scanner.next());
		}

	}

}
