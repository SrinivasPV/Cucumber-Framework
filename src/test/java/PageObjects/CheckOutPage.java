package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	public WebDriver driver;
	By cart=By.xpath("//a[@href='/gp/cart/view.html?ref_=nav_cart']");
	By prod=By.xpath("//a[@class='a-link-normal sc-product-link']//span[@class='a-truncate-cut']");

	public CheckOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void clickCart()
	{
		driver.findElement(cart).click();
	}
	
	public String checkingProd()
	{
		
		String text = driver.findElement(prod).getText();
		return text;
	}

}
