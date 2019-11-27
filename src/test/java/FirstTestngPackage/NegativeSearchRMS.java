package FirstTestngPackage;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NegativeSearchRMS extends Demo2{
	


@Test(priority =6, enabled=true)
public void Search_Negative_Test() throws InterruptedException
{
	  String a="hd2";
	  driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter User ID')]")).sendKeys(a);
	  WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter Password')]"));
	  password.sendKeys("1002");
	  
	  driver.findElement(By.xpath("//button[@class='btn btn-info btn-block']")).click();;
	  	//Login.click();
	  driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();;
		  
	//  driver.findElement(By.xpath(" //input[@class='form-control input-sm'] ")).sendKeys("");
	  
	  WebElement textbox = driver.findElement(By.xpath(" //input[@class='form-control input-sm'] "));
	  textbox.sendKeys("Jayesh");

	  driver.findElement( By.xpath(" //input[@class='form-control input-sm'] ")).sendKeys(Keys.ENTER);
	    

	  String bodyText = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]")).getText();
	   // Assert.assertTrue("Text not found!", bodyText.contains("Harshita"));
	  
	//  Assert.assertTrue( bodyText.contains("Harshita"));
	  Assert.assertNotEquals( bodyText.contains("Harshita"), true);
	  System.out.println("Inside Search Validation");
	  Reporter.log("If incorrect value is passed in the search box then the result is not found");
	  Thread.sleep(5000);
}

}
