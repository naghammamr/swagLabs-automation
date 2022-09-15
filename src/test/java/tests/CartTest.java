package tests;

import org.testng.annotations.Test;

import pages.CartPage;

public class CartTest extends TestBase {

	CartPage cartPageObject;
	
	@Test
	public void userCanCheckOut() 
	{
		cartPageObject = new CartPage(driver);
		cartPageObject.clickCheckOutBtn();
	}
}
