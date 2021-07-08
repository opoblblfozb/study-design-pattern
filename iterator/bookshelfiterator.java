package iterator;

public interface Aggregate {
    public abstract Iterator iterator();
}

public interface Iterator{
    public abstract boolean hasNext();
    public abstract Object next();
}

public class Book {
    private String name;
    public Book(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
    }
    public Book getBook(int index){
        return books[index];
    }
    public void appendBook(Book book){
        this.books[last] = book;
        last ++;
    }
    public int getLength(){
        return last;
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookshelf){
        this.bookShelf = bookshelf;
        this.index = 0;
    }

    public boolean hasNext(){
        if (index < bookShelf.getLength()){
            return true;
        } else {
            return false;
        }
    }

    public Object next(){
        Book book = bookShelf.getBook(index);
        index ++;
        return book;
    }
}

public class Main{
    public static void main(String[] args){
        BookShelf bookshelf = new BookShelf(4);
        bookshelf.appendBook(new Book("Around the World in 80 Days"));
        bookshelf.appendBook(new Book("Bible"));
        bookshelf.appendBook(new Book("Cinderella"));
        bookshelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookshelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}