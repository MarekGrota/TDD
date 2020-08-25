package g_tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    public void fibonacci_whenPassing0_shouldReturn0() {
        Fibonacci fibonacci = new Fibonacci();
        int fNumber = fibonacci.fibonacciNumber(0);

        Assertions.assertEquals(0,fNumber);

    }

    @Test
    public void fibonacci_whenPassing1_shouldReturn1() {
        Fibonacci fibonacci = new Fibonacci();
        int fNumber = fibonacci.fibonacciNumber(1);

        Assertions.assertEquals(1,fNumber);

    }

    @Test
    public void fibonacci_whenPassing2_shouldReturn1() {
        Fibonacci fibonacci = new Fibonacci();
        int fNumber = fibonacci.fibonacciNumber(3);

        Assertions.assertEquals(2   ,fNumber);

    }

    @Test
    public void fibonacci_whenPassing15_shouldReturn610() {
        Fibonacci fibonacci = new Fibonacci();
        int fNumber = fibonacci.fibonacciNumber(15);

        Assertions.assertEquals(610 ,fNumber);

    }

}
