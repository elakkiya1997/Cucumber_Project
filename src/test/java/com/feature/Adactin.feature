Feature: Checking the Hotel booking functionality in Adactin Application

Scenario Outline: Login functionality
Given user Must Launch The Url
When user Must Enter The "<Username>" In The Username Field
And user Must Enter The "<Password>" In The Password Field
Then user Click The Login Button And Navigates To Search Hotel Page

Examples:
|Username|Password|
|xyz|123|
|elakkiyav|K5597X|


Scenario: Search Hotel Functionality
When user Must Select The "1" In Location Field
And user Must Select The "Hotel Hervey" In Hotel Field
And user Must Select The "Standard" In Room Field
And user Must Select The "1" In Number Of Rooms Field
And user Must Enter The Date In Check In Date Field
And user Must Enter The Date In Check Out Date Field  
And user Must Select the "1" In Adults Per Room Field
And user Must Select the "1" In Children Per Room Field
Then user Click the search Button And Navigates to Select Hotel Page


Scenario: Select Hotel Functionality
When user Must Click The Radio Button Under Select Field
Then user Click The Continue Button And Navigates To Book A Hotel Page


Scenario: Book A Hotel Functionality
When user Must Enter The First Name In First Name Field
And user Must Enter The Last Name In Last Name Field
And user Must Enter The Billing Address In Billing Address Field
And user Must Enter The Credit Card No In Credit Card No Field
And user Must Select The Credit Card Type In Credit Card Type Field
And user Must Select The Expiry Date In Expiry Date Field
And user Must Enter The CVV Number In CVV Number Field
Then user Click The Book Now Button And Navigates To Logout Page


Scenario: Logout Functionality
Then user Click The Logout Button And Navigates to Logged Out Page

















