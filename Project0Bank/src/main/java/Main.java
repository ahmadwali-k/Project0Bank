import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {
        //Main main = new Main();
        //main.userResponse();
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        CustomerDao dao1 = CustomerDaoFactory.getCustomerDao();
        Employee employee = new Employee();
        EmployeeDao dao3 = EmployeeDaoFactory.getEmployeeDao();
        dao3.createEmployee(employee);
        dao1.createCustomers(customer);
        User user = new User();
        UsersDao dao = UsersDaoFactory.getUserDao();
        dao.createUsers(user);

        boolean flag = true;
        while (flag) {
            System.out.println("*******************************");
            System.out.println("Welcome To The Bank");
            System.out.println("*******************************");
            // in sub-menu
            System.out.println("PRESS 1: User Login ");
            System.out.println("PRESS 2: Customer Login ");
            System.out.println("PRESS 3: Register User ");
            System.out.println("PRESS 4: Register Customer");
            //System.out.println("Employee");
            System.out.println("PRESS 5: FOR EMPLOYEE");
            System.out.println("PRESS 6: To Exit");

            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    dao.loginUser(); //loggingIn();
                    //Options.userLogin();
                    break;
                case 2:
                    // customer login
                    // in options
                    dao1.loginCustomer();
                    break;
                case 3:
                    Options.registerUser(); //register();
                    break;
                case 4:
                    Options.registerCustomer();
                    break;
                case 5:
                    EmployeeSubMenu.EmpMenu();
                    break;
                case 6:
                    flag = false;
                    //return;
            }
        }

    }
}