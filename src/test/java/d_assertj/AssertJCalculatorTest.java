package d_assertj;

import b_exceptions.ExceptionsCalculator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class AssertJCalculatorTest {

    ExceptionsCalculator exceptionsCalculator = new ExceptionsCalculator();


    @Test
    public void testDivide() {

        Assertions.assertThat(exceptionsCalculator.divide(10,5))
                .isEqualTo(2);

    }

    @Test
    public void testDivide2() {

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() ->
                    exceptionsCalculator.divide(1,0))
                    .withMessage("do not divide by 0");
                }

    }


