Feature: Login functionality
  Background:
    Given I am the main page
    When I am in the login page

 @SmokeTest
Scenario: TC-001 Successfully login
   And Type my user and my pass for test "TC-001"
   Then The main page should be open

  Scenario: TC-002 User does not exist or invalid structure
    When I am in the login page
