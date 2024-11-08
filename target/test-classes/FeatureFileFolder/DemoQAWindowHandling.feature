Feature: window handling

Scenario: handle new tab

Given I launch browser "CHROME" and navigate to the page having url "https://demoqa.com/browser-windows"

Then the title of the child window is ""

And the url of the child window is "https://demoqa.com/sample"