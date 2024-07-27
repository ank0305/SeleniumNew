Feature: Login functionality of Opencart Website

Background:
  Given I am on the Opencart Website


  Scenario: Successful Login to Opencart Website

    Given I have entered valid username and password
    When I click on login button
    Then I should be able to login successfully