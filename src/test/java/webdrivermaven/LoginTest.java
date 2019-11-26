package webdrivermaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {
	
public static WebDriver driver;

@Test
public void setup() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "E:\\class\\Chrome driver versions\\chrome d 77\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://18.191.28.50:8080/RNT-UAT/");
	
	String actualUrl="http://18.191.28.50:8080/RNT-UAT/"; 
	String expectedUrl= driver.getCurrentUrl(); 
	Assert.assertEquals(expectedUrl,actualUrl);
	System.out.println("Inside URL test");
	Reporter.log("URL test Passed123");
	Thread.sleep(5000);
	}
 
	
}



