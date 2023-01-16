package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {

	public static String getvalueForKey(String key) throws Exception  {
		
		Properties configProperties = new Properties();//Used for 
		
		configProperties.load(new FileInputStream(new File("C:\\Users\\bharg\\eclipse-july\\BhargavQAProject\\PropertiesFile\\Environment.properties")));
		
		return configProperties.getProperty(key);//gettting the keys 
	}
}
