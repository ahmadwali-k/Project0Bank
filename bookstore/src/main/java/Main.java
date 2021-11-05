import java.sql.SQLException;

public class Main {







    // TODO: table names
    protected static String bookTableName = "";
    protected static String userAccountTableName = "";

    public static void main(String[] args) throws SQLException {

        BooksDao dao = BooksDaoFactory.getBookDao();
        Book book = new Book();
        dao.createBooks(book);
        dao.updateBooks(book);
        System.out.println("hello");
        Options.welcome();


    }
}
