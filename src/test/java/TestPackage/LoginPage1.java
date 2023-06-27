package TestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.SetUpClass;

public class LoginPage1 {
	
	static WebDriver driver;

	@Test
	public void orangeTitle() {
		SetUpClass sset = new SetUpClass();
		sset.start();
		driver = sset.getDriver();
		driver.manage().window().maximize();
		System.out.println("Current Title is.." + driver.getTitle());
	}


}
