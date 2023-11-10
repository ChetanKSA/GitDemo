
Feature: Application Login

	Background: 
	Given setup entries in DB
	When user wnat to launch browser from config variables
	Then enter url of the website


	@Regression
  Scenario: Admin Page Default Login	
  
  Given User is on NetBank Landing page
  When User login to application with username "admin" and password "1234"
  Then Home Page is displayed
  And Cards info are displayed
  
  @Regression
  Scenario: User Page Login	
  
  Given User is on NetBank Landing page
  When User login to application with username "test" and password "4321"
  Then Home Page is displayed
  And Cards info are displayed
  
  
  @smoke @Regression
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
  
 @smoke
  Scenario: Page SignUp	
  
  Given User is on SignUp Landing page
  When User enter details to sign up application 
  | chetan shet | 
  | test@gmail.com |
  | test@123 |
  Then click on Signup
  And Home Page is displayed
