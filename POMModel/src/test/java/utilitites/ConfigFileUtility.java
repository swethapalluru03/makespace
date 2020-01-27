package utilitites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileUtility {
	public File src;
	public FileInputStream fis;
	public static Properties prop;
	
	//Method to load property file 
	public void loadPropertyFile() throws IOException {
		String filePath = "./resources/testData/ConfigFile.properties";
		src = new File(filePath);
		fis = new FileInputStream(src);
		prop = new Properties();
		prop.load(fis);
	}
	//Method to values form property file using Key
	public String getProperty(String propkey) {
		return prop.getProperty(propkey);
	}

}
