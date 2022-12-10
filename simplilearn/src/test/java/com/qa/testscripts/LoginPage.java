package com.qa.testscripts;

import org.testng.annotations.Test;

import com.qa.pages.SimpliPages;

public class LoginPage extends TestBase {
	SimpliPages sim;
	@Test
	public void simpliLearn() throws InterruptedException {
		sim= new SimpliPages(Driver);
		sim.getlogin().click();
		Thread.sleep(1000);
		sim.getEmail().sendKeys("19p201@kce.ac.in");
		Thread.sleep(1000);
		sim.getPassword().sendKeys("Abirami@23");
		Thread.sleep(1000);
		Driver.navigate().back();
		Thread.sleep(1000);
		sim.getSearch().sendKeys("cloud computing");
		Thread.sleep(1000);
		System.out.println(sim.getAllText().getText());
		
	}
}