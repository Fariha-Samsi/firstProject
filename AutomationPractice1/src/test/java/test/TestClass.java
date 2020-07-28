package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void testing() {
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
	
	}
}
