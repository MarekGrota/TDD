package c_params;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSorceTest {

    @ParameterizedTest
    @CsvSource({"test,TEST", "Java,JAVA"})
    public void test(String input, String expected) {

        Assertions.assertEquals(expected, input.toUpperCase());
    }
}
