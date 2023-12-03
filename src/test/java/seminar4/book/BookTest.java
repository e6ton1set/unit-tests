package seminar4.book;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class BookTest {

    private InMemoryBookRepository inMemoryBookRepository;

/*    @Test
    @DisplayName("Проверка метода поиска по ID")
    public void testGetBookById(){
        Book book = new Book("1", "Book1", "Author1");

        when(inMemoryBookRepository.findById("1")).thenReturn(book);

        Book result = bookService.findBookById("1");

        assertEquals(book, result);

        verify(inMemoryBookRepository, times(1)).findById("1");

    }*/

    @Test
    @DisplayName("Проверка метода поиска по ID")
    void testGetBookById(){
        InMemoryBookRepository inMemoryBookRepository = spy(InMemoryBookRepository.class);

        BookService bookService = new BookService(inMemoryBookRepository);

        String bookId = "2";
        Book expectedBook = new Book(bookId);

        when(inMemoryBookRepository.findById(bookId)).thenReturn(expectedBook);

        Book book = bookService.findBookById(bookId);
        assertEquals(expectedBook, book);

        verify(inMemoryBookRepository, times(1)).findById(bookId);
    }

    @Test
    @DisplayName("Метод findAll вызван хотя бы раз")
    void testGetAllBooks(){
        InMemoryBookRepository inMemoryBookRepository = mock(InMemoryBookRepository.class);

        inMemoryBookRepository.findAll();

        verify(inMemoryBookRepository, times(1)).findAll();
    }

}

