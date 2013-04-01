package de.htwg.seapal.menudemo.controllers;

import play.*;
import play.mvc.*;

import de.htwg.seapal.persondemo.views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
  
}
