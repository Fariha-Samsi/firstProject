package main;

import java.util.concurrent.TimeUnit;

//A singleton class is a class where we make sure that we pass on same instance on the object.
//Here we wanna pass same driver.
//Q- If we create a singleton driver, what would be the limitation for the testing
//A-

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonDriver {

	protected static WebDriver driver  = null;	
	private static SingletonDriver driverInstance = null;
	
	
	public SingletonDriver(WebDriver driver) {
		
		SingletonDriver.driver = driver;
		
	}
	
	
	public static SingletonDriver getThisClassInstance() {
		
		if(driverInstance == null) 
			driverInstance = new SingletonDriver(driver);
		
		return driverInstance;
		
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}
	/*
	 * public static void open() { openBrowser("sd","f"); }
	 */

	public WebDriver openBrowser(String browser, String url) {
		
		if(driver == null) {
			if(browser.equalsIgnoreCase("Chrome")) {
				
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);
			}
			else if(browser.equalsIgnoreCase("Firefox")) {
				
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);

			}
			else if(browser.equalsIgnoreCase("Edge")) {
				
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				driver.navigate().to(url);

			}		
			else
			{
				System.out.println("Incorrect driver");
			}
		}
		
		
		
		
		return driver;
	}
	
	
}
