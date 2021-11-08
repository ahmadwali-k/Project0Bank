import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class EmployeeSubMenu {

    static void EmpMenu() throws SQLException {
    /*CustomerDao dao1 = CustomerDaoFactory.getCustomerDao();
    UsersDao dao = UsersDaoFactory.getUserDao();*/
    EmployeeDao dao3 = EmployeeDaoFactory.getEmployeeDao();
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
        while (loop) {
        System.out.println("*****************************");
        System.out.println("Sub-Menu");
        System.out.println("*****************************");
        System.out.println("PRESS 1: TO SHOW ALL EMPLOYEES");
        System.out.println("PRESS 2: TO ADD AN EMPLOYEE");
        System.out.println("PRESS 3: TO APPROVE/DENY ACCOUNTS");
        System.out.println("PRESS 4: TO RETURN TO MAIN MENU");

        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextInt();
        switch (num) {
            case 1:
                List<Employee> employees = dao3.getEmployees();
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
                break;
            case 2:
                //Employee employee = new Employee();
                //dao3.addEmployee(employee);
                Options.registerEmployee();
               // dao3.updateEmployee(employee);
                break;
            case 3:
                // approve or deny
                System.out.println("No pending Accounts.");
                break;
            case 4:
                loop = false;
            default:
                System.out.println("");
        }
    }
}
}
