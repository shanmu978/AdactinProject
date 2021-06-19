package com.adactin.step_defenition;

import org.openqa.selenium.WebDriver;

import com.Adactin.Base.BaseClass;
import com.Adactin.Pom.Book_Hotel;
import com.Adactin.Pom.Booking_Confirmation;
import com.Adactin.Pom.Login_Page;
import com.Adactin.Pom.Search_Hotel;
import com.Adactin.Pom.Select_Hotel;
import com.adactin.Runner.Test_Runner;
import com.adactin.prop.Configuration_Manager;
import com.adactin.prop.Page_Object_manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass{

	public static WebDriver driver=Test_Runner.driver;
	/*
	 * //public static Login_Page login=new Login_Page(driver); public static
	 * Search_Hotel srch=new Search_Hotel(driver); public static Select_Hotel
	 * slcthtl=new Select_Hotel(driver); public static Book_Hotel bkhtl=new
	 * Book_Hotel(driver); public static Booking_Confirmation bkconf=new
	 * Booking_Confirmation(driver);
	 */
	Page_Object_manager pgm=new Page_Object_manager(driver);
	
	@Given("^user Navigate Into The Adactin Application$")
	public void user_Navigate_Into_The_Adactin_Application() throws Throwable {
	    
		
		//toGetmthod("http://adactinhotelapp.com/index.php");
		toGetmthod(Configuration_Manager.propertFileManager().accessConfigReader().urlLaunch());
	    toMaximize();
	}

	
	@When("^user Enter The UserName \"([^\"]*)\" Details$")
	public void user_Enter_The_UserName_Details(String arg1) throws Throwable {
		enterText(pgm.getLoginPage().getUsername(), arg1);
	}

	@When("^user Enter the Password \"([^\"]*)\" Details$")
	public void user_Enter_the_Password_Details(String arg1) throws Throwable {
		enterText(pgm.getLoginPage().getPassword(), arg1);
	}
	

	@Then("^user Navigates To Search For Hotel Page$")
	public void user_Navigates_To_Search_For_Hotel_Page() throws Throwable {
	    
		onClick(pgm.getLoginPage().getLogin());
		
	}

	
	  @When("^user Choose the Location Where To Stay$") public void
	  user_Choose_the_Location_Where_To_Stay() throws Throwable {
	  
	  //dropDown(srch.getLocation(), );
	  dropDown(pgm.getSearchHotel().getLocation(),
	  Configuration_Manager.propertFileManager().accessConfigReader().getLocation()); 
	 //dropDown(pgm.getSearchHotel().getLocation(),Location); 
	  }
	  
	  @When("^user Choose the Hotel Based On Location$") 
	  public void user_Choose_the_Hotel_Based_On_Location() throws Throwable {
	  
	  dropDown(pgm.getSearchHotel().getHotels(),
	  Configuration_Manager.propertFileManager().accessConfigReader().getLocation1(
	  ));
	 // dropDown(pgm.getSearchHotel().getHotels(),Location1); 
	  }
	 
	

	@When("^user Choose Which Type of Room$")
	public void user_Choose_Which_Type_of_Room() throws Throwable {
	   
		dropDown(pgm.getSearchHotel().getRoomType(),Configuration_Manager.propertFileManager().accessConfigReader().getRoomType());
	}

	@When("^user Choose Number Of Rooms$")
	public void user_Choose_Number_Of_Rooms() throws Throwable {
	   
		dropDown(pgm.getSearchHotel().getNumberOfRooms(),Configuration_Manager.propertFileManager().accessConfigReader().getNoOfRooms());
	}

	@When("^user Choose The CheckIn Date$")
	public void user_Choose_The_CheckIn_Date() throws Throwable {
	   
		enterText(pgm.getSearchHotel().getCheckInDate(),Configuration_Manager.propertFileManager().accessConfigReader().getCheckInDate());
	}

	@When("^user Choose The CheckOut Date$")
	public void user_Choose_The_CheckOut_Date() throws Throwable {
	    
		enterText(pgm.getSearchHotel().getCheckInDate(), Configuration_Manager.propertFileManager().accessConfigReader().getCheckOutDate());
	}

	@When("^user Choose AdultsPerRoom$")
	public void user_Choose_AdultsPerRoom() throws Throwable {
	   
		dropDown(pgm.getSearchHotel().getAdultsPerRoom(),Configuration_Manager.propertFileManager().accessConfigReader().getAdultPerRom());
		
	}

	@When("^user Choose ChildrenPerRoom$")
	public void user_Choose_ChildrenPerRoom() throws Throwable {
	    
		dropDown(pgm.getSearchHotel().getChildrenPerRoom(),Configuration_Manager.propertFileManager().accessConfigReader().getChildrenRoom());
	}

    @Then("^user Navigates To Select Hotel Page$")
	public void user_Navigates_To_Select_Hotel_Page() throws Throwable {
	   
    	onClick(pgm.getSearchHotel().getSearch());
	}

	@When("^user Choose the HotelName TO Stay$")
	public void user_Choose_the_HotelName_TO_Stay() throws Throwable {
	   
		
		onClick(pgm.getSelectHotel().getSelectRadioBtn());
	}

	@Then("^user Navigates To Book A Hotel Page$")
	public void user_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	    
		onClick(pgm.getSelectHotel().getContinuee());
		
	}

	@When("^user Provide The FirstName$")
	public void user_Provide_The_FirstName() throws Throwable {
	    
		enterText(pgm.getBookHotel().getFirstName(),Configuration_Manager.propertFileManager().accessConfigReader().getFirstName());
		
	}

	@When("^user Provide The LastName$")
	public void user_Provide_The_LastName() throws Throwable {
	  
		enterText(pgm.getBookHotel().getLastName(),Configuration_Manager.propertFileManager().accessConfigReader().getLastName());
	}

	@When("^user Provide The Billing Address$")
	public void user_Provide_The_Billing_Address() throws Throwable {
	    
		enterText(pgm.getBookHotel().getBillingAddress(), Configuration_Manager.propertFileManager().accessConfigReader().getAddress());
		
	}

	@When("^user Provide Credit Card No$")
	public void user_Provide_Credit_Card_No() throws Throwable {
	
		enterText(pgm.getBookHotel().getCreditCardNo(),Configuration_Manager.propertFileManager().accessConfigReader().getCreditCardno());
	}

	@When("^user Provide Credit Card Type$")
	public void user_Provide_Credit_Card_Type() throws Throwable {
	    
		dropDown(pgm.getBookHotel().getCreditCardType(),Configuration_Manager.propertFileManager().accessConfigReader().getCardType());
	}

	@When("^user Provide Expiry Date$")
	public void user_Provide_Expiry_Date() throws Throwable {
		
	   waitTime(30);
		dropDown(pgm.getBookHotel().getExpiryDateMnth(),Configuration_Manager.propertFileManager().accessConfigReader().getExpiryDateMonth());
		dropDown(pgm.getBookHotel().getExpiryDateYear(), Configuration_Manager.propertFileManager().accessConfigReader().getExpiryDateYear());
	}

	@When("^user Provide CVV Number$")
	public void user_Provide_CVV_Number() throws Throwable {
	    
		enterText(pgm.getBookHotel().getCvvNumber(),Configuration_Manager.propertFileManager().accessConfigReader().getCvvNumber());
	}

	@Then("^user Navigates to Booking Confirmation Page$")
	public void user_Navigates_to_Booking_Confirmation_Page() throws Throwable {
	    
		onClick(pgm.getBookHotel().getBookNow());
	}

	@Then("^user Navigates to Booked Itenary Page$")
	public void user_Navigates_to_Booked_Itenary_Page() throws Throwable {
	   
		onClick(pgm.getBookingHotel().getMyLtinerary());
		
	}

	@Then("^user Logout$")
	public void user_Logout() throws Throwable {
	
	}
	
	
}
