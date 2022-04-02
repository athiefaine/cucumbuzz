# cucumbuzz

An implementation of FizzBuzz with Cucumber tests.

There are two versions :

- one with plain gherkin scenarios
- one with a scenario outline that is more readable

The goal of this example is to show that in some situations, the use of Cucumber is overkill. In such a simple
situation, Cucumber doesn't beat simple unit tests.

The unit test writes with one single line of code:

```java
@Test
void should_say_fizz_when_3(){
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
}
```

While with a Cucumber test, the logic of the test is spread among three methods, and requires to handle a test context (
with instance variables):

```java
private int input;
private String obtained;

@Given("the number {int}")
public void the_number(int number){
        this.input=number;
}

@When("we ask its Fizzbuzz")
public void weAskItsFizzbuzz(){
        obtained=FizzBuzz.of(input);
}

@Then("the result is {string}")
public void theResultIs(String result){
        assertThat(obtained).isEqualTo(result);
}
```

Through the use of a Scenario Outline provides concision:

```gherkin
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
```

This stays less effective than a JUnit 5 parameterized test (unless you need to provide test reports to the domain experts):

```java
@ParameterizedTest(name = "FizzBuzz of {0} should be {1}")
@CsvSource({
       "1, 1",
       "2, 2",
       "3, Fizz",
       "6, Fizz",
       "5, Buzz",
       "10, Buzz",
       "15, FizzBuzz"
})
void fizzbuzz_should_be(int input, String result) {
    assertThat(FizzBuzz.of(input)).isEqualTo(result);
}
   ```

So, while using Cucumber comes with an additional cost, you should think about writing Gherkin scenarios and automating them when you have a real business complexity to describe.