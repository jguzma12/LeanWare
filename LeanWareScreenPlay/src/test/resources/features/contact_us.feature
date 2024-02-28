#Autor: Juan Pablo Guzman Quintero
@feature
Feature:  The user enters and performs the contact us

  Scenario: Email wrong
    Given the user enter the page
    When the user fill wrong the inputs
      | Juan Pablo Guzman | x123 |
    Then the user should see an error message stating Enter an email address like example@mysite.com.
  Scenario: Answer wrong
    Given the user enter the page
    When the user fill wrong the inputs
      | Juan Pablo Guzman | x123@gmail.com |
    Then the user should see this error message stating Enter an answer.
