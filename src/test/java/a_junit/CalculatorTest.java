package a_junit;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    private static void beforeAll() {

        System.out.println("BEFORE ALL.");
    }

    @AfterAll
    private static void afterAll() {

        System.out.println("AFTER ALL.");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("BEFORE EACH.");
        calculator = new Calculator();
    }

    @AfterEach
    public void afterEach() {
        System.out.println("AFTER EACH.");
    }

    @Test
    //@Disabled
    public void add_2Plus2_shouldBeEqualTo4() {

        // Act
        Integer sum = calculator.add(2, 2);

        // Assert
        Assertions.assertEquals(4, sum);
    }

    @Test
    public void subtraction_2Minus2_shouldBeEqualTo0() {

        // Act
        Integer sub = calculator.subtraction(2, 2);

        // Assert
        Assertions.assertEquals(0, sub);
    }

    @Test
    public void multiplication_2times2_shouldBeEqualTo4() {

        // Act
        Integer multi = calculator.multiplication(2, 2);

        // Assert
        Assertions.assertEquals(4, multi);
    }

    @Test
    public void division_2divide2_shouldBeEqualTo1() {

        // Act
        Integer div = calculator.division(2, 2);

        // Assert
        Assertions.assertEquals(1, div);
    }
}
