package BasicsJava;
public class Book {
    String title;
    Book() {
        title = "Unknown Book";
    }
    Book(String t) {
        title = t;
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming");
        System.out.println(b1.title);
        System.out.println(b2.title);
    }
}