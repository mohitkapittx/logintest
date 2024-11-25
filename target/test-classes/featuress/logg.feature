@logtest
  Scenario: log in with valid data
    Given user launch chrome browser
    When user open url "https://console-uat.kapittx.com/"
    And user enter email as "Capittx024@gmail.com" and password as "Mohit@777"
    And click on log in
    Then page title should be "KapittX"
    And close browser