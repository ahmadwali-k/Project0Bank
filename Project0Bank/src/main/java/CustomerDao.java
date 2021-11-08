import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
    void createCustomers(Customer customer) throws SQLException;
    void updateCustomers(Customer customer) throws SQLException;
    List<Customer> getCustomers() throws SQLException;
    void deleteCustomer(int id) throws SQLException;
    void loginCustomer() throws SQLException;
    //void approveCustomer() throws SQLException;
}
