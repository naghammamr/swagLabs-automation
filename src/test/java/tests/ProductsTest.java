package tests;

import org.testng.annotations.Test;

import pages.ProductsPage;

public class ProductsTest extends TestBase {
	
	ProductsPage productsPageObject;
	
	@Test
	public void userCanAddProductToCart() 
	{
		productsPageObject = new ProductsPage(driver);
		productsPageObject.addProductToCart();
	}
	
	@Test
	public void userCanNavigateToCart() 
	{
		productsPageObject = new ProductsPage(driver);
		productsPageObject.navigateToCart();		
	}
}
