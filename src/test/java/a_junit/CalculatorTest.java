package a_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void test() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        Integer sum = calculator.add(2,2);

        // Assert
        Assertions.assertEquals(4, sum);
    }
}
