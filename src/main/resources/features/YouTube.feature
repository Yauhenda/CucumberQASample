Feature: YouTube video check

  @Test1 @JIRATestKey(EPMFARMATS-2975)
  Scenario: Failed check Epam title on main youtube page
    Given I am on page with url 'https://www.youtube.com/'
    Then I should see 'EPAM Systems Global' in list video
