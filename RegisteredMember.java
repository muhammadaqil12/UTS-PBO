// File: RegisteredMember.java
import java.util.ArrayList;

public class RegisteredMember extends Member {
    private ArrayList<Book> borrowedBooks;
    
    public RegisteredMember(String name, int id) {
        super(name, id);
        borrowedBooks = new ArrayList<>();
    }
    
    @Override
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " has borrowed the book: " + book.getTitle());
    }
    
    // Metode untuk mengecek status keanggotaan
    public boolean isMember() {
        return true;
    }
}
