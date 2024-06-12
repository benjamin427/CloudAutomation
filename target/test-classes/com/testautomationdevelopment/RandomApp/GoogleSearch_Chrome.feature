@ChromeBrowser
Feature: Google search engine with Chrome

  Scenario: User should search a word
  Given Website url using Chrome 
  Then Enter a word in the text field
  And Click the search button
  Then Close browser