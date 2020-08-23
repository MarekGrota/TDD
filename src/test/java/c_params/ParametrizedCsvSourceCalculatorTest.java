package c_params;

import a_junit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParametrizedCsvSourceCalculatorTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({"2,2,4","5,2,7"})
    public void test(Integer a, Integer b, Integer expected) {

        Assertions.assertEquals(expected,calculator.add(a, b));
    }
}
