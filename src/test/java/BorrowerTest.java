import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Book book;
    Book book2;
    Book book3;


    Borrower borrower;

    @Before
    public void setUp(){
        book = new Book("1984", "George Orwell", "non-fiction");
        library = new Library(3);
        borrower = new Borrower();
    }

    @Test
    public void hasEmptyCollection(){
        assertEquals(0, borrower.getCollectionTotal());
    }

    @Test
    public void canAddBookFromLibraryToCollectionAndRemoveFromLibrary(){
        library.addBook(book);
        borrower.addBookToCollectionFromLibrary(library);
        assertEquals(1, borrower.getCollectionTotal());
        assertEquals(0, library.getStock());
    }


}
