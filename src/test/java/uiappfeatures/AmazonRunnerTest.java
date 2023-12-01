package uiappfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\uiappfeatures"},
		
		glue = {"uiappfeatures"},
		
		plugin = {"pretty"},
		
		publish = true
		
		
		)




public class AmazonRunnerTest extends AbstractTestNGCucumberTests
{

}
