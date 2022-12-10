package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.SimpliPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	SimpliPages Page;
	WebDriver Driver;
	@Parameters({"browser","url"})
	@BeforeClass
	public void setup(String browser,String url) throws IOException, InterruptedException
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    Driver = new ChromeDriver();
		
	    }
		else if(browser.equalsIgnoreCase("Edge"))
		{
		System.setProperty("webdriver.edge.driver","E:\\Java\\eclipse workspace\\Amazon\\target\\msedgedriver.exe");
		Driver=new EdgeDriver();
		
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			 WebDriverManager.firefoxdriver().setup();
			 Driver=new FirefoxDriver();
		}
		Page=new SimpliPages(Driver);
		Driver.manage().window().maximize();
		Driver.get(url);
		JavascriptExecutor js = ((JavascriptExecutor) Driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");

}
	
	
		@AfterClass
		public void tearDown() throws IOException, InterruptedException
		{
			Thread.sleep(2000);
			Driver.close();
		}
}
