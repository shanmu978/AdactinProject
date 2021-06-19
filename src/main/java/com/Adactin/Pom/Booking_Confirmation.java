package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='search_hotel']")
	private WebElement searchHotel;
	
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement myLtinerary;
	
	
	@FindBy(xpath="//input[@id='logout']")
	private WebElement logout;


	public Booking_Confirmation(WebDriver driver2) {
     this.driver=driver2;
     PageFactory.initElements(driver, this);
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getSearchHotel() {
		return searchHotel;
	}


	public WebElement getMyLtinerary() {
		return myLtinerary;
	}


	public WebElement getLogout() {
		return logout;
	}
	
	

	
}
