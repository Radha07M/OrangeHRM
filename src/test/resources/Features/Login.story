Feature:Login to Orange HRM Application

Narrative: Login to Orange HRM 
@Login

Scenario: Login to HRM with valid credentials
Meta:
@sanity

Given User launch browser with HRM application
When User enters Username
And User enters password
And User clicks on Login button
Then verify page title <title> of HRM application

Examples:
|title|
|Dashboard|

Scenario: Login to HRM with invalid credentials and verify error messages
Meta:
@regression

Given User launch browser with HRM application
When User enters Username <username>
And User enters password <password>
And User clicks on Login button
Then verify login error message <errorMsg>

Examples:
|username |password |errorMsg            |
|name1    |Test123  |Invalid credentials |

