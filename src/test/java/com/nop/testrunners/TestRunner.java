package com.nop.testrunners;
    
    import org.junit.runner.RunWith;

	import com.vimalselvam.cucumber.listener.Reporter;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;



		@RunWith(Cucumber.class)
		//features and glue is impotent.glue is a package name
		@CucumberOptions(
				features = "src/test/resources/Feartures/spicejet.feature",
						plugin = {"pretty",
								"html:Reports/cucumber-html-report", 
								"json:Reports/cucumber-html-report/jsonreport.json",
								"rerun:target/cucumber-reports/rerun.txt",
								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
								//"testng:target/Testing-cucumber-reports/cuketestng.xml",
								},
				glue= {"com.stepDefinations"}
				
				
				//strict= true
							
				)
		public class TestRunner {
			//create the report-extent-config.xml
			 public static void Extentsreport()
			  
			  {
			  Reporter.loadXMLConfig("/src/test/resources/Extent-config.xml");
			  Reporter.setSystemInfo("user", System.getProperty("user.name"));
			  Reporter.setSystemInfo("os", "Windows");
			  Reporter.setTestRunnerOutput("Project Natural Report"); }

		}





