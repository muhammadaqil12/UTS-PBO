// File: LibrarySystem.java
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Mengecek keanggotaan berdasarkan nama
        Member member = checkMembership(name);
        
        if (member != null) {
            System.out.println("Welcome back, " + name + "!");
            // Meminjam buku jika dia anggota terdaftar
            Book book = new Book("Java Programming");
            member.borrowBook(book);
        } else {
            System.out.println("Sorry, you are not a registered member.");
        }
        
        scanner.close();
    }
    
    // Metode untuk memeriksa keanggotaan berdasarkan nama
    private static Member checkMembership(String name) {
        // Pada implementasi sebenarnya, dapat dilakukan pengecekan ke basis data atau penyimpanan lainnya
        // Di sini, kita hanya membuat beberapa anggota terdaftar sebagai contoh
        if (name.equalsIgnoreCase("Mirza")) {
            return new RegisteredMember("Mirza", 1001);
        } else if (name.equalsIgnoreCase("Alice")) {
            return new RegisteredMember("Alice", 1002);
        } else {
            return null;
        }
    }
}
