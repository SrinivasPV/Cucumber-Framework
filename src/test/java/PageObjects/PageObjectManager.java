package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public PageObjects.LoginPage loginPage()
	{
		LoginPage l = new LoginPage(driver);
		return l;
		
	}
	
	public SearchProductPage searchProd()
	{
		SearchProductPage sp = new SearchProductPage(driver);
		return sp;
	}
	
	public CheckOutPage checkOutPage()
	{
		return new CheckOutPage(driver);
	}
	

}
