Feature: Complete registration process

  @Staging
  Scenario: Allow user through staging gateway
    Given User navigates to staging environment
    When User inserts username "rankgroup-frontendqa"
    When User inserts passwords "PZihHeDz"
    Then User is signed into staging gateway

  @NewRegistrationStep1
  Scenario: Stepone: Register as a new user
    Given User is on stepone registration page
    When User selects radio button "Yes"
    When User inserts email address "fdfdg@werwe.com"
      When "t&c" checkbox is selected
    When User clicks cta "Next"
    Then User is taken to steptwo registration process

  Scenario Outline: Steptwo: Fill in un-pw for registration
    Given user fills "<field>"  with "<input>"
    When user clicks "<title>" from radio buttons
    Then user successfully registers

    Examples: 
      | field          | input         | title            |
      | username       | stain         | joinnow-title-mr |
      | password       | WERwer123%^&  | joinnow-title-mr |
      | firstname      | stained       | joinnow-title-mr |
      | surname        | marketbitch   | joinnow-title-mr |
      | dob            |      11111980 | joinnow-title-mr |
      | addresslineone | 123 test road | joinnow-title-mr |
      | addresslinetwo | testing       | joinnow-title-mr |
      | town-city      | towntest      | joinnow-title-mr |
      | county         | countytest    | joinnow-title-mr |
      | postcode       | e13nu         | joinnow-title-mr |
      | mobile         | mobilenumber  | joinnow-title-mr |

  Scenario Outline: Steptwo: User will not setup a deposit
    Given user clicks "<deposit>" to set up a deposit
    When user "<checks>" optIn checkboxs
    When user clicks Register cta
    Then user is taken to stepthree registration process

    Examples: 
      | deposit            | checks         |
      | joinnow-deposit-no | joinnow-offers |
