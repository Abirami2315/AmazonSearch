package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//all web elements in pages package
public class AmazonPages 
{
	
    WebDriver driver;
    @FindBy(xpath="//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")
    WebElement gmail;
    public WebElement getgmaillink()
    {
    	return gmail;
    }
 
    @FindBy(xpath="//header/div[1]/div[1]/div[1]/a[3]/span[2]")
    WebElement createacc;
    public WebElement getcreateacc()
    {
    	return createacc;
    }
    
 
    @FindBy(xpath="//*[@id=\"firstName\"]")
    WebElement firstname;
    public WebElement getfirstname()
    {
    	return firstname;
    }
    
    
    @FindBy(xpath="//*[@id=\"lastName\"]")
    WebElement lastname;
    public WebElement getlastname()
    {
    	return lastname;
    }
    
    @FindBy(xpath="//*[@id=\"username\"]")
    WebElement username;
    public WebElement getUsername()
    {
    	return username;
    }
    
    @FindBy(xpath="//*[@id=\"passwd\"]/div[1]/div/div[1]/input")
    WebElement Password;
    public WebElement getPassword()
    {
    	return Password;
    }
  
    @FindBy(xpath="//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")
    WebElement Confirm;
    public WebElement getConfirm()
    {
    	return Confirm;
    }
    
    @FindBy(xpath="//*[@id=\"accountDetailsNext\"]/div/button/div[3]")
    WebElement next;
    public WebElement getnext()
    {
    	return next;
    }
    
  
    @FindBy(xpath="//*[@id=\"phoneNumberId\"]")
    WebElement ph;
    public WebElement getphonenum()
    {
    	return ph;
    }
    @FindBy(xpath="//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[3]")
    WebElement next1;
    public WebElement getnext1()
    {
    	return next1;
    }

    
//constructor
    public AmazonPages(WebDriver driver)
    {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
    }

}