Feature: Login OHRM and search admin

Scenario: Login OHRM

Given I launch browser "CHROME" and navigate to the page having url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When I enter username as "Admin" in username field 
And I enter password as "admin123" in password field
And I click the button Login
Then I can see dashboard page on successfull login

Scenario: Search for admin record

When I click on admin tab in left panel
And I enter "admin" in search username field
And I select "Admin"  in user role dropdown 
And I click on button search 
Then I have message "(1) Record Found"
