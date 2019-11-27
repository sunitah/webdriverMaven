package FirstTestngPackage;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UpdateProfileRMSPer extends Demo2 {
	
//	public static WebDriver driver;
	String MN="Indrayaniiiiiii";
	String MotherName_UP;
@Test(priority =9, enabled=true)
public void UpdateProfileRMS() throws InterruptedException
{
	//Initializing driver
	/*  System.setProperty("webdriver.chrome.driver","E:\\class\\Chrome driver versions\\chrome d 77\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("http://18.191.28.50:8080/RNT-UAT");
	  driver.manage().window().maximize();*/
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
	  
	 //Clear the textbox value
	 driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[2]/div[1]/input[1]")).clear();
	 driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Trivendraa");
	 
	 //Clearthe textbox 
	 driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[9]/div[1]/input[1]")).clear();
	 driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[9]/div[1]/input[1]")).sendKeys("Nagpur"); 
	
	 //Clear the TextBox
	 driver.findElement(By.xpath
			 ("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).clear();
	 String FN1 ="Trivendraa";
	 String FatherName_UP = "FatherName:Trivendraa";
	 driver.findElement(By.xpath
			 ("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Trivendraa");

	 
	 //Clear the TextBox
	 
	// String MotherName_UP="MotherName:"+MN;
	 driver.findElement(By.xpath
			 ("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).clear();
	 driver.findElement(By.xpath
			 ("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(MN);
	
	 //Click the TextBox
	 
	 driver.findElement(By.xpath
			 ("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/ul[1]/li[2]/a[1]")).click();
	 
	 //Click the TextBox
	 driver.findElement(By.xpath
			 ("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/ul[1]/li[2]/a[1]")).click();
	 
	 //Click the TextBox
	 driver.findElement(By.xpath
			 ("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/ul[1]/li[2]/a[1]")).click();
	 
	 //Click the Text Box
	 driver.findElement(By.xpath
			 ("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/ul[1]/li[3]/a[1]")).click();
	 Thread.sleep(1000);
	 
	//WAIT UNTIL ALERT OPENS AND THEN CLICK ON OK/ACCEPT
     WebDriverWait wait = new WebDriverWait(driver, 30);
     wait.until(ExpectedConditions.alertIsPresent());
     Alert alert = driver.switchTo().alert();
     alert.accept(); //ACCEPT ACTION
     Reporter.log("HEllo Reporter");
     //WAIT UNTIL ALERT OPENS AND THEN CLICK ON CANCEL/REJECT
   /*  WebDriverWait wait = new WebDriverWait(driver, 30);
     wait.until(ExpectedConditions.alertIsPresent());
     Alert alert = driver.switchTo().alert();
     alert.dismiss(); //REJECT ACTION*/
     
     // To check that updated value are same or not on View profile page.
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/aside[1]/ul[1]/li[2]/a[1]/span[1]")).click(); 
     Thread.sleep(500);
 //   WebElement Father_Name= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ul[1]/li[2]/div[1]")); 
      WebElement Father_Name= driver.findElement(By.xpath("//div[5]//ul[1]//li[2]//div[1]"));
      
      
      
      
     //String Father_N = Father_Name.getAttribute("value");
    String Father_N= Father_Name.getText();
    Father_N = Father_N.replaceAll("\\s", "");
    
    System.out.println("Father value on View profile page "+Father_N);
    System.out.println("Entered name "+FatherName_UP);
    
   Assert.assertEquals(FatherName_UP,Father_N);
	System.out.println("This line is executed because assertEquals ");
   Reporter.log("Updated Father name on Profile is same as that on View PRofile page ");
   Thread.sleep(500);
   
}


@Test(priority =7, enabled= false)

public void PersonalInfo()
{
	//Clear the TextBox
	//	 String MN="Indrayaniiiiiii";
		 String MotherName_UP="MotherName:"+MN;
		 driver.findElement(By.xpath("//a[contains(text(),'Experience')]")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Educational')]")).click();
		 WebElement Mother_Name= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ul[1]/li[3]/div[1]"));
		   //String Father_N = Father_Name.getAttribute("value");
		    String Mother_N= Mother_Name.getText();
		    Mother_N = Mother_N.replaceAll("\\s", "");
		    
		    System.out.println("Father value on View profile page "+Mother_N);
		    System.out.println("Entered name "+MotherName_UP);
		 
		 System.out.println("Mother Name"+ Mother_Name); 
		   Assert.assertEquals(Mother_Name,MotherName_UP);
			System.out.println("This line is executed because assertEquals ");
		   Reporter.log("Updated Father name on Profile is same as that on View PRofile page ");
		   
}



@Test(priority =7, enabled= false)

public void CloseDriver()
{
	  
	  System.out.println("Inside CloseDriver");
}

}
