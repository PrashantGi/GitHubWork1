package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

public class TradingTest extends TestBase {
	
	
	@Test

	public void verifyBuyShare() throws InterruptedException 
	{
		
		dash.enterCompanyName("WIPRO");
		Thread.sleep(3000);
		dash.clickOnCompanyOption();
		logger.info("Wipro Share");
		Thread.sleep(2000);
		
		exchange.clickOnBuyButton1();
		exchange.enterQuantityOfShare("6");
		Thread.sleep(2000);
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		
		String actual_status = exchange.getStatus();
		String expected_status = "Order Created successfully";
		Assert.assertEquals(actual_status, expected_status);	
		
		Thread.sleep(2000);
	}

	@Test
	public void verifyBuyShareWipro() throws InterruptedException
	{
		dash.enterCompanyName("AXIS");
		dash.clickOnCompanyOption();
		logger.info("Axis Share");
		Thread.sleep(4000);
		//-------------------------------------
		exchange.clickOnBuyButton1();
		exchange.enterQuantityOfShare("2");
		exchange.clickOnBuyButton2();
		Thread.sleep(2000);
		//-------------------------------------
		String actual_status = exchange.getStatus();
		String expected_status = "Order Created successfully";
		
		Assert.assertEquals(actual_status, expected_status);	
	}
}
