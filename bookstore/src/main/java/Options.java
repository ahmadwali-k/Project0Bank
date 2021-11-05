import java.util.ArrayList;

public class Options {
    static void welcome() {
        boolean loop = true;
        do {
            System.out.println(
                "1 Log in\n"+
                "2 Register\n"+
                "3 Exit"
            );
            
            int num1;
            try {
                num1 = DaoFactory.getScanner().nextInt();
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Cannot accept strings");
                continue;
            }            
            switch (num1) {
                case 1: loggingIn(); loop = false;
                    break;
                case 2: register(); loggingIn(); loop = false;
                    break;
                case 3: return; // TODO: change if needed
                    // break;
                default:
                    System.out.println("Invalid number");
                    break;
            }

        } while (loop);

    }
    
    static void loggingIn() {
        System.out.print("Username: ");
        String username = DaoFactory.getScanner().next();
        System.out.print("Password (not hidden): ");
        String password = DaoFactory.getScanner().next();
        UserAccount temp = UserAccountManager.findAccount(username);
        if(temp.getPassword().equals(password)) {
            loggedIn(temp);
        }
    }
    
    static void register() {
        UserAccount userAcc = new UserAccount();
        System.out.print("Create a username: ");
        String username = DaoFactory.getScanner().next();
        System.out.print("Create a password: ");
        String password = DaoFactory.getScanner().next();
        userAcc.setUsername(username);
        userAcc.setPassword(password);
        // TODO: add the account to the database, and list if we're using that
    }
    
    static void loggedIn(UserAccount userAcc) {
        // TODO: put categories here
        System.out.println(
            "Browsing by categories:"
        );
    }
    
    void printReceipt(ArrayList<Book> cart) {
        for(Book book : cart) {
            System.out.println("Receipt:");;
            System.out.print(book.getIsbn()+"\t"+book.getName());
        }
    }
    
}
