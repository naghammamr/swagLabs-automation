package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.checkoutOverviewPage;

public class ConfirmPurchaseTest extends TestBase {

	checkoutOverviewPage overviewPageObject;

	@Test
	public void userCanConfirmPurchase() {
		overviewPageObject = new checkoutOverviewPage(driver);
		overviewPageObject.submitPurchase();

		Assert.assertTrue(overviewPageObject.successPurchaseMsgTxt.getText().contains("THANK YOU FOR YOUR ORDER"));
	}
}
