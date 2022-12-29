public class Main {
    public static void main(String[] args) {
        Book book = new Book("Sunshine", "King", 512, "ASDV123");
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getPagesNumber());
        System.out.println(book.getISBN());
    }
}
