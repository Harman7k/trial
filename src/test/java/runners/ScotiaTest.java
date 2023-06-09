package runners;

import org.junit.runner.RunWith;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cucumber.api.CucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\USER\\Desktop\\QA\\Automation\\CucumberProjectBatch62\\src\\test\\java\\features"},//the path of the feature files
		glue={"stepDefinations"},//the path of the step definition files
		plugin= {"pretty"},
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step def file
		)
public class ScotiaTest {
	
	
}