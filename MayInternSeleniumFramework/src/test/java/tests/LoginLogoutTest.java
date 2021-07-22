package tests;

import businessfunctions.BaseClass;
import pagerepository.LoginPage;
import pagerepository.WelcomePage;
import utilityfunctions.ExcelUtil;

public class LoginLogoutTest extends BaseClass	{

	public static void main(String[] args) {

		BaseClass.openBrowser();
		//		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		//		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		//		driver.findElement(By.id("btnLogin")).click();
		int rCount=ExcelUtil.getRowCount();
		int cCount=ExcelUtil.getColumnCount();

		for(int i=1;i<rCount; i++)	{

			String username=ExcelUtil.getStringCellValue(i, 0);
			String password=ExcelUtil.getStringCellValue(i, 1);
			LoginPage.enterUserName(username);
			LoginPage.enterPassword(password);
			LoginPage.clickLoginButton();

			WelcomePage.clickWelcomeLink();
			//		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			WelcomePage.clickLogoutLink();
			//		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
			//		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			//		driver.findElement(By.linkText("Logout")).click();
		}
		BaseClass.closeBrowser();

	}

}
