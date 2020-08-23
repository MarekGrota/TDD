package c_params;

import a_junit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParametrizedMethodSourceCalculatorTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @MethodSource("data")
    public void test(Integer a, Integer b, Integer expected) {
        Assertions.assertEquals(expected,calculator.add(a, b));
    }

    static public Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(2,3,5),
                Arguments.of(6,3,9)
        );

    }
}
