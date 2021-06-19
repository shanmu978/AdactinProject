package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public static WebDriver driver;

	@FindBy(xpath="(//input[contains (@id,'radiobutto')])[1]")
	private WebElement selectRadioBtn;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuee;
	
	@FindBy(xpath="//input[@id='cancel']")
	private WebElement cancel;

	public Select_Hotel(WebDriver driver2) {
      this.driver=driver2;
      PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelectRadioBtn() {
		return selectRadioBtn;
	}

	public WebElement getContinuee() {
		return continuee;
	}

	public WebElement getCancel() {
		return cancel;
	}

}
