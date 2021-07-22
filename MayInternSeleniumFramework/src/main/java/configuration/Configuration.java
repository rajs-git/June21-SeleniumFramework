package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

	public static String getProperty(String keyValue)	{

		FileReader data = null;

		try {
			data = new FileReader("C:\\Users\\rsing\\Documents\\Study\\Current\\Yes-M Systems\\MayInternSeleniumFramework\\src\\main\\java\\configuration\\Configuration.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("The file is not present at the stated location");
		}

		Properties p = new Properties();

		try {
			p.load(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p.getProperty(keyValue);

		//System.out.println(p.getProperty("username"));
		//System.out.println(p.getProperty("password1"));
		//System.out.println(p.getProperty("url"));
	}
}


