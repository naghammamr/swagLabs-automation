package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "first-name")
	WebElement fnameTxtBox;

	@FindBy(id = "last-name")
	WebElement lnameTxtBox;

	@FindBy(id = "postal-code")
	WebElement postalCodeTxtBox;

	@FindBy(id = "continue")
	WebElement continueBtn;
	
	public void userCheckoutData(String fname, String lname, String postal_code) {
		
		setTextElementText(fnameTxtBox, fname);
		setTextElementText(lnameTxtBox, lname);
		setTextElementText(postalCodeTxtBox, postal_code);
		
		clickButton(continueBtn);
	}

}
