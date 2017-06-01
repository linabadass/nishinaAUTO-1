Feature: Registration process

  @ChooseBrowser
  Scenario: Allow user to choose which browser the test runs through
    Given User is prompted to enter a corresponding number for browser
    Then The WebDriver is set for the chosen browser for test to run on

  @StagingEnvironment
  Scenario Outline: Allow user through the staging gateway
    Given I navigate to login page of staging environment
    When User given loginChoice YES or NO
    When If YES or NO User fills in their email address "<email>"
    Then If YES User clicks Next button and is taken to StepOne of registration page
    Then If NO user fills in password to login

    Examples: 
      | email             |
      | linatest@test.com |

  #@Dropdown_Fields
  #Scenario Outline: Allow user to populate all dropdown menus with options
  #Given User populates personal data on basic-registration page
  #Then User selects from "<dropdown>" menu a valid "<option_value>"
  #
  #Examples:
  #| dropdown    | option_value |
  #| Title-id    | Mr           |
  #| Security_id | answer       |
  #| country_id  | country      |
  @Textfields_Fields
  Scenario Outline: Allow user to populate all textbox fields with correct data
    Given User populates relevant textbox "<textbox_name>" with their personal data "<personal_data>"
    Then User can proceed to Membership Options

    Examples: 
      | textbox_name              | personal_data     |
      | joinnow-username          | linatest@test.com |
      | joinnow-password          | werWER123!        |
      | joinnow-firstname         | Testuser          |
      | joinnow-surname           | tester            |
      | joinnow-day               |          21101980 |
      | joinnow-address-line1     | 123 Fake street   |
      | joinnow-address-line2     | Madeup road       |
      | joinnow-address-town-city | Nowhere land      |
      | joinnow-address-county    | Makebelieve       |
      | joinnow-address-postcode  | FA11KE            |
      | joinnow-mobile            |         123456789 |
  #@Radiobutton_Fields
  #Scenario Outline: Allow user to select radio buttons
    #Given User populates personal data on basic-registration page
    #When User has a choice of radio buttons "<radioButton>" ID to choose from
    #Then User can proceed to Membership Options
#
    #Examples: 
      #| radioButton |
      #| Title-id    |
      #| Security_id |
      #| country_id  |
