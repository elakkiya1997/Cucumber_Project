package com.properties;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Class {

	public static Properties p;

	public Configuration_Class() throws Throwable {
		//to get the file

		File f = new File("C:\\Users\\elakk\\eclipse-workspace\\April_Project\\src\\main\\java\\com\\properties\\Adactin.properties");

		//Read the inputs from the file

		FileInputStream fis  = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}

	//getUrl method
	public String getUrl() throws Throwable {


		String url = p.getProperty("url");

		return url;	

	}

	//get username

	public String getUsername() throws Throwable {


		String username = p.getProperty("username");

		return username; 

	}

	//getPassword

	public String getPassword() throws Throwable {


		String password = p.getProperty("password");

		return password; 

	}
	
	//getCheckin
	
	public String getCheckin() {
		
		String checkin = p.getProperty("checkin");
		
		return checkin;
		

	}
	
	//getCheckout
	
	public String getCheckout() {
		
		String checkout = p.getProperty("checkout");
		
		return checkout;
	}

//getFirstname
	
	
	public String getFirstname() throws Throwable {


		String firstname = p.getProperty("firstname");

		return firstname; 

	}

//getLastname
	
	public String getLastname() throws Throwable {


		String lastname = p.getProperty("lastname");

		return lastname; 

	}

//getAddress

	public String getAddress() throws Throwable {


		String address = p.getProperty("address");

		return address; 

	}

//credit card
	public String getCreditcard() throws Throwable {


		String Creditcard = p.getProperty("creditcard");

		return Creditcard; 

	}

//Cvvnumber

	public String getCvvNumber() throws Throwable {


		String cvvnumber = p.getProperty("cvvnumber");

		return cvvnumber; 

	}




}
