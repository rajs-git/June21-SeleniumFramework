package pagerepository;
import org.openqa.selenium.By;
import businessfunctions.BaseClass;

public class WelcomePage extends BaseClass{	

	static By welcomeLink=By.xpath("//*[@id=\"welcome\"]");
	static By logoutLink=By.linkText("Logout");

	static public void clickWelcomeLink() {
		driver.findElement(welcomeLink).click();
	}

	static public void clickLogoutLink() {
		driver.findElement(logoutLink).click();
	}

}
