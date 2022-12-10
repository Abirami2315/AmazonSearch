package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazonPages;

import io.github.bonigarcia.wdm.WebDriverManager;

//import com.beust.jcommander.Parameters;

public class Base {
	
	AmazonPages amazon;
	WebDriver driver;
	@Parameters({"browser","url"})
	@BeforeClass
	public void setUp(String browser,String url)throws IOException
	{
	if(browser.equalsIgnoreCase("Chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Java\\eclipse workspace\\Amazon\\target\\chromedriver.exe");
	driver = new ChromeDriver();
	amazon = new AmazonPages(driver);
	driver.manage().window().maximize();
	driver.get(url);
	}
	else if(browser.equalsIgnoreCase("Edge"))
	{
	System.setProperty("webdriver.edge.driver","E:\\Java\\eclipse workspace\\Amazon\\target\\msedgedriver.exe");
	driver = new EdgeDriver();
	amazon = new AmazonPages(driver);
	driver.manage().window().maximize();
	driver.get(url);
	}
	else if(browser.equalsIgnoreCase("firefox"))
	 {
	 WebDriverManager.firefoxdriver().setup();
	 driver=new FirefoxDriver();
	 }

	}
	// Loc for post conditions
	@AfterClass
	public void tearDown() throws IOException
	{
	driver.close();
	}
}