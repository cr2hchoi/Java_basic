package Day07.Iterator;

import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public void appendBook(Book book){
        books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    @Override
    public Iterator<Book> iterator(){
        return new BookShelfIterator(this);

    }
}
