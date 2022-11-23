package com.TestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.PageLayer.DashboardPage;
import com.PageLayer.Exchange;
import com.PageLayer.LoginPage;
import com.PageLayer.TransactionsPage;

import io.github.bonigarcia.wdm.WebDriverManager;

  public class TestBase {
  	  
 public static WebDriver driver;
 public static Logger logger;
 public static  LoginPage login;
 public static DashboardPage dash;
 public static  Exchange exchange;
 public static TransactionsPage Transation;
	  
 
 @BeforeClass
 public void Start() 
 {
	 logger = Logger.getLogger("Dalalstreet Framework");
	 PropertyConfigurator.configure("Log4j.properties");
	 
	 logger.info("Execution started");
 }
 @AfterClass
 public void End() 
 {
	logger.info("Execution End"); 
 }
 
  @BeforeMethod
  public void setup() throws InterruptedException 
   {
	String Browser="chrome";  
	if(Browser.equalsIgnoreCase("chrome")) 
	{
		WebDriverManager.edgedriver().setup();
		driver =  new ChromeDriver();
	}  
	  
	else if(Browser.equalsIgnoreCase("edge")) 
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}  
	else if(Browser.equalsIgnoreCase("firefox")) 
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	} 
	else 
	{
		System.out.println("Browser not Launching Properly");
	}
	
	logger.info("Browser Launch ");
	
    driver.get("https://www.apps.dalalstreet.ai/login");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	logger.info("Url,Maximize and Provided Wait");
	
	//-----------OBJECT creation ---------
	 login=new LoginPage();
	 dash=new DashboardPage();
	 exchange=new Exchange();
	 Transation=new TransactionsPage();
	 
	 //-------Login Step--------
	 login.enterEmailID("Prashant.gandage@gmail.com");
	 login.enterPassword("Prashant988");
	 login.clickOnLoginButton();
	 Thread.sleep(4000);
	 
	 logger.info("Logged in Succesfully");
   }
  @AfterMethod
  public void tearDown() 
  {
	  driver.quit();
	  logger.info("Browser Closed");
  }
 
}
