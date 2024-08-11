package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchProductPage {

	public WebDriver driver;
	By product=By.cssSelector("#twotabsearchtextbox");
	By click=By.cssSelector("a[href*='/Saiga-Parts']");
	By addCart=By.cssSelector("#add-to-cart-button");
	
	public SearchProductPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void searchProduct(String prod)
	{
		driver.findElement(product).sendKeys(prod,Keys.ENTER);
		driver.findElement(click).click();
		
	}

	public void addProductToCart()
	{
		driver.findElement(addCart).click();
	}
}
