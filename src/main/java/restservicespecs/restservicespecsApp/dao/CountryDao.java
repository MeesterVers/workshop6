package restservicespecs.restservicespecsApp.dao;

import java.sql.SQLException;
import java.util.*;

import restservicespecs.restservicespecsApp.model.Country;

public interface CountryDao {
	public List<Country> findAll();
	public List<Country>  getCountryByCountryCode(String countryCode);
}