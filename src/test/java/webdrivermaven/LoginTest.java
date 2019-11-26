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
	  String a="hd2";
	  driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter User ID')]")).sendKeys(a);
	  WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter Password')]"));
	  password.sendKeys("1002");
	  
	  driver.findElement(By.xpath("//button[@class='btn btn-info btn-block']")).click();;
	Reporter.log("URL test Passed123");
	Thread.sleep(5000);
	}
 
	
}



