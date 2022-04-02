package fizz;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void should_say_1_when_1() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
    }

    @Test
    void should_say_2_when_2() {
        assertThat(FizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    void should_say_fizz_when_3() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
    }

    @Test
    void should_say_fizz_when_6() {
        assertThat(FizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    void should_say_buzz_when_5() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
    }

    @Test
    void should_say_buzz_when_10() {
        assertThat(FizzBuzz.of(10)).isEqualTo("Buzz");
    }

    @Test
    void should_say_fizzbuzz_when_15() {
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }
}
