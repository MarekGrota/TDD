package f_mockito;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.anyInt;

public class MockitoTest {

    @Test
    public void test() {
        List mockedlist = Mockito.mock(List.class);

        mockedlist.add("One");
        mockedlist.clear();

        Mockito.verify(mockedlist).add("One");
    }

    @Test
    public void test2() {

        List mockedList = Mockito.mock(List.class);

        Mockito.when(mockedList.size()).thenReturn(200);

        System.out.println(mockedList.size());
        System.out.println(mockedList.size());
    }

    @Test
    public void test3() {

        List mockedList = Mockito.mock(List.class);

        Mockito.when(mockedList.size())
                .thenReturn(200)
                .thenReturn(300)
                .thenReturn(400);

        System.out.println(mockedList.size());
        System.out.println(mockedList.size());
        System.out.println(mockedList.size());
        System.out.println(mockedList.size());
    }

    @Test
    public void test4() {

        List mockedList = Mockito.mock(List.class);

        Mockito.when(mockedList.get(0)).thenReturn("first");

        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(5));

    }

    @Test
    public void test5() {

        List mockedList = Mockito.mock(List.class);

        Mockito.when(mockedList.get(anyInt())).thenReturn("element");

        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(5));

    }

    @Test
    public void test6() {

        List mockedList = Mockito.mock(List.class);

        Mockito.when(mockedList.get(666))
                .thenThrow(new RuntimeException("el diablo"));

        try{
            mockedList.get(666);
            fail("expected exception to be thrown");
        }catch (Exception e) {
            Assertions.assertThat(e.getMessage()).isEqualTo("el diablo");
        }
    }
}
