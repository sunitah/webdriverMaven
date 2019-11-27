package FirstTestngPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo2 {
		
	public static WebDriver driver;
		@BeforeClass
		public void setupApplication()
		{
			
			Reporter.log("=====Browser Session Started=====", true);
			
			System.setProperty("webdriver.chrome.driver","E:\\class\\Chrome driver versions\\chrome d 77\\chromedriver.exe");
	            driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://18.191.28.50:8080/RNT-UAT/");
			
			Reporter.log("=====Application Started=====", true);
		}
		
		
		@AfterClass
		public void closeApplication()
		{
			driver.quit();
			Reporter.log("=====Browser Session End=====", true);
			
		}
}
