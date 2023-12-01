package uiappfeatures;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class AppHooks {
	WebDriver driver;
	DriverFactory df;
	
	@Before
	public void lauchBrowser() throws IOException
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String browserName= prop.getProperty("browser");
		 
		 df = new DriverFactory();
		
		 driver = df.initBrowser(browserName);
		
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
