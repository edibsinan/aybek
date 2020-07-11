@login
Feature: Login feature

  Scenario Outline: Negative Scenerio. Login with wrong creadential
    Given User on the homepage schwab.com
    Then User "<tabAccount>" logs is wrong loginID

    Examples:
      | tabAccount      |
      | Account Summary |
      | Position        |
      | Order History   |