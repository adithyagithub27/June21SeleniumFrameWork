package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import businessfunctions.BaseClass;
import businessfunctions.LoginLogoutFunctions;
import pagerepos.HomePage;
import pagerepos.LoginPage;

public class LoginandLogoutTest extends BaseClass {

	@Test
	public void loginlogouttest() {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\MaySeleniumFramework\\src\\main\\java\\drivers\\chromedriver.exe");		
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		BaseClass.OpenBrowser();		
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
		//driver.findElement(By.name("Submit")).click();
		
	//	LoginPage.enterUserName();
	//	LoginPage.enterPassword();
	//	LoginPage.clickLoginbutton();
		
		LoginLogoutFunctions.login();
		LoginLogoutFunctions.logout();
		
//		HomePage.clickWelcome();
//		HomePage.clickLogout();
	//	driver.findElement(By.partialLinkText("Welcome")).click();
	//	driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	//	driver.findElement(By.linkText("Logout")).click();
		
		BaseClass.CloseBrowser();
//		driver.close();
//		driver.quit();

	}	
}
