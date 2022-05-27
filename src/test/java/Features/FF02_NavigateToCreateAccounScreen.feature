Feature:CreateAcccount page
  @RegressionTest
  Scenario: Navigate to create Account Screen
    Given Open Browser
    And Enter url and press <Enter> to Navigate to Home page of GGWebsite
    And click on UserAccountIcon and navigate to Sign In or Create an Account screen
    Then Click on Create Account Button
    And Assert on Create an Account screen