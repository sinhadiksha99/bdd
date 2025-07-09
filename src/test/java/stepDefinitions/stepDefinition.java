package stepDefinitions;

import java.util.List;
import org.junit.runner.RunWith;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) /* RunWith is optional from latest versions */
public class stepDefinition {

    @Given("^User is on on landing page$")
    public void i_am_on_landing_page() throws Throwable {
        System.out.println("User is on the landing page");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_passoword() {
        System.out.println("User logged in with username and password");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        System.out.println("Home page is populated");
    }

    @And("Cards are displayed {string}")
    public void cards_are_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed: " + string);
    }

    @When("User login into application with username {string} and password {string}")
    public void user_login_into_application_with_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User logged in with username: " + string + " and password: " + string2);
    }

    @When("User signup into application with the following details")
    public void user_login_into_application_with_the_following_details(DataTable data) {
        List<List<String>> list = data.asLists();
        System.out.println(list.get(0).get(0));
        System.out.println(list.get(0).get(1));
        System.out.println(list.get(0).get(2));
        System.out.println(list.get(0).get(3));
        System.out.println(list.get(0).get(4));
    }

    @When("User login in to application with (.+) and password (.+)$")
    public void user_login_into_application_with_and(String username, String password) {
        System.out.println("Logging in with username: " + username + " and password: " + password);
    }

}