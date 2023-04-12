@supplySync
Feature: SupplySync company


  Scenario: Verify Company edit functionality
    Given user is on SupplySync application
    Then user enters credentials "codewise@gmail.com" and "123456" and clicks login in SupplySync
    When user clicks on three dot
    Then user clicks on Edit button in SupplySync
    Then user can edit company information
    And user should see "Company successfully changed" message


