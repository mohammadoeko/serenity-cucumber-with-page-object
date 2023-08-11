@login
Feature: Login Saucedemo
  Scenario: Login with valid credentials
    Given open web saucedemo
    When enter username
    And enter password
    And Click Login
    Then should be display dashboard
