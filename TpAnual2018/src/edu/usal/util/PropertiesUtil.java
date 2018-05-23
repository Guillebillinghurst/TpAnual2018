package edu.usal.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil { //para saber que es un util, ponemos el nombre de la clase seguido de Util
	
	private static Properties properties;
	
	public static String getPathCliente(){
		properties = new Properties();
		
		try {
			properties.load(new FileReader("config.properties"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		return properties.getProperty("pathcliente");
		
	}
	
	
	
	
}
