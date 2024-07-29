Feature: To validate API response using RESTASSURED

Scenario Outline: Test Rest API (TC-04)


    Given when user pings the base URL
    Then status code is 200

    Examples:
      | status code |
      | 200         |
