

Feature: Busqueda en Google
  

  
  Scenario: Buscar Facebook
    Given I have opened the browser 
    And go to google
    When I type Facebook
    And hits Enter
    Then I click in Facebook page
   

  
