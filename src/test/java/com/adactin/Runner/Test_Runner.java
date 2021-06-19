package com.adactin.Runner;

import java.awt.AWTException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.Base.BaseClass;
import com.adactin.prop.Configuration_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adactin//Feature//Feature_Demo",
glue="com.adactin.step_defenition",monochrome=false,dryRun = false, tags = ("~@sanitytest, @smoketest,@smoketest"),
strict=true
,plugin = {"html:Report/cucumber_Report","json:Report/cucumber.json"
,"com.cucumber.listener.ExtentCucumberFormatter:Folder/file.html"		})

public class Test_Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws Throwable {
		
		//System.out.println(Configuration_Manager.propertFileManager().accessConfigReader().browserSetup());
		driver=BaseClass.conctToDriver(Configuration_Manager.propertFileManager().accessConfigReader().browserSetup());
		//driver=BaseClass.conctToDriver("chrome");
	}
	
	public static void teardown() {
		// TODO Auto-generated method stub

		BaseClass.toClose();
	}
	
}
