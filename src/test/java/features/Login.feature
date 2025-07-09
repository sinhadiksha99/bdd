Feature: Application Login

  # after defining hooks we can remove background keyword as for every scenario we will write the hooks
  @WebTest @SmokeTest
  Scenario: Home page default login
    Given User is on on landing page
    When User login into application with username "hello" and password "world"
    Then Home page is populated
    And Cards are displayed "true"

  @MobileTest
  Scenario: Home page default login
    Given User is on on landing page
    When User login into application with username "diksha" and password "password123"
    Then Home page is populated
    And Cards are displayed "false"

  @MobileTest
  Scenario: Home page default signup with data table
    Given User is on on landing page
    When User signup into application with the following details
      | hello | world | hello@example.com | USA | 123 |
    Then Home page is populated
    And Cards are displayed "true"

  @WebTest
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