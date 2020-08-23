package c_params;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class ArgumentSourceTest {

    @ParameterizedTest(name = "[{index}] {0} -> {1})")
    @ArgumentsSource(MyProvider.class)
    public void test(Integer i, boolean isEven) {
        Assertions.assertEquals(isEven, i % 2 == 0);

    }
}
