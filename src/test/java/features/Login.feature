Feature: Application Login

  @RegTest
  Scenario: Home page default login
    Given User is on on landing page
    When User login into application with username "hello" and password "world"
    Then Home page is populated
    And Cards are displayed "true"

  @SmokeTest
  Scenario: Home page default login
    Given User is on on landing page
    When User login into application with username "diksha" and password "password123"
    Then Home page is populated
    And Cards are displayed "false"
# Suppose we have multiple values to pass i.e. lets take case of signup with all the values like first name, 
# middle name and last name , zip code, address, mail id, phone number just like this 15 values 
# then using the way we have above seen for like name and password will not be very useful so for handling this
# we can use the data table concept in cucumber which is very useful for passing multiple values at once.

  @RegTest
  Scenario: Home page default signup with data table
    Given User is on on landing page
    When User signup into application with the following details
      | hello | world | hello@example.com | USA | 123 |
    Then Home page is populated
    And Cards are displayed "true"
# parameterization is a way to run the same test with different data sets.
# if we want to run the same test with different data sets then we can use the scenario outline
# and examples in cucumber which is very useful for parameterization.

  @RegTest
  Scenario Outline: Home page default signup with data table
    Given User is on on landing page
    When User login in to application with <username> and password <password>
    Then Home page is populated
    And Cards are displayed "true"

    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
# when using double quotes "<username>" and "<password>" in the scenario outline,
# here we can use step definition like @When("User login into application with username {string} and password {string}")
# but if we donot use double quotes and use the angle brackets <username> and <password>
# then we can use step definition like @When("^User login into application with (.+) and password (.+)$")
# also regex will match both double quotes and angle

  @SmokeTest
  Scenario Outline: Home page default signup with data table
    Given User is on on landing page
    When User login in to application with "<username>" and password "<password>"
    Then Home page is populated
    And Cards are displayed "true"

    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
