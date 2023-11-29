package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\Orders.feature"},
		
		glue = {"steps"},
		
		plugin = {"pretty"},
		
		publish = true,
		
		tags = "@functional"
			
		
		
		)
public class OrderRunner extends AbstractTestNGCucumberTests 
{

}
