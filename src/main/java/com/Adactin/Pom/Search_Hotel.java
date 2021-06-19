package com.Adactin.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public static WebDriver driver;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement numberOfRooms;
	
	@FindBy(xpath="//input[contains (@id,'datepick_in')]")
	private WebElement checkInDate;
	
	@FindBy(xpath="//input[contains (@id,'datepick_out')]")
	private WebElement checkOutDate;
	
	@FindBy(xpath="//select[contains (@id,'adult_room')]")
	private WebElement adultsPerRoom;
	
	@FindBy(xpath="//select[contains (@id,'child_room')]")
	private WebElement childrenPerRoom;
	
	@FindBy(xpath="//input[contains (@id,'Submit')]")
	private WebElement search;
	
	@FindBy(xpath="//input[contains (@id,'Reset')]")
	private WebElement reset;

	public Search_Hotel(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getReset() {
		return reset;
	}
	

}
