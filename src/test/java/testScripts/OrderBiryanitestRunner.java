package testScripts;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
//@CucumberOptions(features = "Feature", 
//glue = "testScripts")
//
//public class OrderBiryanitestRunner extends AbstractTestNGCucumberTests {
//
//}
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features = "Feature",
glue = "testScripts",
plugin = {"pretty","html:test-output","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
},dryRun = false,
strict = true)

public class OrderBiryanitestRunner {

}

        