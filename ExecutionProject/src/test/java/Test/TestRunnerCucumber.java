package Test;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;



@Test
@CucumberOptions(features="C:\\Users\\elizabeth.perez\\eclipse-workspace\\FrameworkProject\\Features", glue= {"C:\\Users\\elizabeth.perez\\eclipse-workspace\\FrameworkProject\\src\\test\\java\\CucumberDefinitions"})
public class TestRunnerCucumber {
}
