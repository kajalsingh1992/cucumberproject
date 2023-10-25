#Author--Kajal Singh
Feature: This is my Orange HRM Website
  I want to use this template for my feature file

@regressiontest
  Scenario: Login scenario
    Given browserInitilized
    When enterLoginDetails
    Then loginVerified

@smoketest
  Scenario Outline: Login using perameterization
    Given Open the Url
    When Enter the <username> and <password>
    And User click on Login button
    Then User able to open the home page

    Examples: 
      | username | password  |
      | Admin    | admin123  |
    #  | Admin1   | admin1234 |
    #  | Admin2   | admin1235 |
