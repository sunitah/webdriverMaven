package FirstTestngPackage;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class ViewProfile extends Demo2{
	
	public static WebDriver driver;
	
	
@Test(priority =9, enabled=true)
public void CheckPresenceofPagename() throws InterruptedException
{			String Actual_Name = "View Profile";
			WebElement PgName =driver.findElement(By.xpath("//h4[@class='margin0']"));
			String PageName= PgName.getText();

		   Assert.assertEquals(Actual_Name, PageName);
		  
		   Reporter.log("Name on the View  Profile page is correct ");
   
}


@Test(priority =7, enabled= true)

public void VerifyHomeLink()
{
		WebElement home=driver.findElement(By.xpath("a[contains(text(),'Home')"));
	 String hm= home.getText();
	 if(hm!=null)
	 {
		 if(hm =="Home")
		 {
			 Reporter.log("Home Text is present on the web page");
			 home.click();
			 
		 }
		 else
		 {
			 Reporter.log("Home Text is not present on the web page test case fails");
			 driver.close();
		 }
	 }
	 
	 else
	 {
		 Reporter.log("Home Text is not present on the web page test case fails");
		 driver.close();
	 }
	 
	 String CURL= driver.getCurrentUrl();
	 String ExpURL="http://18.191.28.50:8080/RNT-UAT/home.do";

	 Assert.assertEquals(CURL, ExpURL);
	 System.out.println("Assert passed");
	 driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();
	 
}

@Test(priority =7, enabled= true)

public void VerifyRMSLink()
{
		WebElement RMS=driver.findElement(By.xpath("a[contains(text(),'RMS')"));
	 String rms= RMS.getText();
	 if(rms!=null)
	 {
		 if(rms =="RMS")
		 {
			 Reporter.log("RMS Text is present on the web page");
			 RMS.click();
			 
		 }
		 else
		 {
			 Reporter.log("RMS Text is not present on the web page test case fails");
			 driver.close();
		 }
	 }
	 
	 else
	 {
		 Reporter.log("RMS Text is not present on the web page test case fails");
		 driver.close();
	 }
	 
	 String CURL= driver.getCurrentUrl();
	 String ExpURL="http://18.191.28.50:8080/RNT-UAT/rmsdash.do";

	 Assert.assertEquals(CURL, ExpURL);
	 System.out.println("Assert passed");
	// driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();
	 
}

@Test(priority =7, enabled= false)

public void updateprofilepicture()
{
	int i=0;
	WebElement ChooseImg = driver.findElement(By.xpath("//input[@id='image_path']"));
	ChooseImg.click();
	ChooseImg.sendKeys("Libraries\\Pictures\\Pika1.png");
	ChooseImg.sendKeys(Keys.ENTER);
	WebElement Upload = driver.findElement(By.xpath("//input[@id='btnUpload']"));
	Upload.click();
	  
	//img[@id='imageID']
	
	driver.findElement(By.xpath("//span[contains(text(),'View Profile')]")).click();
WebElement ImageFile = driver.findElement(By.xpath("//div[@class='profile-thumb']//img"));
    int cnt;
    Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
    if (!ImagePresent)
    {
    	 cnt=1;
         System.out.println("Image not displayed.");
         Reporter.log("Image not displayed.");
    }
    else
    {
    	 cnt=0;
        System.out.println("Image displayed.");
        Reporter.log("Image is displayed.");
    }
	
	  Assert.assertEquals(cnt, i);
}



@Test(priority =7, enabled= false)

public void CloseDriver()
{
	  
	  System.out.println("Inside CloseDriver");
}

}
