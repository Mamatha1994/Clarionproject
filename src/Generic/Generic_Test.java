package Generic;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Parameters;


public class Generic_Test implements Auto_const
{
	public WebDriver driver;
	
	
	
	@BeforeMethod
	public void openApplication()
	{
		System.setProperty( chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.get("http://182.74.238.221/clarion_promise_qa/index.php");
		
	}
	@AfterMethod
	public void closeApp()
	{
	
	driver.quit();
	
	}
	

}

