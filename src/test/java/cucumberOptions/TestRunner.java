package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/* if we just want to single feature file then we can specify the path to that file i.e. src/test/java/features/Login.feature */
/* it gives the step level pass and green tick in test results when we use stepNotifications */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue =  "stepDefinitions" , stepNotifications = true)
public class TestRunner {

}
