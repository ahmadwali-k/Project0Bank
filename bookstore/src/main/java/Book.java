public class Book {
    private int isbn;
    private String name;
    private String title;
    private String author;
    private double price;
    public String category;
    public String description;

    public Book() {

    }

    public Book(int bookId, String name) {
        this.isbn = bookId;
        this.name = name;
    }
    public Book(String name, int bookId, String title, String author, double price, String category, String description) {
        this.name = name;
        this.isbn = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public void setIsbn(int bookId) {
        this.isbn = bookId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
