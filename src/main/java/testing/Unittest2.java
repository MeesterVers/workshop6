package testing;
import org.junit.Test;

import restservicespecs.restservicespecsApp.model.Country;

import static org.junit.Assert.assertEquals;

public class Unittest2 {
   countryMethods countryLogic = new countryMethods();
   Country country = new Country(null, null, null, 0);

   // test to check yearly populationgrowth
   @Test
   public void testCalculateYearlyPopulationGrowth() {
	   	country.setName("Nederland");
	    country.setShortName("NL");
	    country.setPopulation(8000);
		
      double population = countryLogic.calculateYearlyPopulationgrowth(country);
      assertEquals(96000, population, 0.0);
   }
}