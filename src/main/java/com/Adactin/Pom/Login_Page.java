package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;

	public Login_Page(WebDriver driver2) {

      this.driver=driver2;
      PageFactory.initElements(driver, this);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
}
