@Regression




Feature: Pricing Enlisting page

  Scenario: First Session Login
    Given User lunch browser and direct to Inventory Health
    When User enter valid credentials
    Then User session is saved


  Scenario:Check viewing pricing Enlisting skus
    Given User Select the idp

   ## When User checking the pricing tab


  Scenario: Check listed skus
    Given User direct to Invetnory Health
    When User Direct to pricing
    #Then He can view the skus