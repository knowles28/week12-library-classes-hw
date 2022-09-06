import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    private HashMap<String, String> genres;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
        this.genres = new HashMap<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getStock() {
        return this.stock.size();
    }

    public void addBook(Book book){
        if (getStock() < getCapacity()) {
            this.stock.add(book);
        }
    }

    public Book removeBook(){
        return this.stock.remove(0);
    }

}
