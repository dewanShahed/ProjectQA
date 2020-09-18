  @HomePageTest
Feature: HomePage
  
  I want to validate channel,create channel,destroy channel,post a text and validate.

  Scenario Outline: I want to validate existence of channel ,create channel,created channel validate,delete channel,deleted
    channel validate .also i want post a text and validate.

    Given I want validate existing channel
    When create a channel <channel> in homePage
    Then I verify the <channelName> in channels

    Examples: 
      | userName                 | passWord         | status         | channel    | channelName | post |
      | "dewan_shahed@yahoo.com" | "Bangladesh2020" | "dewan_shahed" | "stardust" | "stardust"  | "Hi" |
