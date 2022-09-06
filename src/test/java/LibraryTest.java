import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;
    Book book2;
    Book book3;
    Library library;

    @Before
    public void setUp(){
        book = new Book("1984", "George Orwell", "non-fiction");
        book2 = new Book("1984", "George Orwell", "non-fiction");
        book3 = new Book("LOTR", "Tolkien", "fantasy");

        library = new Library(3);
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, library.getCapacity());
    }

    @Test
    public void stockStartsAtZero(){
        assertEquals(0, library.getStock());
    }

    @Test
    public void canAddBooksToStockWithEnoughCapacity(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getStock());
    }

    @Test
    public void StopsAddingBooksToStockWhenCapacityIsFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.getStock());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.addBook(book);
        library.removeBook();
        assertEquals(1, library.getStock());
    }

//    @Test
//    public void getGenreCount(){
//
//        assertEquals();
//    }

}
