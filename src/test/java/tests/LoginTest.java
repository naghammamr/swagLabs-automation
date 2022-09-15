package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage loginObject;

	String username = "standard_user";
	String password = "secret_sauce";

	@Test(priority = 1, alwaysRun = true)
	public void userCanLoginSuccessfully() 
	{
		loginObject = new LoginPage(driver);
		loginObject.UserLogin(username, password);
	}
}