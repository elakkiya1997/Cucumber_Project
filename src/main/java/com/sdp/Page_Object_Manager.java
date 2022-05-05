package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Booking_Page;
import com.pomclass.Login_Page;
import com.pomclass.Search_Hotel_Page;
import com.pomclass.Select_Hotel;

public class Page_Object_Manager {
	
	//private dadatype variable;--> syntax to make a variable as private
	
	//private webelement refname;-->syntax to make a webelement as private
	
	//	private class_name obj; --> syntax to make a object as private
	
	
	public WebDriver driver;
	
	private Login_Page lp;
	
	private Search_Hotel_Page shp;
	
	private Select_Hotel sh;
	
	private Booking_Page bp;
	
	

	public Page_Object_Manager(WebDriver driver2) {
		this.driver= driver2;
	}

	public Login_Page getInstanceLogin_Page() {
		
		if (lp==null) {
			lp= new Login_Page(driver);	
		}
		
		return lp;
		}
	
	public Search_Hotel_Page getInstanceSearch_Hotel_Page() {
		
		if (shp==null) {
			
			shp=new Search_Hotel_Page(driver);
		}
		return shp;

	}
	
	public Select_Hotel getInstanceSelect_Hotel() {

		if (sh==null) {
			
			sh=new Select_Hotel(driver);
		}
		return sh;

	}
	
	public Booking_Page getInstanceBooking_Page() {
		
		if (bp==null) {
			
			bp=new Booking_Page(driver);
		}
		return bp;
		

	}
	

}
