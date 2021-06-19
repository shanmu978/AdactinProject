package com.adactin.prop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.Pom.Book_Hotel;
import com.Adactin.Pom.Booking_Confirmation;
import com.Adactin.Pom.Login_Page;
import com.Adactin.Pom.Search_Hotel;
import com.Adactin.Pom.Select_Hotel;

public class Page_Object_manager {
public static WebDriver driver;
	
	private Login_Page loginPage;
	private Search_Hotel searchHotel;
	private Select_Hotel selectHotel;
	private Book_Hotel bookHotel;
	private Booking_Confirmation bookingconf;

	public Page_Object_manager(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public Login_Page getLoginPage() {
		
 loginPage=new Login_Page(driver);
     
		return loginPage;
	}

	public Search_Hotel getSearchHotel() {
		searchHotel=new Search_Hotel(driver);
		return searchHotel;
	}

	public Select_Hotel getSelectHotel() {
		selectHotel=new Select_Hotel(driver);
		return selectHotel;
	}

	public Book_Hotel getBookHotel() {
		bookHotel=new Book_Hotel(driver);
		return bookHotel;
	}

	public Booking_Confirmation getBookingHotel() {
		
		bookingconf=new Booking_Confirmation(driver);
		return bookingconf;
	}
	
	
	
}
