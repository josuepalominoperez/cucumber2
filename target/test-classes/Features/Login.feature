Feature: Bookstore Login

  Scenario Outline: Successful login bookstore
    Given I open the browser
    When I got to DemoQAWebLoginPage
    And I enter <username> and <password>
    And I clic Login button
    Then I verify the successful login

    Examples: 
      | username | password    |
      | aa       | 00000000Aa@ |
      | bb       | 11111111Bb@ |

      