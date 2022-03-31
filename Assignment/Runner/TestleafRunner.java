package week6.day1.runner;

import io.cucumber.testng.CucumberOptions;
import week6.day1.stepdefn.W6D1BaseClass;

@CucumberOptions(features = { "src/main/java/week6/day1/features" }, 	
				 glue = "stepdefn", 
				 monochrome = true,
				 publish = true
				)
public class TestleafRunner extends W6D1BaseClass{

}
