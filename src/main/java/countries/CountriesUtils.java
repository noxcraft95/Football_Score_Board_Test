package countries;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.StringUtils;

/**
Class responsible for loading a list of countries from a properties file. 
*/
public class CountriesUtils {
	
	public ArrayList<String> getCountries() {
		ArrayList<String> countries = new ArrayList<String>();
		try {
			Properties props = PropertiesLoaderUtils.loadAllProperties("countries.properties");
			
			String countriesChain = props.getProperty("countries");
			if(StringUtils.hasText(countriesChain)) {
				//TODO AVD: CLEAN CHAIN FROM SPACES...
				
				
			}else {
				System.err.print("Properties 'countries' doesn't have defined any country");
			}
			
		} catch (IOException e) {
			System.err.print("Error loading properties file 'countries'");
		}
		
		return countries;
	}
}
