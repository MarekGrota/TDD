package c_params;

import a_junit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ParametrizedCsvFileSourceCalculatorTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvFileSource(resources = "/data2.csv")

    public void test(Integer a, Integer b, Integer expected) {

        Assertions.assertEquals(expected, a, b);
    }
}
