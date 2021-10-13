Feature: Automation Testing of uniform website

  Background: login page
    Given User is on Uniform Application
    When User enter Username "admin" and Password "admin@123"
    And click on Login button
    Then User navigate to the Dashboard

  @naviagate_to_Dashboard
  Scenario: User go to Customers
    Given User click on Customers icon
    When User click on Cutomers option

  @add_customers
  Scenario Outline: Add Customers
    Given User click on Customers icon
    When User click on Cutomers option
    Then User click on Add symbol
    When User enter "<First Name>","<Last Name>","<E-Mail>","<Telephone>","<Password>","<Confirm>"
    And User will save the details
    Then User will go to dashboard

    Examples: 
      | First Name | Last Name | E-Mail           | Telephone  | Password     | Cofirm       |
      | rmk        | kamala    | kamala@gmail.com | 9492862376 | vasavich1nn@ | vasavich1nn@ |

  @search_by_Customer
  Scenario Outline: Seach by name
    Given User click on Customers icon
    When User click on Cutomers option
    When User enters the "<Customer Name>" to search
    And User click on filter button

    Examples: 
      | Customer Name |
      | kamala        |

  @Edit_details
  Scenario Outline: Edit details
    Given User click on Customers icon
    When User click on Cutomers option
    When User enters the "<Customer Name>","<E-Mail>" to search
    And User click on filter button
    Then User click on Check box
    And click on edit option
    And user enter the "<Phone Number>" to edit
    And User save the details
    And User will go to dashboard

    Examples: 
      | Customer Name | E-Mail            | Phone Number |
      | pranathi      | pranathi4567@.com |   9492862376 |

  @Delete_Customer
  Scenario Outline: Delete by name
    Given User click on Customers icon
    When User click on Cutomers option
    When User enters the "<Customer Name>","<E-Mail>" to delete
    And User click on filter button to delete
    Then User click on Check box to select
    And User click on Delete button
    And User click OK to the dialogue box
    And User will go to dashboard

    Examples: 
      | Customer Name | E-Mail                 |
      | pranathi      | pranathi9876@gmail.com |

  @navigate_to_Dashboard
  Scenario Outline: User go to Customers Group
    Given User click on Customers icon
    When User click on the Cutomers Group option

  @add_CustomerGroup
  Scenario Outline: add Customer Group
    Given User click on Customers icon
    When User click on the Cutomers Group option
    When User click on Add Symbol
    And User Enter "<Customer Group Name>"
    And User will save the  details
    Then User will go to dashboard

    Examples: 
      | Customer Group Name |
      | kamala              |

  @navigate_to_Dashboard
  Scenario Outline: User go to Customers Field
    Given User click on Customers icon
    When User click on the Cutomers Field option

  @add_CustomerField
  Scenario Outline: add Customer Field
    Given User click on Customers icon
    When User click on the Cutomers Field option
    When User click on Add Symbol
    And User enter "<Customer Field Name>"
    And User click on add custom field
    And User enter "<Cutomer Field value Name>", "<Sort Order>"
    And click on save button
    Then User will navigate go to Dashboard

    Examples: 
      | Customer Field Name | Customer Field value Name | Sort Order |
      | vyshu               | Vyshnavi                  |        100 |
