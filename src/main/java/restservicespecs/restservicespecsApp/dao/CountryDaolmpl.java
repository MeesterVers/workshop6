package restservicespecs.restservicespecsApp.dao;

import java.io.FileReader;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import javax.json.*;

import restservicespecs.restservicespecsApp.model.Country;

public class CountryDaolmpl implements CountryDao{
	private List<Country> countries = new ArrayList<Country>();
	
	public List<Country> findAll() {
		Country country1 = new Country("Suriname", "SR", "SUR", 500000);
		Country country2 = new Country("Netherlands", "NL", "NLD", 1700000);
		Country country3 = new Country("Aruba", "AW", "ABW", 600000);
		Country country4 = new Country("Morocco", "MA", "MAR", 600000);
		Country country5 = new Country("Ghana", "GH", "GHA", 1000000);
		Country country6 = new Country("Syria", "SY", "SYR", 5000000);
		
		countries.add(country1);
		countries.add(country2);
		countries.add(country3);
		countries.add(country4);
		countries.add(country5);
		countries.add(country6);

		return countries;
	}

	//get artikel by Country Code
	public List<Country> getCountryByCountryCode(String countryCode){
		List<Country> foundCountry = new ArrayList<Country>();
		for (Country country : findAll()) {
			if(country.getCountryCode().equals(countryCode)) {
				foundCountry.add(country);
				return foundCountry;
			}
		}
		return foundCountry;
	}
}