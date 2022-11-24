package com.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class LoginPage2 extends TestBase {
	
	
	
	public LoginPage2() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="")
	private WebElement Username;
	
	
	@FindBy(xpath="")
	private WebElement pwd;
	
	@FindBy(xpath="")
	private WebElement login_btn;
	
	public void EnterUn() 
	{
		Username.sendKeys("");
	}
	public void Enterpwd() 
	{
		pwd.sendKeys("");
	}
	public void clickonLogin() 
	{
		login_btn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
