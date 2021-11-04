import java.sql.SQLException;
import java.util.List;

public interface BooksDao {


    void createBooks(Books books) throws SQLException;
    void updateBooks(Books books) throws SQLException;


    /*void deleteEmployee(int id) throws SQLException;
    List<Employee> getEmployees() throws SQLException;
    Employee getEmployeeById(int id) throws SQLException;*/
}
