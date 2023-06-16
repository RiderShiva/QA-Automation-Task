package firstWeekTest;

import java.io.File;
import firstWeekTest.Methods;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class TestCases {
	
	@BeforeMethod
	public void setUp() {
		Methods.setUp();
	};
	
	//Invalid CredentialCase for mobile number 
	// Login test using invalid mobile number and valid password
	
	@Test(priority = 1, groups = "LoginAction_MobileNumber")
	public void loginTest_using_absolute_xpath() throws Exception {
		Methods.loginTest_using_absolute_xpath(3434356L,"password");	
	}

	// Login Test using valid mobile number and invalid password
	@Test(priority =2 , groups = "LoginAction_MobileNumber")
	public void loginTest_using_relativexpathOne() throws Exception {
		Methods.loginTest_using_relativexpathOne(9841001122L,"Hi");    
	} 
	
	// Login Test using invalid mobile number and invalid password
	@Test(priority = 3 ,groups = "LoginAction_MobileNumber")
	public void loginTest_using_css_Selector() throws Exception {
		Methods.loginTest_using_css_Selector(3434356L,"Hello");
			
		
	}
	
	
	//Invalid CredentialCase for Email id 
	// Login test using Invalid Email id and valid password
	
	@Test(priority = 4, groups = "LoginAction_EmailId")
	public void loginTest_EmailId_using_absolute_xpath() throws Exception {
		Methods.loginTest_using_absolute_xpath("hello@","password");	
	}

	// Login Test using valid Email id and invalid password
	@Test(priority = 5 , groups = "LoginAction_EmailId")
	public void loginTest_EmailId_using_relativexpathOne() throws Exception {
			Methods.loginTest_using_relativexpathOne("Hello@gmail.com","Hi");    
	} 
		
	// Login Test using invalid Email id and invalid password
	@Test(priority = 6 ,groups = "LoginAction_EmailId")
	public void loginTest_EmailId_using_css_Selector() throws Exception {
		Methods.loginTest_using_css_Selector("Hello@","Hello");		
	}
	
	
	
	// EmptyCase, EmptyUsername
	
	@Test(priority = 7, groups = "EmptyCase")
	public void EmptyUsernameTest_using_absolute_xpath() throws Exception {
		Methods.EmptyUsernameTest_using_absolute_xpath("HI");	
	}
	
	// EmptyCase , EmptyPassword
	
	@Test(priority = 8, groups = "EmptyCase")
	public void EmptyPasswordTest_using_relativexpathOne() throws Exception {
		Methods.EmptyPasswordTest_using_relativexpathOne("Hello@");    
	} 
	
	//EmptyCase, EmptyUsername and EmptyPassword
	@Test(priority = 9 , groups = "EmptyCase")
	public void UsernamePasswordEmptyTest_using_css_Selector() throws Exception {
		Methods.UsernamePasswordEmptyTest_using_css_Selector();
	}
	
	

	@AfterMethod
	public void tearDown() {
		Methods.tearDown();
	}	

}
