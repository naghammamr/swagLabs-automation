package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutOverviewPage extends PageBase {

	public checkoutOverviewPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "finish")
	WebElement finishBtn;

	@FindBy(xpath = "//div//h2")
	public WebElement successPurchaseMsgTxt;

	public void submitPurchase() {
		clickButton(finishBtn);
	}

}