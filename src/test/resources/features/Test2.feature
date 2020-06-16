#language: en
Feature: Test 2: page https://www.iana.org/domains/reserved
  Scenario: Checking all blocks from page
    Given opened page "https://www.iana.org/domains/reserved"
    Then block "Pages" has been loaded
    Then waiting for the element named "title" to disappear
    When element named "header" is visible
    When element named "body" is visible
    When element named "main right" is visible
    When element named "sidebar left" is visible
    Then element named "title" is not visible
    And element named "title" contains inner text "IANA — IANA-managed Reserved Domains"

    When block "SidebarLeft" has been loaded
    Then pressed button named "Overview"
      When page has been refreshed
    Then pressed button named "Root Zone Management"
      When page has been refreshed
    Then pressed button named ".INT Registry"
      When page has been refreshed
    Then pressed button named ".ARPA Registry"
      When page has been refreshed
    Then pressed button named "IDN Practices Repository"
      When page has been refreshed
    Then pressed button named "Root Key Signing Key (DNSSEC)"
      When page has been refreshed
    Then pressed button named "Reserved Domains"
