package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {
	
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement dropdown1;
	
	@FindBy(id="hotels")
	private WebElement dropdown2;
	
	@FindBy(id="room_type")
	private WebElement dropdown3;
	
	@FindBy(id="room_nos")
	private WebElement dropdown4;
	
	@FindBy(id="datepick_in")
	private WebElement dropdown5;
	
	@FindBy(id="datepick_out")
	private WebElement dropdown6;
	
	@FindBy(id="adult_room")
	private WebElement dropdown7;
	
	@FindBy(id="child_room")
	private WebElement dropdown8;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	

	public Search_Hotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDropdown1() {
		return dropdown1;
	}

	public WebElement getDropdown2() {
		return dropdown2;
	}

	public WebElement getDropdown3() {
		return dropdown3;
	}

	public WebElement getDropdown4() {
		return dropdown4;
	}

	public WebElement getDropdown5() {
		return dropdown5;
	}

	public WebElement getDropdown6() {
		return dropdown6;
	}

	public WebElement getDropdown7() {
		return dropdown7;
	}

	public WebElement getDropdown8() {
		return dropdown8;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
	
	

}
