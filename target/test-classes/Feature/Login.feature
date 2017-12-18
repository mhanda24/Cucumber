@Feature
Feature: Test the Login functionality of the demosite
  I want to test the login functionlaity of the demo site with valid and invalid login credentials

	Background:
		Given User navigates to http://store.demoqa.com page
    When User clicks on MyAccount link

  @FirstTest
  Scenario Outline: Test Login with valid user name and password
    And User enters username as <user> and password as <password>
    Then Login Successfull

    Examples: 
      | user          | password        				 |
      | LearnCucumber | VGVzdFBhc3N3b3JkMTIzQA== |
      |	Test					|	VGVzdA==								 |

      
   