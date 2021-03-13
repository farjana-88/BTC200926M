Feature: login validation

BackGround : 
Given open browser
|chorme|
|firefox|
|ie|
And nevigate to url 
@smoke
Scenario: as a user using valid creadatial should be logged in 

When User type user id in usertext box
And user type password in password box
And user click on login button
Then user should be in his profile page
@regression
Scenario Outline: as a user using valid creadatial should not be logged in 

When User type "<user id>" in usertext box
And user type "<password>" in password box
And user click on login button
Then user should not  be in his profile page

Examples: 
|user id|password|
|user1| 12345|
|user2|5648|


Scenario: Successful Login with Valid Credentials
 Given User is on Home Page
 When User Navigate to LogIn Page
 And User enters Credentials to LogIn
    | testuser_1 | Test@153 |
 Then Message displayed Login Successfully