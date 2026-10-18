package lab2.Bookstore;

/**
 * This is the test class.
 */
public class BookstoreService {
    public double calculateBookPrice(Book book, BookstoreSubscription subscription) {
        if (book.getTitle().isEmpty() || book.getTitle().length() < 3) {
            throw new InvalidBookTitleException();
        }

        double totalPrice = book.getNoPages() * 0.5;

        if (subscription.equals(BookstoreSubscription.SUBSCRIPTION)) {
            totalPrice /= 2;
        }

        return totalPrice;
    }
}
