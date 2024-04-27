// File: Member.java
public abstract class Member {
    protected String name;
    protected int id;

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract void borrowBook(Book book);

    public void displayInfo() {
        System.out.println("Member ID: " + id);
        System.out.println("Name: " + name);
    }

    // Metode untuk mengecek status keanggotaan (digunakan oleh anggota yang tidak
    // terdaftar)
    public boolean isMember() {
        return false;
    }
}
