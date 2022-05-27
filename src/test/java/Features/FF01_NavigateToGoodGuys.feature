Feature:GG HomePage
@SmokeTest
  Scenario:Navigat To GG HomePage
    Given Open Browser
    And Enter url and press <Enter> to Navigate to Home page of GGWebsite
    Then Assert on GG HomePage
