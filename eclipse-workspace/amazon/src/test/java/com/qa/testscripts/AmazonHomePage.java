package com.qa.testscripts;

import org.openqa.selenium.WebDriver;

public class AmazonHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		String browser="Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\abirami s s\\eclipse-workspace\\amazon\\chrome106\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get("https://www.google.com/");
	}

}
