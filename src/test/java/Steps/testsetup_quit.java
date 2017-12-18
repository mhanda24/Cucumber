package Steps;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class testsetup_quit {
	
	static WebDriver driver;
	
	
	@Before
	public WebDriver testSetUp(Scenario scenario){
		System.setProperty("webdriver.chrome.driver","C:/seleniumIO/Selenium_Jars/chromedriver.exe" );
		driver = new ChromeDriver();
		System.out.println("Test Environment setup");
		System.out.println("---------------------------------------");
		System.out.println("getting name of teh scenario here : " +scenario.getName());
		
		return driver;
	}
	
	@After
	public void testShutDown(Scenario scenario){
		scenario.write("Finished Scenario");
		if(scenario.isFailed()){
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
		System.out.println("Test Environment Distroyed");
		System.out.println("---------------------------------");
		
		driver.close();
		driver.quit();
	}
	
	
	

}
