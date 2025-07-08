package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) /* RunWith is optional from latest versions */
public class stepDefinition {

    @Given("^User is on on landing page$")
    public void i_am_on_landing_page() throws Throwable {
        throw  new PendingException();
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_passoword() {
        System.out.println("User logged in with username and password");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        System.out.println("Home page is populated");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() {
        System.out.println("Cards are displayed");
    }
}