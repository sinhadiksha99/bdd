Feature: Portal Login


  Background:
    Given validate the browser
    When browser is triggered
    Then check browser is started

  @PortalTest
  Scenario: Home page default login
    Given User is on on landing page
    When User login into application with username "hello" and password "world"
    Then Home page is populated
    And Cards are displayed "true"

  @PortalTest
  Scenario: Home page default login
    Given User is on on landing page
    When User login into application with username "diksha" and password "password123"
    Then Home page is populated
    And Cards are displayed "false"

  @PortalTest
  Scenario: Home page default signup with data table
    Given User is on on landing page
    When User signup into application with the following details
      | hello | world | hello@example.com | USA | 123 |
    Then Home page is populated
    And Cards are displayed "true"

  @PortalTest
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

# suppose we dont have background and also in hooks we have not given the tags , but tags are present with each scenario
# like here we have @PortalTest tag with each scenario and if we run the test hooks will be executed before and after each scenario
# then all before and after methods will be executed for each scenario (but tag should not be present in hooks)