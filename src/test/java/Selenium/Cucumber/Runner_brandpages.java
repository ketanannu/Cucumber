package Selenium.Cucumber;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,tags = { "@Brandpages" }, glue = { "Selenium.Cucumber" }, features = {
		"feature/" }, plugin = { "pretty", "json:target/jsonFolder/cucumberbrand.json" ,"html:target/htmlFolder/"})
public class Runner_brandpages {

};
