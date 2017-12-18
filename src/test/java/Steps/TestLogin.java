package Steps;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.ObjectRepository;
import Modules.MyAccount;
import Modules.Sign_In;
import PasswordGenerator.PwdEncryption;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestLogin{

	public WebDriver driver;
    public Properties OR;
    public TestLogin() throws IOException {
    	System.setProperty("webdriver.chrome.driver","C:/seleniumIO/Selenium_Jars/chromedriver.exe" );
		driver = new ChromeDriver();
       OR = ObjectRepository.ObjectRepo(System.getProperty("user.dir")+"//src//test//resources//OR.properties");
    }
	//Alternation ?: - to not pass values as arguments
	//Capture group (.*) - brackets to pass value as argument
	@Given("^User (?:navigates to|opens|launches|is on) (http://.*com) page$")
	public void browse_website(String url) throws Throwable {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to(url);
	}

	@When("^User clicks on MyAccount link$")
	public void user_clicks_on_MyAccount_link() throws Throwable {
		/*WebElement myAccountLink = driver.findElement(By.className("account_icon"));
		myAccountLink.click();*/
		MyAccount.Execute(driver, OR);
	}

	/*@When("^User enters username as (.*) and password as (.*)$")
	public void loginTest(String user, String pwd) throws Throwable {
		PwdEncryption pass = new PwdEncryption(driver);
		WebElement username = driver.findElement(By.id("log"));
		WebElement password = driver.findElement(By.id("pwd"));
		WebElement button = driver.findElement(By.cssSelector("input[type='submit'][value='Login »']"));
		username.sendKeys(user);
		password.sendKeys(pass.pwdDecode(pwd));
		button.click();
	}*/
	
	@When("^User enters username as (.*) and password as (.*)$")
	public void loginTest(String user, String pwd) throws Throwable {
	Sign_In.Execute(driver, OR, user, pwd);	
		
		
	}

	@Then("^Login Successfull$")
	public void login_Successful() throws Throwable {
		String logOutText = null;
		
		try{
			logOutText = driver.findElement(By.cssSelector("a[title='Logout']")).getText();
		}catch(Exception e){
			System.out.println("Text not found ");
		}

		Assert.assertEquals("(Logout)", logOutText);
		
	}

	@When("^user click on Registration link$")
	public void registration_Link(){
		driver.findElement(By.xpath("//*[@id=\"meta\"]/ul/li[1]/a")).click();

	}
	@Then("^Registration page opens$")
	public void registration_page(){
		String registerText = driver.findElement(By.xpath("//*[@id=\"login\"]/p[1]")).getText();
		Assert.assertEquals("Register For This Site", registerText);
	}

}



