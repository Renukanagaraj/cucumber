package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile",glue="stepDefinitions",
plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/report.html",
		"pretty","html:target/cucumber-reports"},monochrome=true)

		
//feature is a keyword
//glue indicates definition of path of file step definition
//pretty generate report in target folder
//monochrome means readable English
public class Runner {

}
