public class Book {
    public Book(String name, String author, int pagesNumber, String ISBN) {
        this.name = name;
        this.author = author;
        this.pagesNumber = pagesNumber;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public String getISBN() {
        return ISBN;
    }

    private final String name;
    private final String author;
    private final int pagesNumber;
    private final String ISBN;
}
