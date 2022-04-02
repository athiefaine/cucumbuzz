Feature: FizzBuzz computation

  Scenario Outline: compute FizzBuzz with <number> displays <result>
    Given the number <number>
    When we ask its Fizzbuzz
    Then the result is <result>
    Examples:
      | number | result     |
      | 1      | "1"        |
      | 2      | "2"        |
      | 3      | "Fizz"     |
      | 6      | "Fizz"     |
      | 5      | "Buzz"     |
      | 10     | "Buzz"     |
      | 15     | "FizzBuzz" |
