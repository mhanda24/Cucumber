Feature: Test the registration functionlaity

  @web2
  Scenario Outline: register the user
    Given User navigates to http://demoqa.com/registration page
    When user enters the information from "<row_index>" dataset
    Then account creates

    Examples: 
      | row_index |
      |         0 |
      |         1 |
      
      
      
  #@web
  #Scenario: register the user
   # Given User navigates to http://demoqa.com/registration page
    #When user enters the information
    			#|FirstName			|Manpreet	|
    			#|LastName				|Singh		|
    			#|PhoneNumber		|987654321|
    			#|userName				|mhanda		|
   # Then account creates