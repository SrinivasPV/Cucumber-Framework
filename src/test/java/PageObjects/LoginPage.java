package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {
 
	public WebDriver driver;
	By signin=By.xpath("//span[contains(text(),'Hello, sign')]");
	By uname=By.cssSelector(".a-input-text");
	By button=By.cssSelector("input#continue");
	By password=By.cssSelector("input#ap_password");
	By login=By.cssSelector("span#auth-signin-button");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	
	public void landingPage(String url)
	{
		driver.get(url);
	}
	
	public void getCredentials(String name, String pass)
	{
		
		driver.findElement(signin).click();
		driver.findElement(uname).sendKeys(name,Keys.ENTER);
//		driver.findElement(button).click();
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin()
	{
		driver.findElement(login).click();
	}

}
