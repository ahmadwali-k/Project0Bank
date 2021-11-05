import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    // TODO: table names
    protected static String bookTableName = "";
    protected static String userAccountTableName = "";
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        BooksDao dao = BooksDaoFactory.getBookDao();
        Book book = new Book();
        dao.createBooks(book);
        dao.createUsers(book);
        Options.welcome();


    }
}
