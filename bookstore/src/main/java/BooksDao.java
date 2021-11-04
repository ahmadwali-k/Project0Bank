import java.sql.SQLException;
import java.util.List;

public interface BooksDao {


    void createBooks(Book books) throws SQLException;
    void updateBooks(Book books) throws SQLException;


    /*void deleteEmployee(int id) throws SQLException;
    List<Employee> getEmployees() throws SQLException;
    Employee getEmployeeById(int id) throws SQLException;*/
}
