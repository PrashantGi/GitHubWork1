package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class DashboardPage extends TestBase {
	
	
	public DashboardPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------OBJ---------
   
 private By search_txt=By.xpath("//input[@class='form-control']");
	
 private By company_option = By.xpath("(//div[@class='m-4 card'])[2]");
   
 private By transactions =By.xpath("//a[text()='Transactions']");
 
 
 
 //--------Action Methods--------------
  public void enterCompanyName(String company_name) 
  {
	  driver.findElement(search_txt).sendKeys(company_name);
	  
  }
  public void clickOnCompanyOption() 
  {
	  driver.findElement(company_option).click();
  }
  public void clickonTransactionPage()
  {
	  driver.findElement(transactions).click();
  }
}
