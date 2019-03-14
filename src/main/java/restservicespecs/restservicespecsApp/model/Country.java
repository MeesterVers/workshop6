package restservicespecs.restservicespecsApp.model;
import java.sql.Date;

public class Country {
	private String name;
	private String countryCode;
	private String shortName;
	private double population;
	
	public Country(String name, String countryCode, String shortName, double population) {
		this.name = name;
		this.countryCode = countryCode;
		this.shortName = shortName;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}	
}