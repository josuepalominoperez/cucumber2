package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features/Search.feature" , glue= {"StepDefinitions"} ,
monochrome = true,
tags= "@smoke",
plugin = {"pretty" , "html:target/HtmlReports/report.html"})
public class TestRunner {

}
