package Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\featuress",
		glue = {"stepDeination"},
		plugin = {"json:target/cucumber.json"},
		monochrome = true, //display the console output in a proper readable format
		dryRun = false,//to check the mapping is proper between feature file and step def file
		tags ="@logtest")	

public class run {

}
