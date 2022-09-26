#En este feature y sus relacionados agregaré tags and hooks
@smoke
Feature: Búsqueda en google

  Scenario: Buscar facebook
    Given I open the browser
    When I go to Google
    And I type Facebook
    And I hits Enter
    Then I verify the login page
