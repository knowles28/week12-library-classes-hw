import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<Book>();
    }

    public int getCollectionTotal(){
        return this.collection.size();
    }

    public void addBookToCollectionFromLibrary(Library library){
        this.collection.add(library.removeBook());
    }

}
