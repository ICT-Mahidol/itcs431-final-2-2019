package th.ac.mahidol.ict.connascence;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    private List<Book> getAllBooks() {
        return books;
    }

    private Book getBookByISBN(int isbn) {
        for (Book b: books) {
            if (b.getISBN() == isbn) {
                return b;
            }
        }
        return null;
    }
}

