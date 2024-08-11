package AbstractMethods;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.TestComponents;

public class CommonMethods {
	public WebDriverWait wait;
	public TestComponents tc;
	public WebDriver driver;

	
	public CommonMethods(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public void waitsForInvisibility(By loc)
	{
	
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loc));
		
	}

	public void switchToChildWindow()
	{
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
	}
}
