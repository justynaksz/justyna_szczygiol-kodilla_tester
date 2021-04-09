Feature: Cash Withdrawal
  Scenario Outline: : Withdrawal from a wallet in credit
    Given I have deposited $<wallet> in my wallet
    When I request $<amount>
    Then $<money> should be dispensed
    Examples:
    | wallet | amount | money |
    | 200    | 30     | 30    |
    | 200    | 250    | 200   |
    | 200    | 200    | 200   |
    | 0      | 100    | 0     |
