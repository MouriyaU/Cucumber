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


@tag
Feature: HotelApp Login Feature
  This feature is for testing the login fucntionality of the hotel app

  Scenario: Successful login with valid credentials as PARAMETERS
    Given The user is on the login page
    When User enters "TPillai567", "P1L618"
    And User clicks on the login button
    Then Login is successful
    And Search page is displayed
    
    
    
    
    
    
    
    
    
    
