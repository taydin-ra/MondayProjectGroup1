Feature: Creating Positions

  Scenario Outline:Positions creating
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on human resources on top
    And Click on setup
    And Click on positions
    And Click on plus icon
    And Type in new positions names "<positionsNames>"
    And Type in shortnames"<psn>"
    When Click on save button
    Then "<positionsNames>" should be displayed
    And Remove the data "<positionsNames>"
    Then Verify data is removed "<positionsNames>"

    Examples:
      | positionsNames | psn  |
      | name1          | shn1 |
      | name2          | shn2 |
      | name3          | shn3 |



