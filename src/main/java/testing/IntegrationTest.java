package testing;

import org.junit.Test;

import restservicespecs.restservicespecsApp.model.Country;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {
   countryMethods countryLogic = new countryMethods();
   Country country = new Country(null, null, null, 0);

   //test to check population
   @Test
   public void integrationTest() {
      country.setName("Nederland");
      country.setShortName("NL");
      country.setPopulation(8000);	
      double bonus = countryLogic.perfectlyBalancer(country);
      assertEquals(1000, bonus, 0.0);
      
      // test to check yearly populationgrowth
      country.setName("Nederland");
      country.setShortName("NL");
      country.setPopulation(8000);	
      double population = countryLogic.calculateYearlyPopulationgrowth(country);
      assertEquals(96000, population, 0.0);
      
      // test to check half-yearly populationgrowth hier komt jouw code
     }
   }
