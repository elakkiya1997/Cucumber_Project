package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;//null
	
	public static Select s;
	public static Actions ac;
	
	//browser launch
	 public static WebDriver browserLaunch(String type) {
		 
		 if (type.equalsIgnoreCase("chrome")) {
			 
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			
		}
		 else if (type.equalsIgnoreCase("firefox")) {
			 
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\elakk\\eclipse-workspace\\Selenium\\Driver\\Chrome100\\chromedriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			
		}
		 
		return driver;

	}
	 
	 //getText
	 
	 public static void getTextMethod(WebElement element) {
		
		System.out.println(element.getText()); 
	}
	 //getAttribute
	 
	 public static void getAttributeMethod(WebElement element, String name ) {
	
		 System.out.println(element.getAttribute(name));

	}
	 
	 //isDisplayed
	 
	 public static void isDisplayedMethod(WebElement element) {
		
		 System.out.println(element.isDisplayed());
	}
	 //isEnabled
	 
	 public static void isEnabledMethod(WebElement element) {
		System.out.println(element.isEnabled());

	}
	 
	 //isSelected
	 public static void isSelectedMethod(WebElement element) {
		
		 System.out.println(element.isSelected());
	}
	
	//get
	public static void getUrl(String Url) {
		
		driver.get(Url);
	}
	//gettitle
	public static void getTitileMethod() {
		String title = driver.getTitle();
		System.out.println(title);

	}
	//getcurrentUrl
	public static void getCurrentUrlMethod() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	//getPageSource
	public static void getPageSourceMethod() {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}
	//maximize
	public static void maximizeMethod() {
		driver.manage().window().maximize();

	}
	//navigateTo
		public static void navigateToMethod(String url) {
			driver.navigate().to(url);

		}
		
		//navigateBack
		public static void navigateBackMethod() {
			
			driver.navigate().back();
		}
		//navigateForward
		
		public static void navigateForwardMethod() {
			driver.navigate().forward();
		}
		//navigateRefresh
		public static void navigateRefreshMethod() {
			driver.navigate().refresh();

		}
		
	
	//click
	public static void clickOnMethod(WebElement element) {
		element.click();

	}
	
	//sendkeys
	public static void passInput(WebElement element, String input) {
		
		element.sendKeys(input);
	}
	
	//close
	
	public static void close() {
		
		driver.close();
	}
	
	//quit
	
	public static void quit() {
		driver.quit(); 

	}
	
	//screenshot
	
	public static void screenshotMethod(String location) throws IOException {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		File destination = new File(location);
		FileHandler.copy(source, destination);

	}
	//selectByIndex
	public static void selectByIndexMethod(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
		
	}
	
	//selectByValue
	
	public static void selectByValueMethod(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);

	}
	//selectByVisisbleText
	public static void selectByVisibleTextMethod(WebElement element, String text) {
		s = new Select(element);
		s.selectByValue(text);

	}
	//getOptions
	public static void getOptionsMethod() {
	List<WebElement> list = s.getOptions();
	int sizeOfMulti = list.size();
	System.out.println("Size of Multiple dropdown: "+sizeOfMulti);
	
	for (WebElement i : list) {
		System.out.println(i.getText());
		
	}
	
}
	//getAllSelectedOptions
	public static void allSelectedOptionsMethod() {
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement i : allSelectedOptions)
		{
			System.out.println(i.getText());
			
		}
	}
	//getFirstSelectedoptions
	public static void firseSelectedOptions() {
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
	}
	
	//frames
	
	//switch to frame
	public static void switchToFrameUsingIndex(int index) {
		driver.switchTo().frame(index);	
		
	}
	
	//switch to frame using name
		public static void switchToFrameUsingName( String name) {
			driver.switchTo().frame(name);	
			
		}
	//switch to frame using webelement
		
		public static void switchToFrameUsingWebElement(WebElement element) {
			
			driver.switchTo().frame(element);	
		}
		
	//switch to default content
	
	public static void switchTodefaultContentMethod() {
		driver.switchTo().defaultContent();

	}
	
	//parentframe
	
	public static void switchToParaentFrameMethod() {
		
		driver.switchTo().parentFrame();
	}
	
	
	//Alert
	//simple Alert
	public static void simpleAlertMethod() {
		driver.switchTo().alert().accept();

	}
	//confirm Alert
	
	public static void confirmAlertMethod() {
		driver.switchTo().alert().dismiss();

	}
	
//prompt Alert
	public static void promptAlertMethod(WebElement element, String input ) {
		
		Alert promptBox = driver.switchTo().alert();
		
		element.sendKeys(input);
		
		promptBox.accept();
	}
	
	//Actions
	
	//Keyboard Actions
	public static void keyboardActionsMethod() throws AWTException {
		
		Robot rc = new Robot();
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		rc.keyPress(KeyEvent.VK_DOWN);
		rc.keyRelease(KeyEvent.VK_DOWN);
		
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);

	}
//	
//	//clickAndHold
//	
//	public static void clickAndHoldMethod(WebElement source, WebElement target) {
//		ac = new  Actions(driver);
//		ac.clickAndHold(source).build().perform();
//		ac.moveToElement(target).build().perform();
//		ac.release(target).build().perform();
//				
//			}
			
		
	//Rightclick
	public static void contextClickMethod(WebElement element) {
		 ac = new  Actions(driver);
		 ac.contextClick(element).build().perform();

	}
	//double click
	public static void doubleClickMethod(WebElement element) {
		 ac = new  Actions(driver);
		 ac.doubleClick(element).build().perform();

	}
	//click
	
	public static void clickMethod(WebElement element) {
		 ac = new  Actions(driver);
		 ac.click(element).build().perform();

	}
	//movetoelement
	
	public static void moveToElementMethod(WebElement element) {
		ac = new  Actions(driver);
		ac.moveToElement(element).build().perform();

	}
	//draganddrop
	
	public static void dragAndDropMethod(WebElement source, WebElement target ) {
		
		ac = new  Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
		
	}
	
	//getwindowshandle
			public static void getWindowHandleMethod() {
				
				 driver.getWindowHandle();
				
			}
	//getWindowHandles
			public static void getWindowHandles() {
				Set<String> allWindows = driver.getWindowHandles();

				for (String id : allWindows) {

					System.out.println(id);

					String title = driver.switchTo().window(id).getTitle();

					System.out.println(title);	

				}
			}
			
	//scroll function
			public static void scrollFuctionMethods(WebElement element) throws Throwable {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
				
			}
			
	//waitConcepts
	//implicit wait	
		public static void implicitWaitMethod(int seconds) {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

		}	
		
	//explicit wait
		
		public static void explicitWaitMethod(WebElement element, int seconds) {
			WebDriverWait wait = new WebDriverWait(driver,seconds);
			wait.until(ExpectedConditions.visibilityOf(element));

		}
		
	//fluent wait
		
		public static void fluentWaitMethod(int input) {
			

		}
		
	//radioButton
		public static void radioButton(WebElement element) {
			
			boolean selected = element.isSelected();	
				
		}
		
		
	//checkBox
	public static  void checkBoxMethod(WebElement element) {
		if(element.isSelected())
		{
			element.click();	
		}
		
		
		
	
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
