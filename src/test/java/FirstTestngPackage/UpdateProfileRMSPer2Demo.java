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
import org.testng.asserts.SoftAssert;

public class UpdateProfileRMSPer2Demo extends Demo2{
	
	public static WebDriver driver;
	String MN="Indrayaniiiiiii";
	String MotherName_UP;
	String No_Of_Siblings= "2";
	String Bloodgroup1 ="O+";
	
	@Test(priority=8)
	public void ByDefaultPerPg() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\class\\Chrome driver versions\\chrome d 77\\chromedriver.exe");
        driver=new ChromeDriver();
	
        driver.manage().window().maximize();
	
        driver.get("http://18.191.28.50:8080/RNT-UAT/");
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
		  
		  Thread.sleep(500);
		  WebElement Perinfo =driver.findElement(By.xpath("//fieldset[@id='step-advanced-form-p-0']//h3[contains(text(),'Personal Information')]"));
		  String PerIn = Perinfo.getText();
		//  String PersonalInfo = PerIn.replaceAll("\\s","");
		  System.out.println("Per in ----"+PerIn);
		  String ActString = "Personal Information";
		  Assert.assertEquals(ActString, PerIn);
		  Reporter.log("Default page dispalyed is Personal info");
		  
		  
		  
	}
	
	
@Test(priority =9, enabled=false)
public void UpdateProfileRMS() throws InterruptedException
{
    boolean Test_Case=false;


	 //Clear the textbox value
	 driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[2]/div[1]/input[1]")).clear();
	 driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Trivendraa");
	 
	 //Clear the textbox 
	 driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[9]/div[1]/input[1]")).clear();
	 driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/fieldset[1]/div[1]/div[9]/div[1]/input[1]")).sendKeys("Nagpur"); 
	
	 //Clear the textbox
	// driver.findElement(By.xpath("//select[@name='bloodGroup']")).clear();
	 Select BloodGroup = new Select(driver.findElement(By.xpath("//select[@name='bloodGroup']")));
	 BloodGroup.selectByVisibleText(Bloodgroup1);
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
	 //Clear the TextBox
	 
	 driver.findElement(By.xpath("//input[@id='noofsiblings']")).clear();
	 driver.findElement(By.xpath("//input[@id='noofsiblings']")).sendKeys(No_Of_Siblings);
	
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
     
     //WAIT UNTIL ALERT OPENS AND THEN CLICK ON CANCEL/REJECT
   /*  WebDriverWait wait = new WebDriverWait(driver, 30);
     wait.until(ExpectedConditions.alertIsPresent());
     Alert alert = driver.switchTo().alert();
     alert.dismiss(); //REJECT ACTION*/
     
     // To check that updated value are same or not on View profile page.
     driver.findElement(By.xpath("/html[1]/body[1]/div[3]/aside[1]/ul[1]/li[2]/a[1]/span[1]")).click(); 
     Thread.sleep(500);
 
      WebElement Father_Name= driver.findElement(By.xpath("//div[5]//ul[1]//li[2]//div[1]"));
      
     String Father_N= Father_Name.getText();
    Father_N = Father_N.replaceAll("\\s", "");
    
    System.out.println("Father name on View profile page "+Father_N);
    System.out.println("Entered name "+FatherName_UP);
    
    if (FatherName_UP.equalsIgnoreCase(Father_N)) 
       {
    	System.out.println("Father name on View profile page - "+Father_N);
        System.out.println("Entered name -"+FatherName_UP);
        int x=FatherName_UP.length();
        System.out.println("x length -"+x);
        int y=Father_N.length();
        System.out.println("y length -"+y);
        
    	Reporter.log("Father name is same testcase passed");
    	Test_Case=true;
    }
    else
    {
    	Reporter.log("Father name is incorrect displayed");
    	Test_Case=false;
    }
    

   Thread.sleep(500);
   
	//Clear the TextBox
	//	 String MN="Indrayaniiiiiii";
		 String MotherName_UP="MotherName:"+MN;
		//WAIT UNTIL ALERT OPENS AND THEN CLICK ON OK/ACCEPT
	     
	     wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Experience')]")));
	  
	 	 
	//	 driver.findElement(By.xpath("//a[contains(text(),'Experience')]")).click();
		// driver.findElement(By.xpath("//a[contains(text(),'Educational')]")).click();
		 WebElement Mother_Name= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/ul[1]/li[3]/div[1]"));
		   //String Father_N = Father_Name.getAttribute("value");
		    String Mother_N= Mother_Name.getText();
		    Mother_N = Mother_N.replaceAll("\\s", "");
		    
		    System.out.println("Mother name on View profile page "+Mother_N);
		    System.out.println("Entered name "+MotherName_UP);
		 
		    if(Mother_N.equalsIgnoreCase(MotherName_UP) )
		    {
		    	Reporter.log("Mother name on View profile page is same and the Test case is passed ");
		    	Test_Case= true;
		    }
		    else
		    {
		    	Reporter.log("Mother name is incorrect on the View pageTest case Failed");
		    	Test_Case=false;
		    }

		    WebElement Address = driver.findElement(By.xpath("//div[4]//ul[1]//li[4]//div[1]"));
			String Address1= Address.getText();
			Address1 = Address1.replaceAll("\\s", "");
			String Str="AddressKharadi,Pune,411014";

			    System.out.println("Address name on View profile page "+Address1);
			    System.out.println(" Company address  is visible on the View profile page"+ Str);
			 

			    if(Address1.equalsIgnoreCase(Str) )
			    {
			    	Reporter.log("Address  on View profile page is same and the Test case is passed ");
			    	Test_Case= true;
			    }
			    else
			    {
			    	Reporter.log("Address is incorrect on the View pageTest case Failed");
			    	Test_Case=false;
			    }
		    /*
			    WebElement No_Siblings = driver.findElement(By.xpath("//div[contains(text(),'2')]"));
				String Siblings_Count= No_Siblings.getText();
				Siblings_Count = Siblings_Count.replaceAll("\\s", "");
				

				System.out.println("Sibling count on Update profile page "+No_Of_Siblings);
				System.out.println(" Siblings count visible on the View profile page"+ Siblings_Count);
				 

				    if(Siblings_Count.equalsIgnoreCase(No_Of_Siblings) )
				    {
				    	Reporter.log("Number of Siblings Displayed on View profile page is same and the Test case is passed ");
				    	Test_Case= true;
				    }
				    else
				    {
				    	Reporter.log("Address is incorrect on the View pageTest case Failed");
				    	Test_Case=false;
				    } 
		    
			WebElement bloodgroup = driver.findElement(By.xpath("//div[5]//ul[1]//li[1]//div[1]"));
			String blood_Group= bloodgroup.getText();
			blood_Group = blood_Group.replaceAll("\\s", "");
			System.out.println("Bloodgroup on View profile page "+blood_Group);
			System.out.println(" BloodGroup  is visible on the View profile page"+ Str);
			
			  if(blood_Group.equalsIgnoreCase(Bloodgroup1) )
			    {
			    	Reporter.log("Blood group Displayed on View profile page is same and the Test case is passed ");
			    	Test_Case= true;
			    }
			  else
			    {
			    	Reporter.log("Selected blood group is incorrect on the View pageTest case Failed");
			    	Test_Case=false;
			    } */
   
		    
		    
		   System.out.println("test case value -"+Test_Case);
		   Assert.assertEquals(Test_Case, true);
		   //System.out.println("This line is executed because assertEquals ");
		   Reporter.log("All the test cases on the View  Profile page is same as that on Update Profile page ");

   
   
}


