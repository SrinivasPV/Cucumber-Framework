package Utils;

import org.openqa.selenium.WebDriver;

import AbstractMethods.CommonMethods;
import PageObjects.PageObjectManager;

public class TestComponents {
	public WebDriver driver;
	public BaseClass b;
	public CommonMethods cm;
	public PageObjectManager pm;
	
  
	public TestComponents()
	{
		b = new BaseClass();
		cm = new CommonMethods(b.WebDriverManager());
		pm = new PageObjectManager(b.WebDriverManager());
	}

}
