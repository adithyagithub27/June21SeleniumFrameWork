package pagerepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import businessfunctions.BaseClass;

public class HomePage extends BaseClass{
	
	//static WebDriver driver=null;
	
	public static By lnkWelcome=By.partialLinkText("Welcome");
	
	public static By lnkLogout=By.linkText("Logout");
	
	
	public static void clickWelcome() {		
	driver.findElement(lnkWelcome).click();		
	}
	
	public static void clickLogout() {
		driver.findElement(lnkLogout).click();
	}

}
