# encoding: UTF-8
# language: en

@ui
Feature: Test 2: page https://www.iana.org/domains/reserved
  Scenario: Checking all blocks from page
    Given open page https://www.iana.org/domains/reserved
    When I see title IANA — IANA-managed Reserved Domains
    Then block Headers visible
    Then block Body visible
    Then block Sidebar left visible
    Then block Main right visible
