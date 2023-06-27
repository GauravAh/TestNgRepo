package TestPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.SetUpClass;

public class ForgetpassPage {
	
	static WebDriver driver;

	@Test
	public void orangeForget() throws Exception {
		SetUpClass sset = new SetUpClass();
		sset.start();
		driver = sset.getDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("form.oxd-form>div:nth-of-type(4)>p")).click();
	}

}
