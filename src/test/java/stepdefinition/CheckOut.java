package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.CheckOutPage;
import Utils.TestComponents;
import io.cucumber.java.en.And;

public class CheckOut {
	public TestComponents tc;
	public WebDriver driver;
	public CheckOutPage checkOutPage;
	
	public CheckOut(TestComponents tc)
	{
		this.tc=tc;
	}

	@And ("^Checkout to verify the (.+)$")
	public void checkOutAndVerify(String prod)
	{
		driver=tc.b.WebDriverManager();
	    checkOutPage = tc.pm.checkOutPage();
	    checkOutPage.clickCart();
		String text = checkOutPage.checkingProd();
		Assert.assertEquals("Saiga Parts TankTie for Jawa 42 (Matte Black)", text);
	}
}
