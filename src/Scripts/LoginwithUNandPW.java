package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.Clarion_Promise_Page;
import POM.Clarion_promise_qa_Page;

public class LoginwithUNandPW {
	@Test
	public class Loginforblankfieldsandvalidate
	{
		@Test
		public void Login() throws InterruptedException
		{
		
		System.setProperty("webdriver.gecko.driver","./drivers1/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://182.74.238.221/clarion_promise_qa/index.php");
		String tit = driver.getTitle();
		System.out.println(tit);
		Assert.assertEquals(tit, "Promises Log");
		Thread.sleep(500);
		Clarion_Promise_Page cp=new Clarion_Promise_Page(driver);
		cp.Enterusername("sanjeetk@clariontechnologies.co.in");
		cp.Enterpassword("clarion");
		cp.Clicklogin();
		Thread.sleep(500);
		Clarion_promise_qa_Page cq=new Clarion_promise_qa_Page(driver);
		cq.click();
		Thread.sleep(500);
		cq.Dropdown();
		Thread.sleep(500);
		cq.promise("Entered Promise by Mamatha BK");
		Thread.sleep(500);
		cq.Dropdown();
		cq.clickLogpromise();
		Thread.sleep(500);
		cq.Dropdownsearch();
		Thread.sleep(500);
		cq.clicksearch();
		Thread.sleep(500);
		cq.Logout();
		System.out.println("Logged out by Mamatha BK");
	
	
		
		

		
		
		
		
		

	}
	}

}
