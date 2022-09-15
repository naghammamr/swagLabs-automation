package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends PageBase {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement addProductToCartBtn;
	
	@FindBy(id="shopping_cart_container")
	WebElement cartBtn;
	
	public void addProductToCart() 
	{
		clickButton(addProductToCartBtn);
	}
	
	public void navigateToCart() {
		clickButton(cartBtn);
	}
	
	

}
