package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.Clarion_Promise_Page;
import POM.Clarion_promise_qa_Page;

@Test
public class Loginforblankfieldsandvalidate
{
	@Test
	public void Login()
	{
	
	System.setProperty("webdriver.gecko.driver","./drivers1/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://182.74.238.221/clarion_promise_qa/index.php");
	String tit = driver.getTitle();
	System.out.println(tit);
	Clarion_Promise_Page cp=new Clarion_Promise_Page(driver);
	cp.Enterusername("");
	cp.Enterpassword("");
	cp.Clicklogin();
	String actual = driver.findElement(By.xpath("//font[contains(text(),'Invalid Username')]")).getText();
	String error_msg="Invalid Username/password";
	Assert.assertEquals(actual, error_msg);
	System.out.println("Validated and success");
	
	

}
}
