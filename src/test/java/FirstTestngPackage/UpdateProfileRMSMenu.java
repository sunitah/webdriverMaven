package FirstTestngPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateProfileRMSMenu {
	
	WebDriver driver;
@Test(priority =9, enabled=true)
public void UpdateProfileRMS() throws InterruptedException
{
	//Initializing driver
	  System.setProperty("webdriver.chrome.driver","E:\\class\\Chrome driver versions\\chrome d 77\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("http://18.191.28.50:8080/RNT-UAT");
	  driver.manage().window().maximize();
	  
	  //USer name and password are given as input
	  String a="uk1120";
	  driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter User ID')]")).sendKeys(a);
	  WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter Password')]"));
	  password.sendKeys("Upendra@123");
		//Login.click();
	  driver.findElement(By.xpath("//button[@class='btn btn-info btn-block']")).click();
	  
	  //Click on resource management
	  driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();
	
	  //click on Update profile
	  driver.findElement(By.xpath("//span[contains(text(),'Update Profile')]")).click();
	  
	  Thread.sleep(1000);
//String s =driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/input[1]")).getText();
	  
	  //Get the First and Last name which is displayed.
	  WebElement First_Name = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/input[1]"));
	  String FN = First_Name.getAttribute("value");
	  
	  WebElement Last_Name = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[3]/div[1]/input[1]"));
	  String LN= Last_Name.getAttribute("value");
	  String FN1 = FN+" ";
	  String Name = FN1+LN;
	  System.out.println("Text value is "+ FN);
	  System.out.println("Name is "+ Name);
	//  String ParentGUID =driver.getWindowHandle();
	  Thread.sleep(500);
	  
	  
	  //Click on View Profile option
	  driver.findElement(By.xpath("//span[contains(text(),'View Profile')]")).click();
	  Thread.sleep(500);
	 
	  //Get the Displayed Name on View PRofile page .
	//	 WebElement Displayed_Name = driver.findElement(By.xpath(" /html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/header[1]/h3[1]"));
	 WebElement Displayed_Name= driver.findElement(By.xpath("//span[contains(text(),'Father Name:')]")); 
	  Thread.sleep(500);
	  //String elementval1 = element.getAttribute("value");
	  String Displayed_Name_VP= Displayed_Name.getText();
	  System.out.println("Text value is "+ Displayed_Name_VP);
	//  String ChildGUID=driver.getWindowHandle();
	  
	//  driver.switchTo().window(ParentGUID);
	  Thread.sleep(1000);
	  
	//  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/ul[1]/li[2]/a[1]")).click();
	  
	  //  driver.findElement(By.cssSelector("div.ui:nth-child(3) div.ui-content.ui-content-aside-overlay:nth-child(6) div.ui-content-body:nth-child(3) div.ui-container div.row div.col-md-12 div.panel div.panel-body1 form.wizard-long.wizard.clearfix div.actions.clearfix ul:nth-child(1) li:nth-child(2) > a:nth-child(1)")).click();
	  //driver.findElement(By.cssSelector("div.ui:nth-child(3) div.ui-content.ui-content-aside-overlay:nth-child(6) div.ui-content-body:nth-child(3) div.ui-container div.row div.col-md-12 div.panel div.panel-body1 form.wizard-long.wizard.clearfix div.actions.clearfix ul:nth-child(1) li:nth-child(2) > a:nth-child(1)")).click();
	// Thread.sleep(500);
	//  driver.findElement(By.cssSelector("div.ui:nth-child(3) div.ui-content.ui-content-aside-overlay:nth-child(6) div.ui-content-body:nth-child(3) div.ui-container div.row div.col-md-12 div.panel div.panel-body1 form.wizard-long.wizard.clearfix div.actions.clearfix ul:nth-child(1) li:nth-child(2) > a:nth-child(1)")).click();
	//  Thread.sleep(500);
	  //driver.findElement(By.cssSelector("div.ui:nth-child(3) div.ui-content.ui-content-aside-overlay:nth-child(6) div.ui-content-body:nth-child(3) div.ui-container div.row div.col-md-12 div.panel div.panel-body1 form.wizard-long.wizard.clearfix div.actions.clearfix ul:nth-child(1) li:nth-child(3) > a:nth-child(1)")).click();
	  //Thread.sleep(500);
	  
	  //  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/aside[1]/ul[1]/li[4]/a[1]/span[1]")).click();
}


@Test(priority =7, enabled= false)

public void PersonalInfo()
{
	String s =driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/input[1]")).getText();
	  
	  System.out.println("Inside PersonalInfo"+s);
}



@Test(priority =7, enabled= false)

public void CloseDriver()
{
	  
	  System.out.println("Inside CloseDriver");
}

}
