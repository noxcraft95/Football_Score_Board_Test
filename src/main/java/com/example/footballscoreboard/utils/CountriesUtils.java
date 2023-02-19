package com.example.footballscoreboard.utils;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.StringUtils;

/**
Class responsible for loading a list of countries from a properties file. 
*/
public class CountriesUtils {
	
	public static ArrayList<String> getCountries() {
		ArrayList<String> countries = new ArrayList<String>();
		
		try {
			Properties props = PropertiesLoaderUtils.loadAllProperties("countries.properties");
			String countriesChain = props.getProperty("countries");
			
			//Converts the chain of countries in elements of string as each country
			if(StringUtils.hasText(countriesChain)) {
				countries = new ArrayList<String>(Arrays.asList(countriesChain.split(",")));
				for(int i = 0; i < countries.size(); i++) {
				    String valor = countries.get(i).trim(); //Clean spaces
				    countries.set(i, valor); //assign new value
				}

			}else {
				System.err.print("Properties 'countries' doesn't have defined any country");
			}
			
		} catch (IOException e) {
			System.err.print("Error loading properties file 'countries'");
		}
		
		return countries;
	}
}
