package stepdefinition;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import Utils.TestComponents;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;

public class Hooks {

	public TestComponents tc;
	public WebDriver driver;

	public Hooks(TestComponents tc) {
		this.tc = tc;
	}

	@After
	public void quitBrowser() {
		driver = tc.b.WebDriverManager();
		driver.quit();

	}
	
	@AfterStep
	public void screenShot(io.cucumber.java.Scenario scenario) throws IOException
	{
		
		WebDriver driver = tc.b.WebDriverManager();
		if(scenario.isFailed())
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] readByte = FileUtils.readFileToByteArray(src);
			scenario.attach(readByte, "image/png", "image");
		}
		
	}

}
