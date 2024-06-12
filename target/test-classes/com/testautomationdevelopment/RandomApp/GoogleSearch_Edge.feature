@EdgeBrowser
Feature: Google search engine with Edge

  Scenario: User should perform a search using random word
  Given Navigate to the website url using Edge browser
  Then Enter a random word in the text field
  And Click the google search button
  Then Close Edge browser