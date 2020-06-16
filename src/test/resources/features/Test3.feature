#language: en
Feature: Test 3: test api link https://reqres.in/api/products/3
  @api
  Scenario: test call and check response
    Given GET request to URL "https://reqres.in/api/products/3" has been executed. Expected response code: 200

  @api
  Scenario: test call and check schema JSON
    Given GET request to URL "https://reqres.in/api/products/3" has been executed.
    Then Check JSON schema current response