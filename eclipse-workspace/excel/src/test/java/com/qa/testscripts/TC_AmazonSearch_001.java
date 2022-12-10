
package com.qa.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;
import com.qa.utility.Xls_Reader;

public class TC_AmazonSearch_001 extends Base{

	AmazonPages amzpages;
	@Parameters({"browser","url"})
	@Test
	public void Search(String browser,String Url) throws InterruptedException
	{
		amzpages = new AmazonPages(driver);
// print amazon title
		String title=driver.getTitle();
		System.out.println("successfully landed in amazon page"+title);
		Thread.sleep(3000);
		
//navigate to google page
		driver.navigate().to("https://www.google.in/");
		String title1=driver.getTitle();
		System.out.println("successfully landed in google page"+title1);
		Thread.sleep(3000);

//click gmail 
		amzpages.getgmaillink().click();
		System.out.println("moved to gmailpage");
		Thread.sleep(3000);
		
//print gmail title
		String title2=driver.getTitle();
		System.out.println("successfully landed in gmail page"+title2);
		Thread.sleep(3000);
/*click signin page
		amzpages.getsigninpage().click();
		System.out.println("moved to signin page");
		Thread.sleep(3000);
*/
//click create acc page
		amzpages.getcreateacc().click();
		System.out.println("moved to create acc page");
		Thread.sleep(3000);
//click personal user
		/*
		amzpages.getprsnluser().click();
		System.out.println("moved to personal user page");
		Thread.sleep(3000);
		*/
		 Xls_Reader reader=new Xls_Reader("C:\\Users\\abirami s s\\eclipse-workspace\\excel\\src\\test\\java\\com\\qa\\testscripts\\Base.java");//object for excel file
		 /*String firstname=reader.getCellData("Sheet1","First_name", 2);
		 System.out.println("firstname:"+firstname);
		 String lastname=reader.getCellData("Sheet1","Last_name", 2);
		 System.out.println("lastname:"+lastname);
		 String Username=reader.getCellData("Sheet1","Username", 2);
		 System.out.println("Username:"+Username);
		 String Password=reader.getCellData("Sheet1","Password", 2);
		 System.out.println("Password:"+Password);
		 String Confirm=reader.getCellData("Sheet1","Confirm", 2);
		 System.out.println("Confirm:"+Confirm);
		 String phonenum=reader.getCellData("Sheet1","phonenum", 2);
		 System.out.println("phonenum:"+phonenum);*/
		 
		 amzpages = new AmazonPages(driver);
		 String firstname=reader.getCellData("Sheet1","First_name", 2);
		 System.out.println("firstname:"+firstname);
		 amzpages.getfirstname().sendKeys(firstname+Keys.ENTER);
		 String lastname=reader.getCellData("Sheet1","Last_name", 2);
		 System.out.println("lastname:"+lastname);
		 amzpages.getlastname().sendKeys(lastname+Keys.ENTER);
		 String Username=reader.getCellData("Sheet1","Username", 2);
		 System.out.println("Username:"+Username);
		 amzpages.getUsername().sendKeys(Username+Keys.ENTER);
		 String Password=reader.getCellData("Sheet1","Password", 2);
		 System.out.println("Password:"+Password);
		 amzpages.getPassword().sendKeys(Password+Keys.ENTER);
		 String Confirm=reader.getCellData("Sheet1","Confirm", 2);
		 System.out.println("Confirm:"+Confirm);
		 amzpages.getConfirm().sendKeys(Confirm+Keys.ENTER);
		 Thread.sleep(5000);
		 amzpages.getnext().click();
		 Thread.sleep(2000);
		 String phonenum=reader.getCellData("Sheet1","phonenum", 2);
		 System.out.println("phonenum:"+phonenum);
		 amzpages.getphonenum().sendKeys(phonenum+Keys.ENTER);
		 Thread.sleep(4000);
		 amzpages.getnext1().click();
		 System.out.println("successfully completed");
	}
	}