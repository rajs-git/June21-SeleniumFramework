package businessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Configuration;

public class BaseClass {
	public static WebDriver driver=null;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rsing\\Documents\\Study\\Current\\Yes-M Systems\\MayInternSeleniumFramework\\Drivers\\chromedriver.exe");		
		driver=new ChromeDriver();		
		driver.get(Configuration.getProperty("url"));
	}

	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
