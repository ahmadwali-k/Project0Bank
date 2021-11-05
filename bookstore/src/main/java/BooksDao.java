import java.sql.SQLException;
import java.util.List;

public interface BooksDao {


    void createBooks(Book book) throws SQLException;
    void updateBooks(Book book) throws SQLException;
    void createUsers(Book book) throws SQLException;
    void updateUsers(Book book) throws SQLException;
    void displayTable(Book book) throws SQLException;
    List<Book> getBooks() throws SQLException;

    /*void deleteEmployee(int id) throws SQLException;
    List<Employee> getEmployees() throws SQLException;
    Employee getEmployeeById(int id) throws SQLException;*/
}
