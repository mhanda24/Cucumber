package Modules;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PasswordGenerator.PwdEncryption;


public class Sign_In {

	public static void Execute(WebDriver driver, Properties OR, String username, String password){
		PwdEncryption pass = new PwdEncryption(driver);
		driver.findElement(By.id(OR.getProperty("username"))).sendKeys(username);
		driver.findElement(By.id(OR.getProperty("password"))).sendKeys(pass.pwdDecode(password));
		driver.findElement(By.cssSelector(OR.getProperty("button"))).click();
	}
}
