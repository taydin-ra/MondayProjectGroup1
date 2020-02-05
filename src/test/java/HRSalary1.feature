Feature: Creating Position Salary

  Scenario: Position creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on human resources on top
    And Click on setup

    And Click on position salary
    And Click on plus icon
    And Type in new positions salary "abcdefgh"

    When Click on save button
    Then "abcdefgh" should be displayed
    Then Remove the data "abcdefgh"
    Then Verify data is removed "abcdefgh"
    

