package com.w2a.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class RNTLoginTest extends TestBase {


	@Test(priority =0, enabled=true)
	public void URLTest() throws InterruptedException
	{
		
		String actualUrl="http://18.191.28.50:8080/RNT-UAT/"; 
		  String expectedUrl= driver.getCurrentUrl(); 
		  Assert.assertEquals(expectedUrl,actualUrl);
		  System.out.println("Inside URL test");
		  Reporter.log("URL test Passed");
		  Thread.sleep(5000);
	}
 
	@Test(priority =1, enabled=true)
	public void URLgetTitle() throws InterruptedException
	{
		
		String actualTitle="RNT | Login"; 
		  String expectedUrl= driver.getTitle(); 
		  Assert.assertEquals(expectedUrl,actualTitle);
		  System.out.println("Inside Inside Titile test");
		  Reporter.log("Title Name is matching");
		  Thread.sleep(500);
		  
	}
 
	@Test(priority=4, enabled=true)

	public void ErrorMsgLogin() throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver","E:\\class\\Chrome driver versions\\chrome d 77\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("http://18.191.28.50:8080/RNT-UAT");
		 driver.manage().window().maximize();
		  //WebDriver driver;*/
		  String a="hd122";
		  driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter User ID')]")).sendKeys(a);
		  WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter Password')]"));
		  password.sendKeys("1000002");
		  
		  driver.findElement(By.xpath("//button[@class='btn btn-info btn-block']")).click();;
		  	//Login.click();
		  WebElement msg=driver.findElement(By.xpath("//p[contains(text(),'Invalid Username or Password')]"));
	      String text=msg.getText();
	      String expectedText = "Invalid Username or Password";
	      Assert.assertEquals(text,expectedText);
	
	      System.out.println("User name and password are invalid Block");
	      Reporter.log("User name and password are invalid message is displayed");
	      Thread.sleep(500);
		  
	}
	
	//p[contains(text(),'ession is Expired Please Login Again')]
	
	
	//////////
	
	@Test(priority =4, enabled=true)
	public void ShowEnties_ListofEmp() throws InterruptedException
	{
		
		  
		  String a="hd2";
		  driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter User ID')]")).sendKeys(a);
		  WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter Password')]"));
		  password.sendKeys("1002");
		  
		  driver.findElement(By.xpath("//button[@class='btn btn-info btn-block']")).click();
		  	//Login.click();
		  driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();
		  
		//System.out.println("No of cols are : " +col.size());
		  
		  WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='tList_length']"));
			// create object for Select class
			Select dropdown = new Select(dropdownElement);
			// select 1st option from the dropdown options
			 //dropdown.selectByIndex(1);
			//String Value ="50";
			int input_show=50; 
			 String Value = Integer.toString(input_show);
			dropdown.selectByValue(Value);
			System.out.println(" Index value is  " +Value);
			Thread.sleep(10000);
		  
		  //List <WebElement> col= driver.findElements(By.xpath("//body/div[@id='ui']/div[@id='content']/div[@class='ui-content-body']/div[@class='ui-container']/div[@class='row']/div[@class='col-md-12']/div[@class='panel']/div[contains(@class,'panel-body')]/form/div[contains(@class,'col-md-12')]/div[contains(@class,'panel-body')]/div[contains(@class,'table-responsive')]/div[@id='tList_wrapper']/div[2]"));
		/*  List <WebElement> col= driver.findElements(By.tagName("//table[@id='tList']//tbody//tr"));
		  int count= col.size();
		  System.out.println("No of cols are : " +count);*/
			
			 WebElement parentTable = driver.findElement(By.xpath("//table[@id='tList']//tbody"));
		        //Now use the parentTable as the root of the search for all 'tr' children.
		        List<WebElement> rows = parentTable.findElements(By.xpath("./tr"));
		        System.out.println("No of cols are : " +rows.size());
		        int count= rows.size();
		        
		        Assert.assertEquals(input_show,rows.size());
		    	System.out.println("This line is executed because assertEquals ");
		        Reporter.log("This line is executed because assertEquals");
	}


	@Test(priority =5, enabled=true)
	public void Search_ListofEmp() throws InterruptedException
	{
		
		/*  String a="hd2";
		  driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter User ID')]")).sendKeys(a);
		  WebElement password = driver.findElement(By.xpath("//input[contains(@placeholder,'Please Enter Password')]"));
		  password.sendKeys("1002");
		  
		  driver.findElement(By.xpath("//button[@class='btn btn-info btn-block']")).click();;
		  	//Login.click();
		  driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();;
			*/  
		//  driver.findElement(By.xpath(" //input[@class='form-control input-sm'] ")).sendKeys("");
		  
		  WebElement textbox = driver.findElement(By.xpath(" //input[@class='form-control input-sm'] "));
		  textbox.sendKeys("Jayesh");

		  driver.findElement( By.xpath(" //input[@class='form-control input-sm'] ")).sendKeys(Keys.ENTER);
		    

		  String bodyText = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]")).getText();
		   // Assert.assertTrue("Text not found!", bodyText.contains("Harshita"));
		  
		  Assert.assertTrue( bodyText.contains("Jayesh"));
		  
		  Reporter.log("Search box working smoothly");
		  System.out.println("Inside Search Validation");
		  
		  Thread.sleep(5000);
	}



	///

	@Test(priority =6, enabled=true)
	public void ViewProfileMenuTray()
	{
		
		
		  driver.findElement(By.xpath("//span[contains(text(),'View Profile')]")).click();  
		  
		 
		  }


	@Test(priority =7, enabled=true)

	public void CheckPresenceofPagename() throws InterruptedException
	{			String Actual_Name = "View Profile";
				WebElement PgName =driver.findElement(By.xpath("//h4[@class='margin0']"));
				String PageName= PgName.getText();

			   Assert.assertEquals(Actual_Name, PageName);
			  
			   Reporter.log("Name on the View  Profile page is correct ");
	}

	@Test(priority =8, enabled=true)
	public void ViewProfileEducation()
	{

	 
	//  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Educational')]")).click();
	}

	@Test(priority =9, enabled=true)
	public void ViewProfileExperience() throws InterruptedException
	{

	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();
	System.out.println("Inside Experience test");
	Thread.sleep(500);
	}

	@Test(priority =10, enabled= true)

	public void VerifyHomeLink() throws InterruptedException
	{
		System.out.println("Inside VerifyHomeLink");
		 WebElement home=driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
		 String hm= home.getText();
		 System.out.println("hm value is---"+hm);
		 Thread.sleep(500);
		
				 System.out.println("hm value is---"+hm);
		
				 home.click();
				 Thread.sleep(500);
		
			//	 Reporter.log("Home Text is not present on the web page test case fails");
	
			 Thread.sleep(500);
		 String CURL= driver.getCurrentUrl();
		 System.out.println("CURL --"+CURL);
		 String ExpURL="http://18.191.28.50:8080/RNT-UAT/home.do";

		 Assert.assertEquals(CURL, ExpURL);
		 System.out.println("Assert passed");
		 driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();
		 
	}

	@Test(priority =11, enabled= true)

	public void VerifyRMSLink()
	{
		 WebElement RMS=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/ol[1]/li[2]/a[1]"));
		 String rms= RMS.getText();
		 ///if(rms!=null)
		 //{
			// if(rms =="RMS")
			// {	
				 System.out.println("Value of RMS is ----"+rms);
				// Reporter.log("Home Text is present on the web page");
				 RMS.click();
				 
			 //}
			 //else
	//		 {
				 System.out.println("In else loop ----"+rms);
	//			 Reporter.log("Home Text is not present on the web page test case fails");
				// driver.close();
		//	 }
		// }
		 
		// else
	//	 {
	//		 Reporter.log("Home Text is not present on the web page test case fails");
			 //driver.close();
		// }
		 
		 String CURL= driver.getCurrentUrl();
		 String ExpURL="http://18.191.28.50:8080/RNT-UAT/rmsdash.do";

		 Assert.assertEquals(CURL, ExpURL);
		 System.out.println("Assert passed");
		// driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();
		 
	}
	
	
	
	@Test(priority =12, enabled=true)

	public void Back_to_HomePage() throws InterruptedException
	{
	  driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
	  System.out.println("Inside home page");
	  Reporter.log("Going back to home page");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();
	 
	}

	
	@Test(priority =13, enabled=true)
	public void View_Profile_Picture()
	{
		driver.findElement(By.xpath("//span[contains(text(),'View Profile')]")).click();
	WebElement ImageFile = driver.findElement(By.xpath("//div[@class='profile-thumb']//img"));
        
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
             System.out.println("Image not displayed.");
             Reporter.log("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
            Reporter.log("Image is displayed.");
        }
		
	}
	
	
	@Test(priority =14, enabled= false)

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


	@Test(priority =15, enabled=true)
	public void Logo_Validation() throws InterruptedException
	{
	 // driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();
	  driver.findElement(By.xpath("//span[@class='logo']//img")).click();
	  Thread.sleep(500);
	  
	  

		String actualURL="http://18.191.28.50:8080/RNT-UAT/home.do"; 
		  String expectedUrl= driver.getCurrentUrl(); 
		  expectedUrl = expectedUrl.replaceAll("\\s", "");
		  System.out.println("URL "+expectedUrl);
		  Assert.assertEquals(expectedUrl,actualURL);
		  System.out.println("Inside Home page");
		  Reporter.log("After clicking on Logo user is redirected to home page");
		  Thread.sleep(5000);

		  driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();
	}
	
	@Test(priority =16, enabled=false)
	public void ChangePassword()
	{
	 // driver.findElement(By.xpath("//b[contains(text(),'Resource Management System')]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Change Password')]")).click();

	}

	
	
	
	
	
	
	
	
	
	
	/*@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException{
		
		System.out.println("Inside Bankmanager login");
		verifyEquals("abc", "xyz");
		//Thread.sleep(3000);
		//log.debug("Inside Login Test");
	
		click("bmlBtn_CSS");
	//	driver.findElement(By.xpath("//button[contains(text(),'Bank Manager Login')]")).click();
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not successful");
		
		//log.debug("Login successfully executed");
		
		//Assert.fail("Login not successful");
		
		
		
	
	
	} */
	
}
