package webServiceClasses;

import DAO.Database;
import model.PersonTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 6/11/2020.
 */



@Path("/service")
public class ServiceClass {

    @Path("/helloWord")
    @Produces("text/plain")
    @GET
    public String myMethod(){

        return " Hello This is My First Service";
    }
    @GET
    @Produces("application/json")
    @Path("/persons")
    public List<PersonTO> getAllPersonJson() {
        Database db = new Database();
        System.out.println("*********************");

        List<PersonTO> person = new ArrayList<PersonTO>();
        try {
            person = db.select();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return person;
    }
}
