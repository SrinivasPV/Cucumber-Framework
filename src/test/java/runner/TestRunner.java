package runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/feature/OrderProduct.feature", glue="stepdefinition", tags="@Placeorder",
plugin={"pretty","html:target/HTML.html","json:target/Json.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		,"rerun:target/failed_scenario.txt"}, monochrome=true, publish=true)
public class TestRunner extends AbstractTestNGCucumberTests{
	
    @DataProvider(parallel=true)
    public Object[][] scenarios() {
 
    	return super.scenarios();
    }

}
