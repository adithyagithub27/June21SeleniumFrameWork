package businessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Config;

public class BaseClass {
	public static WebDriver driver=null;
	
	public static void OpenBrowser() {	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\MaySeleniumFramework\\src\\main\\java\\drivers\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.get(Config.getPropertyValue("url"));
	}
	
	
	public static void CloseBrowser() {
		driver.close();
		driver.quit();
	}

}
