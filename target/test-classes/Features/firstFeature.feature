

Feature: This will Test Landing Page Properties
  I want to use this template for my feature file

  @tag1
  Scenario: This Scenario will execute to see current Landing Page
    Given I Open A Browser
    And I go to Google
    When I Input Text
    And some other action
    And yet another action
    Then I validate the outcomes
   

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
