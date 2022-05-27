Feature:CreateAcccount
  Scenario: create Account with valid data
    Given Navigate to Create an Account screen
    When user enters all valid Personal Details and click on Registernow button
    Then User should able to see message as account is created