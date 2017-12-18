package Steps;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataLoader.DataHelper;
import DataLoader.DataMapper;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestRegistration{

	WebDriver driver;
	Scenario scenario;
	public List<HashMap<String,String>> datamap;
	
	 public TestRegistration() throws IOException
	    {
			System.setProperty("webdriver.chrome.driver","C:/seleniumIO/Selenium_Jars/chromedriver.exe" );
			driver = new ChromeDriver();
	       datamap = DataHelper.data("C:\\seleniumIO\\TestData.xlsx","Sheet1");
	      
	    }
	
	@Before
	public void testSetUp(){

	}
	
	@After
	public void testShutDown(){
		//driver.quit();
	}
	
	//Alternation ?: - to not pass values as arguments
	//Capture group (.*) - brackets to pass value as argument
	@Given("^User (?:navigates to|opens|launches|is on) http://demoqa\\.com/registration page$")
	public void browse_website() throws Throwable {
		 String url = "http://demoqa.com/registration";
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.navigate().to(url);
	}

	/*
	//datatable as hasmap
	@When("^user enters the information$")
	public void reg_form(DataTable usertable) throws Throwable {
		Map<String, String> userdata = usertable.asMap(String.class, String.class);
		
		driver.findElement(By.id("name_3_firstname")).sendKeys(userdata.get("FirstName"));
		driver.findElement(By.id("name_3_lastname")).sendKeys(userdata.get("LastName"));
		driver.findElement(By.id("phone_9")).sendKeys(userdata.get("PhoneNumber"));
		driver.findElement(By.id("username")).sendKeys(userdata.get("userName"));
		System.out.println(userdata.toString());
	}
	*/
	//datatable as raw
	/*@When("^user enters the information$")
	public void reg_form(DataTable usertable) throws Throwable {
		scenario.write("Testing regitrstaion page with scenario write");
		List<List<String>> userdata = usertable.raw();
		driver.findElement(By.id("name_3_firstname")).sendKeys(userdata.get(0).get(1).toString());
		driver.findElement(By.id("name_3_lastname")).sendKeys(userdata.get(1).get(1).toString());
		driver.findElement(By.id("phone_9")).sendKeys(userdata.get(2).get(1).toString());
		driver.findElement(By.id("username")).sendKeys(userdata.get(3).get(1).toString());
			
	}*/
	
	@When("^user enters the information from \"(.*?)\" dataset$")
	public void reg_form(String arg1) throws Throwable {
		int index = Integer.parseInt(arg1);
		System.out.println("Printing current data set...");
		for(HashMap<String, String> h : datamap){
			System.out.println(h.keySet());
			System.out.println(h.values());
			
						
		}
		driver.findElement(By.id("name_3_firstname")).sendKeys(datamap.get(index).get("FirstName"));
		driver.findElement(By.id("name_3_lastname")).sendKeys(datamap.get(index).get("LastName"));
		driver.findElement(By.id("phone_9")).sendKeys(datamap.get(index).get("PhoneNumber"));
		driver.findElement(By.id("username")).sendKeys(datamap.get(index).get("userName"));
		
	}
	

	@Then("^account creates$")
	public void account_creates() throws Throwable {

		
	}


}
