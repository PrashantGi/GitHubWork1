package com.TestLayer;

import org.testng.annotations.Test;

import com.TestBase.TestBase;

public class TransactionsTest extends TestBase {
	
	
	@Test
	public void gettransactionsdetailsonConsole() throws InterruptedException 
	{   
	
	    dash.clickonTransactionPage();
		Thread.sleep(2000);
	    Transation.getTransactionsDetails();  
			
	}

}
