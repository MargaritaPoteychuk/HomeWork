Feature: Test login page

  Scenario: Test sending group message
    Given I am in Inbox
    When I take 1st screenshot
    When I am in send window
    When I filled in all the info
    When I press send
    Then I compare 4 screenshots

