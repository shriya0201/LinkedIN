Feature: Hello

Background: login into LinkedIn
		Given user is on LinkedIn homepage
		When user enters their email and password
		And User clicks on th Sign-in button
		Then user should be successfully logged into LinkedIn

Scenario: I want to check the number of jobs i have applied
    Given I am on the Homepage and I will be able to see My Items
    When I will click My Items
    Then I will be re-directed to My Jobs and i will be able to see number of jobs i have applied so far
 
Scenario: searching a role
		Given I am on homepage
		When i want to search a particular role
		Then I will search about analyst_role and click on enter

Scenario: Followers count and list
		Given I will click on profile hyperlink
		When I will redirect to a page
		Then I will click on the followers

Scenario: I want to see the latest posts
		Given i have to click on sort by
		When i click on Recent
		Then i will be able to see the recent posts

Scenario: Finding a connection through search
		Given I have to search a connection
		When i enter name on search bar
		Then i will be able to see all the connections with that name
 
 