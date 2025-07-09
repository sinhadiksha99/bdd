package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/* if we just want to single feature file then we can specify the path to that file i.e. src/test/java/features/Login.feature */
/* it gives the step level pass and green tick in test results when we use stepNotifications */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", 
                    glue = "stepDefinitions", 
                    stepNotifications = false, 
                    tags = "@PortalTest") // to run a specific tag)
public class TestRunner {

}
/*
 * if we want to run multiple tags then we can use the OR operator like
 * 
 * @SmokeTest or @RegressionTest
 * if we want to run all but not a specific tag then we can use the not operator
 * ex : not @SanityTest
 * suppose a test is tagged with multiple tags then it will run using and
 * operator such as
 * 
 * @SmokeTest and @RegressionTest
 * 
 * @RegTest @SmokeTest
 * Scenario: Home page default login
 * Given User is on on landing page
 * When User login into application with username "hello" and password "world"
 * Then Home page is populated
 * And Cards are displayed "true"
 */