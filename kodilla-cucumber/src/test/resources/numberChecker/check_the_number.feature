Feature: Check the number
  Is it Fizz, Buzz orz FizzBuzz?

  Scenario Outline: It is Fizz, Buzz, FizzBuzz or None
    Given My number is <number>
    When I ask what number it is
    Then I should get <response>
    Examples:
    | number | response |
    | 9      | "Fizz" |
    | 12     | "Fizz" |
    | 18     | "Fizz" |
    | 21     | "Fizz" |
    | 24     | "Fizz" |
    | 5      | "Buzz" |
    | 10     | "Buzz" |
    | 20     | "Buzz" |
    | 25     | "Buzz" |
    | 35     | "Buzz" |
    | 15     | "FizzBuzz" |
    | 30     | "FizzBuzz" |
    | 45     | "FizzBuzz" |
    | 60     | "FizzBuzz" |
    | 75     | "FizzBuzz" |
    | 1      | "None"     |
    | 2      | "None"     |
    | 4      | "None"     |
    | 19     | "None"     |
    | 32     | "None"     |


