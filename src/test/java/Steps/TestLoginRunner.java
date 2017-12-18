package Steps;

import java.io.File;
//import java.util.Properties;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict= true,
		dryRun=false,
		features={"src/test/resources/Feature/Login.feature"},
		glue={"Steps"},
		//tags={"@web2"},
		//name={"Registration"},
		monochrome= true,
		plugin={"pretty","html:Reports/cucumber-html",
				"rerun:target/rerun.txt",
				"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\mhanda200\\Desktop\\ComcastWorkspace\\TestLogin\\Reports\\cucumber-extent\\report.html"}
		)

public class TestLoginRunner {
	
	@AfterClass
	public static void reportSetup(){
		
		Reporter.loadXMLConfig(new File("C:\\Users\\mhanda200\\Desktop\\ComcastWorkspace\\TestLogin\\src\\test\\resources\\Feature\\extent-config.xml"));
		/*Properties p = System.getProperties();
		p.list(System.out);*/
		
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("64 Bit", "Windows 10");
		Reporter.setSystemInfo("3.0", "Selenium");
		Reporter.setSystemInfo("3.3.9", "Maven");
		Reporter.setSystemInfo("1.8.0_66", "Java Version");
		Reporter.setTestRunnerOutput("Cucumber Junit Test Runner");
	}

}

/*
public class TestLoginRunner extends AbstractTestNGCucumberTests{

}

//strict - true/false it will try to find the missing or pending steps and will fail if not found
//monochrome = true/false enhance the readability

*/