package com.adactin.prop;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	
	static Properties properties;
	
	public Configuration_Reader () throws Throwable {
		
		File fle=new File("C:\\Users\\AMMASI\\POM\\Adactin_Project\\src\\test\\java\\com\\adactin\\prop\\adactin.properties");
		
		FileInputStream fis=new FileInputStream(fle);
		properties=new Properties();
		properties.load(fis);
	
	}
	public String browserSetup() {
		
		String browser = properties.getProperty("browser");
		
		return browser;
	}
	public String urlLaunch() {
		
		String url = properties.getProperty("url");
		
		return url;
	}
	
	public String getUserName() {
		
		String username = properties.getProperty("username");
		
		return username;
	}
	
	
	
	public String getPassword() {
		
String password = properties.getProperty("password");
		
		return password;
		
	}
	
	public String getLocation() {
		String location = properties.getProperty("location");
		
		return location;
	}
	
	
	public String getLocation1() {
		String location1 = properties.getProperty("location1");
		
		return location1;
	}
	public String getRoomType() {
		String roomtype = properties.getProperty("roomtype");
		
		return roomtype;
	}
	
	public String getNoOfRooms() {
		String noofrooms = properties.getProperty("noofrooms");
		
		return noofrooms;
	}
	
	public String getCheckInDate() {
		String checkindate = properties.getProperty("checkindate");
		
		return checkindate;
	}
	
	public String getCheckOutDate() {
		String checkoutdate = properties.getProperty("checkoutdate");
		
		return checkoutdate;
	}
	
	public String getAdultPerRom() {
		String adultperrrom = properties.getProperty("adultperrrom");
		
		return adultperrrom;
	}
	
	public String getChildrenRoom() {
		String childrenroom = properties.getProperty("childrenroom");
		
		return childrenroom;
	}
	
	public String getFirstName() {
		String firstname = properties.getProperty("firstname");
		
		return firstname;
	}
	
	public String getLastName() {
		String lastname = properties.getProperty("lastname");
		
		return lastname;
	}
	
	public String getAddress() {
		String Address = properties.getProperty("Address");
		
		return Address;
	}
	
	public String getCreditCardno() {
		String creditcardno = properties.getProperty("creditcardno");
		
		return creditcardno;
	}
	
	public String getCardType() {
		String cardtype = properties.getProperty("cardtype");
		
		return cardtype;
	}
	
	public String getExpiryDateMonth() {
		String expirydatemonth = properties.getProperty("expirydatemonth");
		
		return expirydatemonth;
	}
	
	
	public String getExpiryDateYear() {
		String expirydateyear = properties.getProperty("expirydateyear");
		
		return expirydateyear;
	}
	
	public String getCvvNumber() {
		String cvvnumber = properties.getProperty("cvvnumber");
		
		return cvvnumber;
	}
	
	
	
	
	
}
