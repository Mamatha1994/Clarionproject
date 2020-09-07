package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clarion_Promise_Page
{
	@FindBy (xpath="//input[@name='txtUsername']")
	private WebElement Username;
	
	@FindBy (xpath="//input[@name='txtPassword']")
	private WebElement Password;
	
	@FindBy (name="submit1")
	private WebElement Login;
	
	public Clarion_Promise_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Enterusername(String username)
	{
		Username.sendKeys(username);
	}
	public void Enterpassword(String password)
	{
		Password.sendKeys(password);
	}
	public void Clicklogin()
	{
		Login.click();
	}
	
	
	
	

}
