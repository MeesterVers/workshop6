package testing;
import org.junit.Test;

import restservicespecs.restservicespecsApp.model.Country;

import static org.junit.Assert.assertEquals;

public class verkeerdeUnitTest {
   countryMethods countryLogic = new countryMethods();
   Country country = new Country(null, null, null, 0);

   //test to check population 
   @Test
   public void testPopulation() {
      country.setName("Nederland");
      country.setShortName("NL");
      country.setPopulation(8000);
	//hier vullen we bij assertEquals expres een verkeerde waarde in zodat het fout gaat	
      double bonus = countryLogic.perfectlyBalancer(country);
      assertEquals(500, bonus, 0.0);
   }
}