Feature: Display balance
  Scenario: User checks the balance of their wallet
    Given there is $100 in my wallet
    When I check the balance of my wallet
    Then I should see that the balance is $100

  Scenario: User sees the balance after depositing
    Given there is $200 in my wallet
    When I want to deposit $50 in my wallet
    Then $250 should be in my wallet
    And I should see the balance is $250

  Scenario: User sees the balance after withdrawal
    Given there is $500 in my wallet
    When I request $100
    Then $100 should be dispensed
    And I should see that the balance is $400