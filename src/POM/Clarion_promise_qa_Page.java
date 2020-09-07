package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Clarion_promise_qa_Page
{
	
		@FindBy (partialLinkText="Log Promi")
		private WebElement Log;
		
		@FindBy (name="cboEmp")
		private WebElement DD;
		
		@FindBy (xpath="//textarea[@id='txtPromise']")
		private WebElement promise;
		

		@FindBy (xpath="//input[@id='btnSubmit']")
		private WebElement logbutton;
		
		@FindBy (xpath="//select[@id='cboEmp']")
		private WebElement search;
		
		@FindBy (className="button_white")
		private WebElement searchbtn;
		
		@FindBy (xpath="//input[@id='txtStartDate']")
		private WebElement date;
		
		@FindBy (xpath="//b[contains(text(),'Logged as:')]")
		private WebElement logout;
		
		
		public Clarion_promise_qa_Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		public void click()
		{
			Log.click();
		}
		
		public void Dropdown()
		{
		
			Select s=new Select(DD);
			s.selectByVisibleText("Sonali test");
		}
		public void promise(String promis)
		{
			
		 promise.sendKeys(promis);
		}
		public void clickLogpromise()
		{
			
		 logbutton.click();
		}
		public void Dropdownsearch()
		{
		
			Select s=new Select(search);
			s.selectByVisibleText("Sonali test");
		
		}

		public void clicksearch()
		{
		
			searchbtn.click();   
		
		}
		public void Logout()
		{
		
			logout.click();   
		
		}
		
	
		
	
		
	
		
		
		
		
		

	


}
