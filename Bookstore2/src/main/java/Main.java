import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {


        BookDao dao = BookDaoFactory.getBookDao();
        Book book = new Book();
        dao.createBooks(book);
        dao.updateBooks(book);
        System.out.println("hello");


        System.out.println("Menu");
        System.out.println("PRESS 1: TO REGISTER ");
        System.out.println("PRESS 2: TO LOGIN");


    }
}