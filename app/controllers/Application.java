package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import com.google.gson.JsonObject;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void rjson(){
    	//System.out.println("inside Application.rjson()");
    	JsonObject json = new JsonObject();
        json.addProperty("point1", 0);
        //json.addProperty("point2", 15.0);
        System.out.println("adding point 0 to the tokyo temperature last value");
        renderJSON(json.toString());
    }
    	
    	

}