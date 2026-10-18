package lab2.Bookstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static lab2.Bookstore.BookstoreSubscription.NO_SUBSCRIPTION;
import static lab2.Bookstore.BookstoreSubscription.SUBSCRIPTION;
import static org.junit.jupiter.api.Assertions.*;

class BookstoreServiceTest {
    Book book;
    BookstoreService bookstoreService;

    @BeforeEach
    void setUp() {
        book = new Book("plaheoplder_title", 200);
        bookstoreService = new BookstoreService();
    }

    @Test
    void calculatePriceSubscription() {
        assertEquals(50.0, bookstoreService.calculateBookPrice(book, SUBSCRIPTION));
    }

    @Test
    void calculatePriceNoSubscription() {
        assertEquals(100.0, bookstoreService.calculateBookPrice(book, NO_SUBSCRIPTION));
    }

    @Test
    void emptyTitleThrowsException() {
        book.setTitle("");
        assertThrows(InvalidBookTitleException.class,
                () -> bookstoreService.calculateBookPrice(book, NO_SUBSCRIPTION));
    }

    @Test
    void titleShorterThanThreeCharsThrowsException() {
        book.setTitle("ab");
        assertThrows(InvalidBookTitleException.class,
                () -> bookstoreService.calculateBookPrice(book, SUBSCRIPTION));
    }

    @Test
    void titleWithExactlyThreeCharsIsAccepted() {
        book.setTitle("abc");
        book.setNoPages(101);
        assertEquals(50.5, bookstoreService.calculateBookPrice(book, NO_SUBSCRIPTION));
        assertEquals(25.25, bookstoreService.calculateBookPrice(book, SUBSCRIPTION));
    }
}