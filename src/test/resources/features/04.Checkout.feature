Feature: Checkout product
  Scenario: checkout product with valid data
    Given Have one or more product in cart page
    When Click button checkout
    And type firstname
    And type lastname
    And type postal code
    And click button continue
    And click button finish
    Then should be display message thanks for your order