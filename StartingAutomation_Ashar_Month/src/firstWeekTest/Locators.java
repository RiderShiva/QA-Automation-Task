package firstWeekTest;

public class Locators {
	
	// Absolute xpaths 
		public static String absolute_xpath_username = "/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[1]/input";
		public static String absolute_xpath_password = "/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[2]/input";
		public static String absolute_xpath_loginButton = "/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[1]/button";
		public static String absolute_xpath_LoginErrorMessage = "/html/body/div[8]/div/div/div[2]";
		public static String absolute_xpath_EmptyUsernameErrorMessage = "/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[1]/input[@error = 'You can't leave this empty.']"; 
		public static String absolute_xpath_EmptyPasswordErrorMessage = "/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[2]/input[@error = 'You can't leave this empty.']";
		
		// Relative xpaths 
		public static String relative_xpath_username = "//div[ @class ='mod-login'] // input[@placeholder = 'Please enter your Phone Number or Email'] ";
		public static String relative_xpath_password = "//div[@class ='mod-login' ] // input [@placeholder = 'Please enter your password']";
		public static String relative_xpath_loginButton = "//div[@class = 'mod-login-col2']// button [@type = 'submit']";
		public static String relative_xpath_LoginErrorMessage = "//div[@class = 'next-feedback-content']"; 
		public static String relative_xpath_EmptyUsernameErrorMessage = "//div[ @class ='mod-login'] // input[@error = 'You can't leave this empty.']";
		public static String relative_xpath_EmptyPasswordErrorMessage = "//div[ @class ='mod-login'] // input[@error = 'You can't leave this empty.']";
		
		// Css Selectors
		public static String cssSelector_username = "input[placeholder = 'Please enter your Phone Number or Email'] ";
		public static String cssSelector_password = "input[placeholder = 'Please enter your password']";
		public static String cssSelector_loginButton = "button[type = 'submit']";
		public static String cssSelector_LoginErrorMessage = "div.next-feedback-content"; 
		public static String cssSelector_EmptyUsernameErrorMessage = "input[@error = 'You can't leave this empty.'] ";
		public static String cssSelector_EmptyPasswordErrorMessage = "input[@error = 'You can't leave this empty.'] ";

}
