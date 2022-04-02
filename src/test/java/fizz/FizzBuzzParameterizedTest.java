package fizz;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzParameterizedTest {

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
}
