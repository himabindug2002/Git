package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Fearture",
		glue = "stepDef",
		tags = "@SanityTest and @E2ETest",
		//plugin = {"pretty", "html:target/cucumber/report.html",
				//"json:target/cucumber/report.json",
				//"junit:target/cucumber/report.xml"},
		plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		//monochrome = true,
		//dryRun = false
				)

public class HotelSearch {

}

//plugin = "pretty" or plugin = "usage", monochrome = true
//plugin = {"pretty", "html:target/cucumber_reports.html"}
//plugin = {"pretty", "json:target/cucumebr_reports/reportname.json"}
//plugin = {"pretty", "junit:target/cucumebr_reports/filename.xml"}

//dryRun = false  
//(comment out @then in step defination)

//plugin = com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:
//(comment out all tasks done above html files)
