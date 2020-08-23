package f_mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class BooksProcessorTest {

    @Test
    public void getTotalPrice_whenNoBooksInDatabase_shouldReturn0() {
        Database mockedDatabase = Mockito.mock(Database.class);

        BooksProcessor booksProcessor = new BooksProcessor(mockedDatabase);

        double totalPrice = booksProcessor.getTotalPrice();

        assertThat(totalPrice).isEqualTo(0);
    }

    @Test
    public void getTotalPrice_whenOneBookInTheDatabase_shouldReturnItsPrice() {
        Database mockedDatabase = Mockito.mock(Database.class);

        Book book = new Book("To",100.0);
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book);
        Mockito.when(mockedDatabase.getBooks())
                .thenReturn(listOfBooks);

        BooksProcessor booksProcessor = new BooksProcessor(mockedDatabase);

        double totalPrice = booksProcessor.getTotalPrice();

        assertThat(totalPrice).isEqualTo(100.0);
    }

    @Test
    public void getTotalPrice_whenTwoBookInTheDatabase_shouldReturnItsPrice() {
        Database mockedDatabase = Mockito.mock(Database.class);

        Book book = new Book("To",100.0);
        Book book2 = new Book("Drużyna pierścienia", 120.0);
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book);
        listOfBooks.add(book2);

        Mockito.when(mockedDatabase.getBooks())
                .thenReturn(listOfBooks);

        BooksProcessor booksProcessor = new BooksProcessor(mockedDatabase);

        double totalPrice = booksProcessor.getTotalPrice();

        assertThat(totalPrice).isEqualTo(220.0);
    }

    @Test
    public void getTotalPrice_whenGettingTotalPrice_shouldCallGetBooksMethod() {
        Database mockedDatabase = Mockito.mock(Database.class);


        BooksProcessor booksProcessor = new BooksProcessor(mockedDatabase);

        booksProcessor.getTotalPrice();

        verify(mockedDatabase).getBooks();
//        verifyNoInteractions(mockedDatabase);
    }

    @Test
    public void getTotalPrice_whenExceptionThrownInFirstAttempt_shouldCallMethodSecondTime() {
        Database mockedDatabase = Mockito.mock(Database.class);

        List<Book> list = new ArrayList<>();

        Mockito.when(mockedDatabase.getBooks())
                .thenThrow(new RuntimeException())
                .thenReturn(list);

        BooksProcessor booksProcessor = new BooksProcessor(mockedDatabase);

        booksProcessor.getTotalPrice();

        verify(mockedDatabase,times(2)).getBooks();
    }

    @Test
    public void getTotalPrice_whenExceptionThrownInFirstAndSecondAttempt_shouldCallMethodThirdTime() {
        Database mockedDatabase = Mockito.mock(Database.class);

        List<Book> list = new ArrayList<>();

        Mockito.when(mockedDatabase.getBooks())
                .thenThrow(new RuntimeException())
                .thenThrow(new RuntimeException())
                .thenReturn(list);

        BooksProcessor booksProcessor = new BooksProcessor(mockedDatabase);

        booksProcessor.getTotalPrice();

        verify(mockedDatabase,times(3)).getBooks();
    }
}