@Test(priority =10, enabled= false)

public void PersonalInfo()
{
	//Clear the TextBox
	//	 String MN="Indrayaniiiiiii";
		 String MotherName_UP="MotherName:"+MN;
		//WAIT UNTIL ALERT OPENS AND THEN CLICK ON OK/ACCEPT
	     WebDriverWait wait = new WebDriverWait(driver, 30);
	     wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Experience')]")));
	   //  Alert alert = driver.switchTo().alert();
	     //alert.accept(); //ACCEPT ACTION
	     Reporter.log("Hello Reporter");
		 
	//	 driver.findElement(By.xpath("//a[contains(text(),'Experience')]")).click();
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



@Test(priority=11)
public void UpdateProfileMobileNo()
{
	driver.findElement(By.xpath("//span[contains(text(),'Update Profile')]")).click();
	String input="abc";
	int input2=808585858;
	driver.findElement(By.xpath("//input[@id='mobileno']")).clear();
	driver.findElement(By.xpath("//input[@id='mobileno']")).sendKeys(input);
	String s=input.getClass().getName();
	String s1="java.lang.String";
	System.out.println("outside if loop- "+s);
	if(s.equalsIgnoreCase(s1))
	{
		System.out.println("Inside if loop");
	WebElement MsgMobileno= driver.findElement(By.xpath("//label[@id='mobmessage']"));
	String msg1=MsgMobileno.getText();
	String msg2="Not Valid Mobile Phone Number" ; 
	Assert.assertEquals(msg1, msg2);
	Reporter.log("Alphabets are not allowed msgfor the same is dispalted");
	
	System.out.println("String ==="+s);
	  
	}
	else
	{
		Reporter.log("Only numeric values are accepted");
	}
}


@Test(priority=12)
public void UpdateProfilePhoneNo()
{
	driver.findElement(By.xpath("//span[contains(text(),'Update Profile')]")).click();
	String input="abc";
	int input2=808585858;
	driver.findElement(By.xpath("//input[@id='phonNo']")).clear();
	driver.findElement(By.xpath("//input[@id='phonNo']")).sendKeys(input);
	String s=input.getClass().getName();
	String s1="java.lang.String";
	System.out.println("outside if loop- "+s);
	if(s.equalsIgnoreCase(s1))
	{
		System.out.println("Inside if loop");
	WebElement MsgPhoneno= driver.findElement(By.xpath("//label[@id='nummessage']"));
	String msg1=MsgPhoneno.getText();
	String msg2="Please input numeric characters only"; 
	Assert.assertEquals(msg1, msg2);
	Reporter.log("Alphabets are not allowed msg for the same is dispalted");
	
	System.out.println("String ==="+s);
	  
	}
	else
	{
		Reporter.log("Only numeric values are accepted");
	}
}


@Test(priority =13, enabled= false)

public void UpdateProfileNextBTN()
{
	  
	driver.findElement(By.xpath("//a[contains(text(),'Next')]")).click();
	WebElement EduName= driver.findElement(By.xpath("//fieldset[@id='step-advanced-form-p-1']//h3[contains(text(),'Educational Details')]")) ;
	String Eduname= EduName.getText();
	String Act="Educatinal Details";
	Assert.assertEquals(Eduname, Act);
	Reporter.log("On Personal info section when we click on the next button then Educational Details section is displayed");
	
}


@Test(priority =14, enabled= false)

public void SSCValidation()
{
	SoftAssert softAssertion= new SoftAssert();
	  driver.findElement(By.xpath("//input[@id='percentage1']")).clear();
	  driver.findElement(By.xpath("//input[@id='percentage1']")).sendKeys("74.0");
	  
	  driver.findElement(By.xpath("//fieldset[@id='step-advanced-form-p-1']//div[@class='row']//div[1]//div[1]//div[1]//div[2]//div[1]//input[1]")).clear();
	  
	  driver.findElement(By.xpath("//select[@id='yearofpassingyear1']")).clear();
	  driver.findElement(By.xpath("//select[@id='yearofpassingyear1']")).sendKeys("2008");

	  WebElement ErrorMsg1= driver.findElement
			  (By.xpath("//body/div[@id='ui']/div[@id='content']/div[@class='ui-content-body']/div[@class='ui-container']/div[@class='row']/div[@class='col-md-12']/div[@class='panel']/div[contains(@class,'panel-body1')]/form[@id='step-advanced-form']/div[@class='content clearfix']/fieldset[@id='step-advanced-form-p-1']/div[@class='row']/div[1]/div[1]/div[1]"));
	  String ErrorMsgI= ErrorMsg1.getText();
	  System.out.println("Error msg- "+ErrorMsgI);
	  String Exp= "please enter institute's name";
	//  softAssert.assertEquals(ErrorMsgI, Exp);
	  softAssertion.assertEquals(ErrorMsgI, Exp);
	  
	  
}

@Test(priority =15, enabled= false)

public void CloseDriver()
{
	  
	  System.out.println("Inside CloseDriver");
}

}
