Feature: Cash Withdrawal
  Scenario Outline: : Withdrawal from a wallet in credit
    Given I have deposited $<wallet> in my wallet
    When I request $<amount>
    Then $<money> should be dispensed
    And the balance of my wallet should be $<balance>
    Examples:
    | wallet | amount | money | balance |
    | 200    | 30     | 30    | 170     |
    | 200    | 250    | 200   | 0       |
    | 200    | 200    | 200   | 0       |
    | 0      | 100    | 0     | 0       |
