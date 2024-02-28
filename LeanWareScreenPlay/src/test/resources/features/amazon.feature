#Autor: Juan Pablo Guzman Quintero
@feature
Feature:  The user enters and change the language

  Scenario: The user change the language
    Given the user enter to the page
    When the user change the language
    Then the user should see the page in spanish
