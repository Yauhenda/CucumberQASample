Feature: YouTube video check

  @JIRATestKey(EPMRDBY-1101)
  Scenario: Passed check Epam video on youtube channel
    Given I am on page with url 'https://www.youtube.com/watch?v=UKKYpdWPSL8'
    Then I should see author name 'EPAM Systems Global'

  @Test1 @JIRATestKey(EPMRDBY-1105)
  Scenario: Failed check Epam title on main youtube page
    Given I am on page with url 'https://www.youtube.com/'
    Then I should see 'EPAM Systems Global' in list video

  @Test2 @Test1 @JIRATestKey(EPMRDBY-1107)
  Scenario: Passed check Epam youtube channel
    Given I am on page with url 'https://www.youtube.com/channel/UCAMBuFovq-_A47Z-MNMenVg'
    Then I should see channel title 'EPAM Systems Global'