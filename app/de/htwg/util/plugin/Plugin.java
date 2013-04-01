package de.htwg.util.plugin;

import de.htwg.util.observer.IObservable;

public interface Plugin extends IObservable{
	
	public String getMenuEntry();
	
	// Use a single character string for the key
	public String getMenuKey();
	
	public void printTUI();
	
	public void processInputLine(String line);

}
