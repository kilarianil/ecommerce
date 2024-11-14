package nykaa_utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader 
{
	public static void main(String[] args) throws Throwable 
	{
		System.out.println(readData("Browser"));
	}
	public static String readData(String key) throws Throwable
	{
		String projectpath = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(projectpath+"\\ObjectRepoProperty\\Config.properties");
		Properties property = new Properties();
		property.load(file);
		String value = property.getProperty(key);
		return value;
		
	}

}
