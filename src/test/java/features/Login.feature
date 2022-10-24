Feature: Application login
Scenario: Home Page login
Given User is on landing page
When User login to applicaton with username and password
Then Home page is populated
And Homepage displayed