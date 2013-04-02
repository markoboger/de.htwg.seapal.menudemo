package app;


import com.google.inject.AbstractModule;

import de.htwg.seapal.boatdemo.controllers.IBoatController;
import de.htwg.seapal.boatdemo.models.IBoat;

import de.htwg.seapal.persondemo.controllers.IPersonController;
import de.htwg.seapal.persondemo.models.IPerson;
import de.htwg.util.plugin.ActivatorSingleton;
import de.htwg.util.plugin.IPluginManager;

public class MenuDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBoat.class).to(de.htwg.seapal.boatdemo.models.mock.Boat.class);
		bind(IBoatController.class).to(de.htwg.seapal.boatdemo.controllers.mock.BoatController.class);	
		
		bind(IPersonController.class).to(de.htwg.seapal.persondemo.controllers.mock.PersonController.class);
		bind(IPerson.class).to(de.htwg.seapal.persondemo.models.mock.Person.class);
		
		bind(IPluginManager.class).to(de.htwg.util.plugin.PluginManager.class);
		bind(ActivatorSingleton.class).to(app.BoatActivator.class);
		
	}

}
