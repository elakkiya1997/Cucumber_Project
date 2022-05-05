package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continueButton;
	
	
	
	public Select_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

}
