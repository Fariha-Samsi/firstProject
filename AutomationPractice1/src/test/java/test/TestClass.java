package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import main.SingletonDriver;
import main.UtilClass;

public class TestClass {

	@Test
	public void testing() {
		
	//driver.get("http://automationpractice.com/index.php");
	WebDriver driver;
	
	SingletonDriver sd = SingletonDriver.getThisClassInstance();
	
	driver = sd.openBrowser("chrome", "https://www.automationpractice.com");
	
	UtilClass uc = new UtilClass();
	
	uc.closeAllBrowsers();
	
	}
}
