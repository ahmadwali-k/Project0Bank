public class Books {
    private int bookId;
    private String name;




    public Books () {

    }
    public Books(int bookId, String name) {
        this.bookId = bookId;
        this.name = name;
    }

    public int getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
