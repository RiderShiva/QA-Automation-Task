package firstWeekTest;

import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Methods {
	

	//Creating instance of WebDriver Object
	public static WebDriver driver;		
	


	public static void setUp() { 
	
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		String Url = "https://member.daraz.com.np/user/login";
		driver.get(Url);
		driver.manage().window().maximize();
	
		// Statement to wait implicitly
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	// Generic Methods
	public static <T> void loginTest_using_absolute_xpath( T username_value , T password_value ) throws Exception {
	
	
		// Defining Xpaths
		String xpath_username = Locators.absolute_xpath_username;
		String xpath_password = Locators.absolute_xpath_password;
		String xpath_loginButton = Locators.absolute_xpath_loginButton;
		String xpath_errorMessage = Locators.absolute_xpath_LoginErrorMessage;
	
	
		// Locating WebElements
		WebElement username = driver.findElement(By.xpath(xpath_username));
		WebElement password = driver.findElement(By.xpath(xpath_password));
		WebElement loginButton = driver.findElement(By.xpath(xpath_loginButton));
	
	
		// Performing Login Action on WebElements
		Action.loginAction(username, password, loginButton,username_value,password_value);
	
		// ErrorMessage Check
		WebElement errorAlert = driver.findElement(By.xpath(xpath_errorMessage));
		String ErrorTitle = errorAlert.getText();
		ErrorTitle.compareTo("Please enter a valid phone number.");
			
		//Taking Screenshot
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
	 	File SrcFile =scrShot.getScreenshotAs(OutputType.FILE);
	 	//Move image file to new destination
	 	String fileName = "D:\\Trail\\PageObjectModel\\test-output\\" + "Test_using_absoluteXpath" + ".png";
	 	File DestFile = new File(fileName); 
	 	FileUtils.copyFile(SrcFile, DestFile); 
	

	
	}

	// Generic Methods
	public static <T> void loginTest_using_relativexpathOne(T username_value , T password_value) throws Exception {
	
		// Defining Xpaths
		String xpath_username = Locators.relative_xpath_username;
		String xpath_password = Locators.relative_xpath_password;
		String xpath_loginButton = Locators.relative_xpath_loginButton;
		String xpath_errorMessage = Locators.relative_xpath_LoginErrorMessage;
	
		// Locating WebElements
		WebElement username = driver.findElement(By.xpath(xpath_username));
		WebElement password = driver.findElement(By.xpath(xpath_password));
		WebElement loginButton = driver.findElement(By.xpath(xpath_loginButton));
	
	
		// Performing Action on WebElements
		Action.loginAction(username, password, loginButton,username_value, password_value);
	
		// Error Check
		WebElement errorAlert = driver.findElement(By.xpath(xpath_errorMessage));
		String ErrorTitle = errorAlert.getText();
		ErrorTitle.compareTo("Incorrect username or password.");
	
		//Taking Screenshot
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile =scrShot.getScreenshotAs(OutputType.FILE);
    	//Move image file to new destination
    	String fileName = "D:\\Trail\\PageObjectModel\\test-output\\" + "Test_using_relative_xpath" + ".png";
    	File DestFile = new File(fileName); 
    	FileUtils.copyFile(SrcFile, DestFile);     
	} 

	// Generic Methods
	public static <T> void loginTest_using_css_Selector(T username_value , T password_value) throws Exception {
	
	
		// Defining css Selectors
		String css_username = Locators.cssSelector_username;
		String css_password = Locators.cssSelector_password;
		String css_loginButton = Locators.cssSelector_loginButton;
		String css_errorMessage = Locators.cssSelector_LoginErrorMessage;
	
	
		// Locating WebElements
		WebElement username = driver.findElement(By.cssSelector(css_username));
		WebElement password = driver.findElement(By.cssSelector(css_password));
		WebElement loginButton = driver.findElement(By.cssSelector(css_loginButton));
	
	
		// Performing Login Action on WebElements
		Action.loginAction(username, password, loginButton,username_value,password_value);
	
		// Error Check
		WebElement errorAlert = driver.findElement(By.cssSelector(css_errorMessage));
		String ErrorTitle = errorAlert.getText();
		ErrorTitle.compareTo("Please enter a valid phone number.");
			
	
	
	}


	// EmptyCase, EmptyUsername , Generic Methods 
	public static <T> void EmptyUsernameTest_using_absolute_xpath(T password_value) throws InterruptedException {
	
		// Defining Xpaths
		String xpath_username = Locators.absolute_xpath_username;
		String xpath_password = Locators.absolute_xpath_password;
		String xpath_loginButton = Locators.absolute_xpath_loginButton;
		String xpath_EmptyUsernameErrorMessage = Locators.absolute_xpath_EmptyUsernameErrorMessage;
					
		// Locating WebElements
		WebElement username = driver.findElement(By.xpath(xpath_username));
		WebElement password = driver.findElement(By.xpath(xpath_password));
		WebElement loginButton = driver.findElement(By.xpath(xpath_loginButton));
		WebElement EmptyUsernameErrorMessage = driver.findElement(By.xpath(xpath_EmptyUsernameErrorMessage));
	
	
		// Performing Login Action on WebElements
		Action.EmptyUsernameTest(username, password, loginButton,password_value);
	
		// Checking whether error message for empty password loaded or not 
		EmptyUsernameErrorMessage.isDisplayed();
	
	}

	// EmptyCase, EmptyPassword , Generic Methods
	public static <T> void EmptyPasswordTest_using_relativexpathOne(T username_value) throws InterruptedException {
	
		// Defining Xpaths
		String xpath_username = Locators.relative_xpath_username;
    	String xpath_password = Locators.relative_xpath_password;
		String xpath_loginButton = Locators.relative_xpath_loginButton;
		String xpath_errorMessage = Locators.relative_xpath_LoginErrorMessage;
		String xpath_EmptyPasswordErrorMessage = Locators.relative_xpath_EmptyPasswordErrorMessage;
				
		// Locating WebElements
		WebElement username = driver.findElement(By.xpath(xpath_username));
		WebElement password = driver.findElement(By.xpath(xpath_password));
		WebElement loginButton = driver.findElement(By.xpath(xpath_loginButton));
		WebElement EmptyPasswordErrorMessage = driver.findElement(By.xpath(xpath_EmptyPasswordErrorMessage));
	
				
				
		// Performing Action on WebElements
		Action.EmptyPasswordTest(username, password, loginButton,username_value);
	
		// Checking whether error message for empty password loaded or not 
		EmptyPasswordErrorMessage.isDisplayed();
	} 
	
	// EmptyCase, BothEmptyCase
	public static void UsernamePasswordEmptyTest_using_css_Selector() {
	
		// Defining css Selectors
		String css_loginButton = Locators.cssSelector_loginButton;
		String css_EmptyUsernameErrorMessage = Locators.cssSelector_EmptyUsernameErrorMessage;
		String css_EmptyPasswordErrorMessage = Locators.cssSelector_EmptyPasswordErrorMessage;
				
		// Locating WebElements
		WebElement loginButton = driver.findElement(By.cssSelector(css_loginButton));
		WebElement EmptyUsernameErrorMessage = driver.findElement(By.xpath(css_EmptyUsernameErrorMessage));
		WebElement EmptyPasswordErrorMessage = driver.findElement(By.xpath(css_EmptyPasswordErrorMessage));
	
    
		// Performing login click action
		loginButton.click();
    
		// Checking whether error message for empty username loaded or not 
		Boolean UsernameErrorCheck = EmptyUsernameErrorMessage.isDisplayed();
 	
		// Checking whether error message for empty password loaded or not 
		Boolean PasswordErrorCheck = EmptyPasswordErrorMessage.isDisplayed();
 	
		if(UsernameErrorCheck &&  PasswordErrorCheck) {
 		
		}
	}

	public static void takeScreenShot(String testMethodName) throws IOException {
	
	
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//Call getScreenshotAs method to create image file
		File SrcFile =scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		String fileName = "D:\\Trail\\PageObjectModel\\test-output\\" + testMethodName + ".png";
		File DestFile = new File(fileName); 
		FileUtils.copyFile(SrcFile, DestFile); 
	 
	}

	public static void tearDown() {
	driver.quit();
	}


}
