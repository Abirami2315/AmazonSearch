package com.qa.testscripts;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;

public class TC_AmazonSearch_001 extends Base{
	AmazonPages Page;
	@Parameters({"Browser","Url"})
	@Test
	public void Search(String Browser,String Url) throws InterruptedException
	{
		Page=new AmazonPages();
		String title=Driver.getTitle();
		System.out.println("landed on amazon");
		Thread.sleep(2000);
		Driver.navigate().to("https://www.google.co.in/");
		String title1=Driver.getTitle();
		System.out.println("google page");
		Thread.sleep(2000);
		Driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
		Thread.sleep(2000);
		Page.Create().click();
		System.out.println("account created");
		Thread.sleep(2000);
	}
	

}