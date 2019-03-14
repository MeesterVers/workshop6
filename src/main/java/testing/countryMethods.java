package testing;

import restservicespecs.restservicespecsApp.model.Country;

public class countryMethods {
   // Calculate the yearly population growth
   public double calculateYearlyPopulationgrowth(Country country) {
      double population = 0;
      population = country.getPopulation() * 12;
      return population;
   }
	
   // Calculate the bonus amount of babies the country gets
   public double perfectlyBalancer(Country country) {
      double bonus = 0;
		
      if(country.getPopulation() < 10000){
         bonus = 1000;
      }else{
         bonus = 500;
      }
		
      return bonus;
   }
   //shrijf hier de functie voor de bereking van de halfjaarlijke populatie groei
}