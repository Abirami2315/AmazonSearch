package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpliPages {
	WebDriver driver;
	@FindBy(xpath="//*[@id='topHeader']/div/nav[2]/a")
	WebElement login;
	public WebElement getlogin(){
		return login;
	}
	@FindBy(xpath="//*[@id=\"login-form\"]/div[2]/input")
	WebElement emailAddress;
	public WebElement getEmail(){
		return emailAddress;
	}
	@FindBy(id="password")
	WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(id="header_srch")
	WebElement search;
	public WebElement getSearch() {
		return search;
	}
	@FindBy(xpath="//body")
	WebElement allText;
	public WebElement getAllText() {
		return allText;
	}
	public SimpliPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}