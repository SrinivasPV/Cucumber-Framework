package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import PageObjects.SearchProductPage;
import Utils.TestComponents;
import io.cucumber.java.en.And;

public class SearchProd {
	public WebDriver driver;
	public TestComponents tc;
	public SearchProductPage searchProd;
	
	public SearchProd(TestComponents tc)
	{
		this.tc=tc;
	}
	
     @And ("^Search for the product (.+) and add it cart$")
     public void searchProdAndAddToCart(String prod)
     {
    	 driver = tc.b.WebDriverManager();
 
    	 searchProd = tc.pm.searchProd();
    	 searchProd.searchProduct(prod);
    	 tc.cm.switchToChildWindow();
    	 searchProd.addProductToCart();
     }

}
