package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import Utils.BaseClass;
import Utils.TestComponents;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	public WebDriver driver;
	public TestComponents tc;
	public LoginPage loginPage;

	public Login(TestComponents tc) {
		this.tc = tc;

	}

	@Given("Go to loging page")
	public void goToWebSite() {

//		tc.driver = new ChromeDriver();
//		tc.driver.manage().window().maximize();
//		tc.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver = tc.b.WebDriverManager();
		loginPage = tc.pm.loginPage();
		loginPage.landingPage("https://www.amazon.in/");
	}

	@When("^Enter username (.+) and password (.+)$")
	public void enterCredentials(String number, String pass) {
		loginPage.getCredentials(number, pass);

	}

	@Then("Click on login button")
	public void clickLoginButton() {
		loginPage.clickLogin();
	}

}
