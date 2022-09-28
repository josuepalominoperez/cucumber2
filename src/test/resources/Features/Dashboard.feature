#Ver todas las clases y archivos con el nombre Dashboard
#No funciona en su totalidad debido a los anuncios en la pagina
#pero los pasos son los correctos ya que levanta el ambiente y hace un login correcto
#puede agregarse un TestRunner personalizado
#con esto podemos verificar que la estructura Background es correcta
Feature: Clicking Dashboard options

  Background: Login
    Given I go to the login page
    When I type username and password
    And I click login button
    Then I should be logged in

  Scenario: Verifying successful login
    And I verify successful login
   

  Scenario: Clicking bookstore data
    And I click Bookstore data button
    Then I visualize all books
