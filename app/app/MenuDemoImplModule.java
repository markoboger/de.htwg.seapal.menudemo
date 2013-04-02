package app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.boatdemo.controllers.IBoatController;
import de.htwg.seapal.boatdemo.models.IBoat;
import de.htwg.seapal.persondemo.controllers.IPersonController;
import de.htwg.seapal.persondemo.models.IPerson;



public class MenuDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBoat.class).to(de.htwg.seapal.boatdemo.models.impl.Boat.class);
		bind(IBoatController.class).to(de.htwg.seapal.boatdemo.controllers.impl.BoatController.class);	
		
		bind(IPersonController.class).to(de.htwg.seapal.persondemo.controllers.impl.PersonController.class);
		bind(IPerson.class).to(de.htwg.seapal.persondemo.models.impl.Person.class);
		
	}

}
