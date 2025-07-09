Feature: Application Login

  @SmokeTest
  Scenario: Home page default login
    Given User is on on landing page
    When User login into application with username "hello" and password "world"
    Then Home page is populated
    And Cards are displayed "true"
