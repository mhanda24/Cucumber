package Modules;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount {
	public static void Execute(WebDriver driver, Properties OR){
		driver.findElement(By.className(OR.getProperty("Account_id"))).click();;
				 
	}
}
