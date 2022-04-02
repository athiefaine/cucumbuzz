package fizz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzbuzzStepdefs {
    private int input;
    private String obtained;

    @Given("the number {int}")
    public void the_number(int number) {
        this.input = number;
    }

    @When("we ask its Fizzbuzz")
    public void weAskItsFizzbuzz() {
        obtained = FizzBuzz.of(input);
    }

    @Then("the result is {string}")
    public void theResultIs(String result) {
        assertThat(obtained).isEqualTo(result);
    }
}
