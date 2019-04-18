Feature: validate login feature
Background:
Given open browser
|chrome|
|firefox|
And go to url

@smoke
Scenario: valid credantial

When user type userid and password
And user click signin button
Then user will able to see his profile page

@Reg
Scenario Outline: invalid credantial

When user type "<userid>" and "<password>"
And user click signin button
Then user will able to see his profile page

Examples: 
|userid|password|
|user1|1234|
|user2|3456|
