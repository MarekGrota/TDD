package c_params;

import a_junit.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class ParametrizedArgumentsSourceCalculatorTest  {
    Calculator calculator = new Calculator();

    @ParameterizedTest
    @ArgumentsSource(MyProvider2.class)
    public void test(Integer a, Integer b, Integer expected) {
        Assertions.assertEquals(expected,calculator.add(a, b));
    }
}
