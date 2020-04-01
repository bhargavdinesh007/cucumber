#Author: your.email@your.domain.com
Feature: Login to fb site
  login process to fb webshop site
  
  Scenario: successful login to fb 
  
	Given user launched chrome browser
	And user provides the valid url
	And user clicks on login hyperlink
	When user provides valid Email and Password
	And he clicks on Login button
	Then user shall be able to view the homepage