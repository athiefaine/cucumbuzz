Feature: compute FizzBuzz

  Scenario: compute FizzBuzz for a number without multiples (example for 1)
    Given the number 1
    When we ask its Fizzbuzz
    Then the result is "1"

  Scenario: compute FizzBuzz for a number without multiples (example for 2)
    Given the number 2
    When we ask its Fizzbuzz
    Then the result is "2"

  Scenario: compute FizzBuzz with a multiple of 3 (example for 3)
    Given the number 3
    When we ask its Fizzbuzz
    Then the result is "Fizz"

  Scenario: compute FizzBuzz with a multiple of 3 (example for 6)
    Given the number 6
    When we ask its Fizzbuzz
    Then the result is "Fizz"

  Scenario: compute FizzBuzz with a multiple of 5 (example for 5)
    Given the number 5
    When we ask its Fizzbuzz
    Then the result is "Buzz"

  Scenario: compute FizzBuzz with a multiple of 5 (example for 10)
    Given the number 10
    When we ask its Fizzbuzz
    Then the result is "Buzz"

  Scenario: compute FizzBuzz with a multiple of 15 (example for 15)
    Given the number 15
    When we ask its Fizzbuzz
    Then the result is "FizzBuzz"