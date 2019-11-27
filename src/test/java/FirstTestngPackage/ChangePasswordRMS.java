package FirstTestngPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePasswordRMS extends ErrorValidationonLogin{
	
@Test(priority =9, enabled=false)
public void ChangePassword()
{
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/strong[1]/b[1]/i[1]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Change Password')]")).click();
	
}


}
