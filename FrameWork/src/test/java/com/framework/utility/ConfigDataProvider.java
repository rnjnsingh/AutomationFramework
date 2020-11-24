package com.framework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;

	public ConfigDataProvider() throws IOException
	{
		File src= new File("./Configurations/config.properties");
		FileInputStream fis =new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);		 
	}
	
	public String getPropertyvalue( String keyToSearch)
	{
		return pro.getProperty(keyToSearch);
	}
}
