package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {
	WebDriver Driver;
	@FindBy(xpath="//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div/div[1]/a")
	WebElement gmail;
	public WebElement Gmail()
	{
		return gmail;
	}
	@FindBy(xpath="/html/body/header/div/div/div/a[3]")
	WebElement createaccnt;
	public WebElement Create() {
		return createaccnt;
	}
	public void Amazonpages(WebDriver Driver) {
		this.Driver=Driver;
		PageFactory.initElements(Driver,this);
	}


}
