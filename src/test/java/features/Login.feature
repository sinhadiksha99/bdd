Feature: Application Login

Scenario: Home page default login
Given User is on on landing page
When user login into application with username and passoword
Then Home page is populated
And Cards are displayed