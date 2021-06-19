package com.adactin.prop;

public class Configuration_Manager {

	
	public Configuration_Reader accessConfigReader() throws Throwable {
		
		Configuration_Reader configuration_Reader=new Configuration_Reader();
		
		return configuration_Reader;
	
		
	}
	
	public static Configuration_Manager propertFileManager() throws Throwable {
		
		Configuration_Manager configManager=new Configuration_Manager();
		
		configManager.accessConfigReader();
		
		return configManager;
		
	}
	
}
