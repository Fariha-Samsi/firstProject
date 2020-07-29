package main;

import org.openqa.selenium.WebDriver;

public class UtilClass {

//	public UtilClass(WebDriver driver) {
//		super(driver);
//	}
	
	SingletonDriver sd = SingletonDriver.getThisClassInstance();
	WebDriver driver = sd.getDriver();

	public void closeCurrentBrowser(){
		
		driver.close();
		
	}
	
	public void closeAllBrowsers() {
	
		driver.quit();
	}
	
}
