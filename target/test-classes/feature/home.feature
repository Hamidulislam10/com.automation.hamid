#Author: hamidulislam011998@gmail.com

@tag
Feature: Dynamic HTML table
  @tag1
  Scenario: Verify HTML data table entry 
    Given user launch the URL
    And  user click on table data
    And  user update the input text box with new data
    And  user click on refresh table button
    Then data table is update as per expectation
    