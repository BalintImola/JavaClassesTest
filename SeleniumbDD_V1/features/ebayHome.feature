Feature:EbayHome page scenarios we will be testing some functionalites on the Ebay home page
  @P1
  Scenario: Advance search link
    Given I am on Ebay home page
    When  I click on Advance link
    Then  I navigate to the advance home page

  @P2
  Scenario: Search items count

    Given I am on Ebay home page
    When I search for 'Iphone 11'
    Then I have at least 1000 search items returned

  @P24
  Scenario: Ebay Logo on Advanced Search Page

    Given I am on Ebay Advanced Search Page
    When I click on Ebay Logo
    Then I am navigated to Ebay homepage