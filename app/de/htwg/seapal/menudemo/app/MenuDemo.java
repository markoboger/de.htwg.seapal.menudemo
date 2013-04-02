package de.htwg.seapal.menudemo.app;

import java.util.Scanner;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.boatdemo.app.BoatDemoMockModule;
import de.htwg.seapal.menudemo.views.tui.MenuTUI;
import de.htwg.seapal.persondemo.app.PersonDemoMockModule;


public class MenuDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Set up Google Guice Dependency Injector
		Injector injector = Guice.createInjector(new MenuDemoModule(), new PersonDemoMockModule(), new BoatDemoMockModule());
		
		// Build up the application, resolving dependencies automatically by Guice
		MenuTUI tui = injector.getInstance( MenuTUI.class);

		tui.printTUI();
		// continue to read user input on the tui until the user decides to quit
		boolean continu = true;
		Scanner scanner = new Scanner(System.in);
		while (continu) {
			continu = tui.processInputLine(scanner.next());
		}

	}

}
