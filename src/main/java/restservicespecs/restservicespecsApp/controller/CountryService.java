package restservicespecs.restservicespecsApp.controller;

import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import java.util.*;

import restservicespecs.restservicespecsApp.model.Country;
import restservicespecs.restservicespecsApp.dao.CountryDaolmpl;
import restservicespecs.restservicespecsApp.helper.DataNotFoundException;

@Path("/countries")
public class CountryService  {

  @GET
  @Produces("application/json")
  public String getCountries() {
    CountryDaolmpl countryImpl = new CountryDaolmpl();

    JsonArrayBuilder jab = Json.createArrayBuilder();

    for (Country country : countryImpl.findAll()) {
      JsonObjectBuilder job = Json.createObjectBuilder();
      job.add("Name", country.getName());
      job.add("CountryCode", country.getCountryCode());
      job.add("ShortName", country.getShortName());
      job.add("Popuplation", country.getPopulation());

      jab.add(job);
    }

    JsonArray array = jab.build();
    return array.toString();
  }

//get country by code
  @GET 
  @Path("{countryCode}")
  @Produces("application/json")
  public String getByCountryCode(@PathParam("countryCode") String countryCode) {
   CountryDaolmpl countryImpl = new CountryDaolmpl();

   JsonArrayBuilder jab = Json.createArrayBuilder();
   for (Country country : countryImpl.getCountryByCountryCode(countryCode.toUpperCase())) {

     JsonObjectBuilder job = Json.createObjectBuilder();
     job.add("Name", country.getName());
     job.add("CountryCode", country.getCountryCode());
     job.add("ShortName", country.getShortName());
     job.add("Popuplation", country.getPopulation());

     jab.add(job);
   }

   JsonArray array = jab.build();
   if(array.isEmpty()) {
	   throw new DataNotFoundException("No Country found");
   }else {
	   return array.toString(); 
   }
 }
}