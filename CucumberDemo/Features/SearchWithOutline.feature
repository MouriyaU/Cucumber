#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Hotel App Search Page
    This feature is for testing the login and search fucntionality of the hotel app
  
  Scenario Outline: Search results displayed on filling required values
    Given The user is on the login page
    When User enters "<username>", "<password>"
    And User clicks on the login button
    And Login is successful
    And Search page is displayed
    And User selects "<location>", "<roomno>", "<checkin>", "<checkout>", "<adults>"
    And User clicks on search button
    Then Search results should be displayed
    
   
       
    Examples: 
      | username | password | location| roomno | checkin  |checkout| adults |
      | TPillai567 | P1L618 | Sydney | 1 - One| 23/01/2023 | 30/01/2023 | 2 - Two |
      | vasuvespag | vasu1234 | Melbourne | 2 - Two| 23/01/2023 | 29/01/2023 | 1 - One |
      
      
      
      
  
    
