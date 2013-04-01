package app;

import java.util.Scanner;

import de.htwg.seapal.menudemo.views.tui.MenuTUI;
import de.htwg.util.plugin.PluginManager;


public class MenuDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PluginManager pluginManager = new PluginManager();

		MenuTUI tui = new MenuTUI(pluginManager);

		tui.printTUI();
		// continue to read user input on the tui until the user decides to quit
		boolean continu = true;
		Scanner scanner = new Scanner(System.in);
		while (continu) {
			continu = tui.processInputLine(scanner.next());
		}

	}

}
