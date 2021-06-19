package com.Adactin.Base;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static WebDriver driver;
	static Actions action;
	static File file;
	static TakesScreenshot shot;
	static Select select;
	static Robot robot;
	static Alert alert;

	public static WebDriver conctToDriver(String s) throws AWTException {

		if (s.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\AMMASI\\POM\\learning\\chromedriver\\chromedriver.exe");

			driver = new ChromeDriver();
			action = new Actions(driver);
			shot = (TakesScreenshot) driver;
			robot=new Robot();
			

		} else {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\AMMASI\\eclipse-workspace\\SeleniumProject\\Driver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		return driver;
	}

	public static void toGetmthod(String S) {

		driver.get(S);

	}

	public static void toMaximize() {

		driver.manage().window().maximize();

	}

	public static void toClose() {

		driver.close();

	}
	public static void quit() {

		driver.quit();

	}
	
	public static void toNavigate(String s) {

		driver.navigate().to(s);

	}
	
	public static void forwardNavigate() {

		driver.navigate().forward();

	}
	
	public static void refreshNavigate() {

		driver.navigate().refresh();

	}
	
	public static void backNavigate() {

		driver.navigate().back();

	}
	

	public static void onClick(WebElement element) {

		element.click();
	}

	public static void enterText(WebElement element, String inputvalue) {

		// driver.findElement(By.xpath("//input[@id='email']"))
		// Shan@football.com

		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Shan@football.com)

		element.sendKeys(inputvalue);

	}

	/*
	 * public static WebElement toSearchElement(String s) {
	 * 
	 * System.out.println(driver.findElement(By.xpath(s)));
	 * 
	 * return driver.findElement(By.xpath(s));
	 * 
	 * }
	 */

	public static void waitTime(int i) {

		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);

	}

	public static void toFrame(WebElement m) {

		driver.switchTo().frame(m);

	}

	public static void toFrame1() {

		driver.switchTo().defaultContent();

	}

	public static void toScreenshot(String S) throws IOException {

		File src = shot.getScreenshotAs(OutputType.FILE);
		File trgt = new File(S);

		FileUtils.copyFile(src, trgt);

	}

	public static void forMouse(WebElement S) {

		action.moveToElement(S).build().perform();
		

	}
	
	public static void keypress(int i) {

		robot.keyPress(i);

	}
	public static void keyrelease(int i) {

		robot.keyRelease(i);
	}
	
	public static Set<String> windowhandles() {

		Set<String> windowHandles = driver.getWindowHandles();
		
		return windowHandles;
	}
	
	public static Alert alert() {

		Alert alert2 = driver.switchTo().alert();
		
		return alert2;
	}
	
	public static boolean isMultiple(WebElement w) {

		select=new Select(w);
		boolean multiple = select.isMultiple();
		
		return multiple;
	}
	
	
	public static boolean isEnable(WebElement w) {

		boolean enabled = w.isEnabled();
		
		return enabled;
	}
	
	public static boolean isdispayed(WebElement w) {

boolean displayed = w.isDisplayed();

return displayed;
	}
	
	public static boolean isSelected(WebElement w) {

boolean selected = w.isSelected();
		
return selected;
	}
public static String getText(WebElement w) {
		
	String text = w.getText();
	
	return text;
	}
public static String getCurrentUrl() {
	
	String currentUrl = driver.getCurrentUrl();
		
	return currentUrl;
	
	}
public static String getTitle() {
	
	String title = driver.getTitle();
	

	return title;
		
	}

public static String getAttribut(WebElement w, String s) {
	
	String attribute = w.getAttribute(s);
	
	return attribute;
		
	}

	public static void dropDown(WebElement w,String s) {
		
		select=new Select(w);
		select.selectByValue(s);
		
	}
public static List<WebElement> getOptions(WebElement w,String s) {
		
		select=new Select(w);
		List<WebElement> options = select.getOptions();

		return options;
		
	}

public static List<WebElement> getAllselected(WebElement w,String s) {
	
	select=new Select(w);
	List<WebElement> options1 = select.getAllSelectedOptions();
    
	return options1;
	
}

public static WebElement getFirstSelected(WebElement w) {
	
	select=new Select(w);
	 WebElement firstSelectedOption = select.getFirstSelectedOption();

	return firstSelectedOption;
	
}


	
}
