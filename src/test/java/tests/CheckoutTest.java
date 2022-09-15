package tests;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutTest extends TestBase {

	CartPage cartPageObject;
	CheckoutPage checkoutpageObject;

	String FName = "standard";
	String LName = "user";
	String PostalCode = "11361";

	@Test
	public void userCanEnterCheckoutInfo() {

		checkoutpageObject = new CheckoutPage(driver);
		checkoutpageObject.userCheckoutData(FName, LName, PostalCode);
	}
}
