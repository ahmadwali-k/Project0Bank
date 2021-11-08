import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerDaoImpl implements CustomerDao {
    Connection connection;

    public CustomerDaoImpl() {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public void createCustomers(Customer customer) throws SQLException {
        String sql = "create table if not exists Customer (Name varchar(30), id integer, password varchar(50));";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.addBatch();
        preparedStatement.executeBatch();
    }
    @Override
    public void updateCustomers(Customer customer) throws SQLException {
        String sql = "insert into Customer (Name, id, password) values (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setInt(2, customer.getId());
        preparedStatement.setInt(3, customer.getPassword());
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Customer Updated");
        }
        else {
            System.out.println("Update Failed");
        }
    }
    @Override
    public List<Customer> getCustomers() throws SQLException {
        List<Customer> customers = new ArrayList<>();
        String sql = "select * from Customer";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String name = resultSet.getString(1);
            int id = resultSet.getInt(2);
            int password = resultSet.getInt(3);
            Customer customer = new Customer(name, id, password);
            customers.add(customer);

        }
        return customers;
    }
    @Override
    public void deleteCustomer(int id) throws SQLException {
        String sql = "delete from customer where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Customer deleted");
        } else {
            System.out.println("could not perform deletion");
        }
    }

    @Override
    public void loginCustomer() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer name");
        String chossenname = scanner.next();
        Customer customer = new Customer();
        customer.setName(chossenname);
        System.out.println("Enter Password");
        int chosenPassword = scanner.nextInt();
        customer.setPassword(chosenPassword);
        String sql = "select name, password from customer where name = ? AND password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setInt(2, customer.getPassword());
        ResultSet resultSet = preparedStatement.executeQuery();
        //System.out.println(name);
        //System.out.println(password);
        while (resultSet.next()) {
            if (customer.getName().equals(chossenname) && (customer.getPassword() == chosenPassword)) {

                System.out.println("login successful");
                Options.welcome();
            } else
                System.out.println("could not validate user.");
        }
    }
}
