import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class SubMenu {

    static void menu() throws SQLException {

        CustomerDao dao1 = CustomerDaoFactory.getCustomerDao();
        UsersDao dao = UsersDaoFactory.getUserDao();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("*****************************");
            System.out.println("Sub-Menu");
            System.out.println("*****************************");
            System.out.println("PRESS 1: TO SHOW ALL USERS");
            System.out.println("PRESS 2: TO REMOVE A USER");
            System.out.println("PRESS 3: TO REGISTER CUSTOMER");
            System.out.println("PRESS 4: TO RETURN TO MAIN MENU");

            Scanner scanner1 = new Scanner(System.in);
            int num = scanner1.nextInt();
            switch (num) {
                case 1:
                    List<User> users = dao.getUsers();
                    for (User user : users) {
                        System.out.println(user);
                    }
                    break;
                case 2:
                    // to remove a user
                    System.out.println("Enter User ID to Delete");
                    int id = scanner.nextInt();
                    dao.deleteUser(id);
                    break;
                case 3:
                    // register for customer
                    Options.registerCustomer();
                    break;
                case 4:
                    loop = false;
                default:
                    System.out.println("");
            }
        }
    }
}
