package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature", glue = "com.stepdefinition", monochrome = true, dryRun = false, strict = true,
plugin = {"html:Report", "json:Report/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin.html"})
public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		driver= Base_Class.browserLaunch("chrome");

	}
	
	@AfterClass
	public static void tear_down() {
		
		Base_Class.close();
	}

}
