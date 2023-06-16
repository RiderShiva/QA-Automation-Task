package firstWeekTest;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
	
static WebDriver driver; 

	
    public static <T> void loginAction(WebElement username, WebElement password, WebElement loginButton , T username_value, T  password_value) throws InterruptedException { 
    	
    	username.sendKeys((String) username_value);
		Thread.sleep(2000);
		password.sendKeys((String) password_value);
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
	
		
    }
    

	public static <T> void EmptyUsernameTest(WebElement username, WebElement password, WebElement loginButton,
			T password_value) throws InterruptedException {
		
		
		password.sendKeys((String) password_value);
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		
	}

	public static <T> void EmptyPasswordTest(WebElement username, WebElement password, WebElement loginButton,
			T username_value) throws InterruptedException {
		
		username.sendKeys(( String ) username_value);
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(2000);
		
	}


}
