Feature: Feature for test

Background:
Given Google search engine is open

@regression
@tag1
Scenario: Scenario1
When User search cars
Then User navigated to serach result page
    
@regression
@tag2
Scenario: Scenario2
When User click on news tab
Then User navigated to news portal