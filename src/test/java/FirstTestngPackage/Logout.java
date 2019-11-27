package FirstTestngPackage;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Logout extends Demo2{
	
	//public static WebDriver driver;
	
	
@Test
public void Logout() throws InterruptedException
{	
	  String a="uk1120";
	  driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter User ID')]")).sendKeys(a);
	  WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter Password')]"));
	  password.sendKeys("Upendra@123");
	  //Login.click();
	  driver.findElement(By.xpath("//button[@class='btn btn-info btn-block']")).click();
	  WebElement DropdownToggle=driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')]"));
	  DropdownToggle.click();
	  Thread.sleep(500);
	  driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	  String LogoutURL=driver.getCurrentUrl();
	  String ELogoutURL="http://18.191.28.50:8080/RNT-UAT/logout.do";
	  Assert.assertEquals(LogoutURL, ELogoutURL);
	  Reporter.log("Logout sucessfully");
		  
}




@Test(priority =7, enabled= false)

public void CloseDriver()
{
	  
	  System.out.println("Inside CloseDriver");
}

}
