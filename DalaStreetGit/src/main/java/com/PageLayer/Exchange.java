package com.PageLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TestBase.TestBase;

public class Exchange extends TestBase {
	
	
	public Exchange()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------Obj --------------------
	private By buy_btn1 = By.xpath("//a[contains(text(),'Buy')]");
	private By quantity_txt = By.xpath("//input[@name='input-Qunatity']");
	private By buy_btn2 = By.xpath("//button[text()='Buy']");
	private By status_text = By.xpath("//div[contains(text(),'Order Created successfully')]");
	
	//----------Action method -------------
	public void clickOnBuyButton1()
	{
		driver.findElement(buy_btn1).click();
	}
	
	public void enterQuantityOfShare(String count)
	{
		driver.findElement(quantity_txt).click();
		driver.findElement(quantity_txt).sendKeys(count);
	}
	
	public void clickOnBuyButton2()
	{
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
       JavascriptExecutor js = ((JavascriptExecutor)driver);
       js.executeScript("scroll(0,200)");
	  WebElement Locator = wait.until(ExpectedConditions.elementToBeClickable(buy_btn2));
	  Locator.click();
	    
	}
	
	public String getStatus()
	{
		String status = driver.findElement(status_text).getText();
		return status;
	}
}
