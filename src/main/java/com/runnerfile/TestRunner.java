package com.runnerfile;
import io.cucumber.junit.Cucumber; 
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/resources/featureloginpage.feature",
        		"src/main/java/resources/adminpage.feature"
        },
        glue={"com/stepsdefinations"},
        		plugin = {"json:target/cucumber.json",
        				"json:target/cucumber-jason-reports/Cucumber.json" ,
                        "html:target/cucumber-html-reports/cucumber.html",
                        "junit:target/cucumber-xml-reports/Cucumber.xml"
        		},
        tags="@regressiontest"
		)
      public class TestRunner 
      {
	
      }