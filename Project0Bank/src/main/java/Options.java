import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Options {
    static void welcome() throws SQLException {
        CustomerDao dao1 = CustomerDaoFactory.getCustomerDao();
        UsersDao dao = UsersDaoFactory.getUserDao();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("***************************");
            System.out.println("Select from the options below");
            System.out.println("***************************");
            System.out.println("PRESS 1: TO SHOW ALL Customers");
            System.out.println("PRESS 2: To view Customer Withdraw/deposit.");
            System.out.println("PRESS 3: TO REMOVE A CUSTOMER");
            System.out.println("PRESS 4: TO EXIT");

            Scanner scanner1 = new Scanner(System.in);
            int num = scanner1.nextInt();
            switch (num) {
                case 1:
                    List<Customer> Customers = dao1.getCustomers();
                    for (Customer customer : Customers) {
                        System.out.print(customer);
                    }

                    break;
                case 2:
                    Bank bank = new Bank();
                    bank.menu();
                    break;

                case 3:
                    // to remove a book
                    System.out.println("Enter customer id:");
                    int id = scanner.nextInt();
                    dao1.deleteCustomer(id);
                    break;

                case 4: loop = false; // TODO: change if needed
                    // break;
                default:
                    System.out.println("");
                    break;
            }

        }

    }
    static void registerUser() throws SQLException {
        // To register a new User
        UsersDao dao = UsersDaoFactory.getUserDao();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Name:");
        String name = scanner.next();
        System.out.println("Enter User ID");
        int id = scanner.nextInt();
        System.out.println("Create a password. (no spaces)");
        int password = scanner.nextInt();
        User user = new User();
        user = new User(name, id, password);
        dao.updateUsers(user);
    }
    static void registerCustomer() throws SQLException {
        // To register a new Customer
        CustomerDao dao1 = CustomerDaoFactory.getCustomerDao();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        String name = scanner.next();
        System.out.println("Enter Customer ID");
        int id = scanner.nextInt();
        System.out.println("Create a password. (no spaces)");
        int password = scanner.nextInt();
        Customer customer = new Customer(name, id, password);
        dao1.updateCustomers(customer);
    }
    static void registerEmployee() throws SQLException {
        // To register a new Customer
        //CustomerDao dao1 = CustomerDaoFactory.getCustomerDao();
        EmployeeDao dao3 = EmployeeDaoFactory.getEmployeeDao();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        String name = scanner.next();
        System.out.println("Enter email");
        String email = scanner.next();
        System.out.println("Enter Employee ID");
        int id = scanner.nextInt();
        Employee employee = new Employee(name, email, id);
        dao3.updateEmployee(employee);
    }
    static void addCustomer() throws SQLException {
        CustomerDao dao1 = CustomerDaoFactory.getCustomerDao();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Title");
        String title = scanner.next();
        System.out.println("Enter ISBN number");
        int isbn = scanner.nextInt();
        System.out.println("Who is the Author.");
        String author = scanner.next();
        System.out.println("Price");
        double price = scanner.nextDouble();
        System.out.println("Chose category");
        String category = scanner.next();
        System.out.println("Book Description");
        String descrp = scanner.nextLine();
        descrp = "";
        descrp+=scanner.nextLine();
        //scanner.close();
        //Book book = new Book();
        //book = new Book(title, isbn, author, price, category, descrp);
        //dao.updateBooks(book);
    }

    /*void printReceipt(ArrayList<Book> cart) {
        for(Book book : cart) {
            System.out.println("Receipt:");;
            System.out.print(book.getIsbn()+"\t"+book.getTitle());
        }
    }*/
}
