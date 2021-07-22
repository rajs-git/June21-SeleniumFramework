package pagerepository;

import org.openqa.selenium.By;
import businessfunctions.BaseClass;
import configuration.Configuration;

public class LoginPage extends BaseClass {	
	//static webDriver driver = null;
	static By username=By.xpath("//*[@id=\"txtUsername\"]");
	static By password=By.xpath("//*[@id=\"txtPassword\"]");
	static By loginbtn=By.id("btnLogin");	

	static public void enterUserName(String UserName) {
		driver.findElement(username).sendKeys(UserName);
	}

	static public void enterPassword(String Password) {
		driver.findElement(password).sendKeys(Password);
	}

	static public void clickLoginButton() {
		driver.findElement(loginbtn).click();
	}
}
