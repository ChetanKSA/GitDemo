
Feature: Application Login

	Background: 
  <!--Given setup entries in DB - replaced by "Before" in hooks class -->
	When user wnat to launch browser from config variables
	Then enter url of the website


  
  @Regression @Netbank
  Scenario: User Page Login	
  
  Given User is on NetBank Landing page
  When User login to application with username "test" and password "4321"
  Then Home Page is displayed
  And Cards info are displayed
  
  
  @smoke @Regression @Mortgage
  Scenario Outline: Page Login	
  
  Given User is on NetBank Landing page
  When User login to application with username <Username> and password <Password> combination
  Then Home Page is displayed
  And Cards info are displayed
  
  Examples: 
  
  | Username | Password |
  | ramesh	 | test123  |
  | mahesh	 | test234	|
  | umesh		 | test345	|
  | 11223		 | 887766   |
  

