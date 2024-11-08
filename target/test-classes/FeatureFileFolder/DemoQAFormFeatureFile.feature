Feature: Test Demo QA Form Page

Scenario Outline:utline: Enter details in field on demo qa page

#Given I launch browser "CHROME" and navigate to the page having url "https://demoqa.com/automation-practice-form"

When I enter the first name value as "<firstname>"
And I enter the last name value as "<lastname>"
And I enter the email address as "<email>"
And I select 'male' radio button

Examples:

|firstname|lastname|email|
|Poonam|chavan|poonam@mail.com|
|Sagar|Nikam|sagar@mail.com|


