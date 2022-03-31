Feature: Login and Logout 


Scenario Outline: Login 


#Given User launches LeafTaps website 'leaftaps.com/opentaps/control/login' 
	Given User Enters User name as <username> and Password as <password> 
	And User Click on Logon Button 
	Then User lands on 'My Home' page 
	#But Username or Password is incorrect
	
	Examples: 
		|username|password|
		|'Demosalesmanager'|'crmsfa'|
		
	