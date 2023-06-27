package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePackage.SetUpClass;

public class LoginPage {
	
	static WebDriver driver;
	
	@Test(priority = 1)
		public void orangeUrl() {
		SetUpClass sset = new SetUpClass();
		sset.start();
		driver = sset.getDriver();
		driver.manage().window().maximize();
		System.out.println("Current url is.." + driver.getCurrentUrl());
	}
	
	@Test(dataProvider = "LoginData",priority = 2)
	public void loginDataprovider(String uname,String ppass) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(ppass);
	}
	
	@DataProvider(name = "LoginData")
	public String[][] updateData() {
		
		String[][] arr = new String[2][2];
		arr[0][0]="aabb@gmail.com";
		arr[0][1]="11qq11qq";
		arr[1][0]="aabbcc@gmail.com";
		arr[1][1]="552566";
		
		return arr;
	}
	
}
