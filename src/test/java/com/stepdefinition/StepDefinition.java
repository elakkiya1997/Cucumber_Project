package com.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base_Class;
import com.properties.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class{
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Before
	public void beforeHook(Scenario s)//Scenario is an interface and we need to pass as argument so that it will get each scenario
	{
		String name = s.getName();//name of the scenario
		
		System.out.println("Scenario Name: " +name);

	}
	
	@After
	public void afterHook(Scenario s) throws IOException {
		
		String status = s.getStatus();//status of the scenario
		
		System.out.println("Scenario Status:" +status);
		
		if (s.isFailed())
		{
			screenshotMethod("C:\\Users\\elakk\\eclipse-workspace\\Cucumber\\Screenshot");
		}
		
		

	}
	
	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	}
	@When("^user Must Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Must_Enter_The_In_The_Username_Field(String username) throws Throwable {
		passInput(pom.getInstanceLogin_Page().getUsername(), username);
	}

	@When("^user Must Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Must_Enter_The_In_The_Password_Field(String password) throws Throwable {
		passInput(pom.getInstanceLogin_Page().getPassword(), password);
	}
	
	
	
	@Then("^user Click The Login Button And Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_Navigates_To_Search_Hotel_Page() throws Throwable {
		
		clickOnMethod(pom.getInstanceLogin_Page().getLogin());
	   
	}
	@When("^user Must Select The \"([^\"]*)\" In Location Field$")
	public void user_Must_Select_The_In_Location_Field(int location) throws Throwable {
		selectByIndexMethod(pom.getInstanceSearch_Hotel_Page().getDropdown1(), location);
	   
	}
	@When("^user Must Select The \"([^\"]*)\" In Hotel Field$")
	public void user_Must_Select_The_In_Hotel_Field(String hotel) throws Throwable {
		selectByVisibleTextMethod(pom.getInstanceSearch_Hotel_Page().getDropdown2(), hotel);
	    
	}

	@When("^user Must Select The \"([^\"]*)\" In Room Field$")
	public void user_Must_Select_The_In_Room_Field(String roomtype) throws Throwable {
		selectByValueMethod(pom.getInstanceSearch_Hotel_Page().getDropdown3(), roomtype);  
	}
	@When("^user Must Select The \"([^\"]*)\" In Number Of Rooms Field$")
	public void user_Must_Select_The_In_Number_Of_Rooms_Field(String numberofrooms) throws Throwable {
		selectByValueMethod(pom.getInstanceSearch_Hotel_Page().getDropdown4(), numberofrooms);
	}

	@When("^user Must Enter The Date In Check In Date Field$")
	public void user_Must_Enter_The_Date_In_Check_In_Date_Field() throws Throwable {
		String checkin = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckin();
		passInput(pom.getInstanceSearch_Hotel_Page().getDropdown5(), checkin);
	    
	}

	@When("^user Must Enter The Date In Check Out Date Field$")
	public void user_Must_Enter_The_Date_In_Check_Out_Date_Field() throws Throwable {
		String checkout = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckout();
		passInput(pom.getInstanceSearch_Hotel_Page().getDropdown6(), checkout);
	    
	}
	@When("^user Must Select the \"([^\"]*)\" In Adults Per Room Field$")
	public void user_Must_Select_the_In_Adults_Per_Room_Field(String adultsperroom) throws Throwable {
		selectByValueMethod(pom.getInstanceSearch_Hotel_Page().getDropdown7(), adultsperroom);
	}
	
	@When("^user Must Select the \"([^\"]*)\" In Children Per Room Field$")
	public void user_Must_Select_the_In_Children_Per_Room_Field(int childperroom) throws Throwable {
		selectByIndexMethod(pom.getInstanceSearch_Hotel_Page().getDropdown8(), childperroom);
	}

	@Then("^user Click the search Button And Navigates to Select Hotel Page$")
	public void user_Click_the_search_Button_And_Navigates_to_Select_Hotel_Page() throws Throwable {
		clickOnMethod(pom.getInstanceSearch_Hotel_Page().getSubmit());
	    
	}

	@When("^user Must Click The Radio Button Under Select Field$")
	public void user_Must_Click_The_Radio_Button_Under_Select_Field() throws Throwable {
		clickOnMethod(pom.getInstanceSelect_Hotel().getRadiobutton());
	    
	}

	@Then("^user Click The Continue Button And Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		clickOnMethod(pom.getInstanceSelect_Hotel().getContinueButton());
	    
	}

	@When("^user Must Enter The First Name In First Name Field$")
	public void user_Must_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		passInput(pom.getInstanceBooking_Page().getFirstname(), firstname);
	   
	}

	@When("^user Must Enter The Last Name In Last Name Field$")
	public void user_Must_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastname();
		passInput(pom.getInstanceBooking_Page().getLastname(), lastname);
	    
	}

	@When("^user Must Enter The Billing Address In Billing Address Field$")
	public void user_Must_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom.getInstanceBooking_Page().getAddress(), address);
	    
	}

	@When("^user Must Enter The Credit Card No In Credit Card No Field$")
	public void user_Must_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
		String creditcard = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCreditcard();
		passInput(pom.getInstanceBooking_Page().getCreditCard(), creditcard);
	    
	}

	@When("^user Must Select The Credit Card Type In Credit Card Type Field$")
	public void user_Must_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
		selectByIndexMethod(pom.getInstanceBooking_Page().getCreditcardType(), 2);
	    
	}

	@When("^user Must Select The Expiry Date In Expiry Date Field$")
	public void user_Must_Select_The_Expiry_Date_In_Expiry_Date_Field() throws Throwable {
		selectByValueMethod(pom.getInstanceBooking_Page().getExpirymonth(), "4");
		selectByIndexMethod(pom.getInstanceBooking_Page().getExpiryyear(), 4);
	}

	@When("^user Must Enter The CVV Number In CVV Number Field$")
	public void user_Must_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {
		String cvvNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvvNumber();
		passInput(pom.getInstanceBooking_Page().getCvvNumber(), cvvNumber);
	    
	}

	@Then("^user Click The Book Now Button And Navigates To Logout Page$")
	public void user_Click_The_Book_Now_Button_And_Navigates_To_Logout_Page() throws Throwable {
	    
		clickOnMethod(pom.getInstanceBooking_Page().getBooknowbutton());
		
		Thread.sleep(10000);
	}

	@Then("^user Click The Logout Button And Navigates to Logged Out Page$")
	public void user_Click_The_Logout_Button_And_Navigates_to_Logged_Out_Page() throws Throwable {
		clickOnMethod(pom.getInstanceBooking_Page().getlogout());
	    
	}



}
