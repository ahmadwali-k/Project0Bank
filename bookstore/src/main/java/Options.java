import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Options {
    static void welcome() throws SQLException {
        BooksDao dao = BooksDaoFactory.getBookDao();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop){
            System.out.println("\nPRESS 1: TO LOGIN");
            System.out.println("PRESS 2: TO REGISTER");
            System.out.println("PRESS 3: TO ADD A NEW BOOK");
            System.out.println("PRESS 4: TO FIND BY CATEGORY");
            System.out.println("PRESS 5: TO DISPLAY BOOKS");
            System.out.println("PRESS 6: SEARCH BY NAME");
            //SUB CATEGORY (BUY/CANCEL)
            System.out.println("PRESS 7: TO VIEW CART");
            System.out.println("PRESS 8: TO EXIT");

            /*int num1;
            try {
                num1 = DaoFactory.getScanner().nextInt();
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Cannot accept strings");
                continue;
            }*/
            Scanner scanner1 = new Scanner(System.in);
            int num = scanner1.nextInt();
            switch (num) {
                case 1: userLogin(); //loggingIn();
                    break;
                case 2: registration(); //register();
                    break;
                case 3: addbook();
                    break;
                case 4:
                    break;
                case 5:
                    Book book = new Book();
                    dao.displayTable(book);
                    /*List<Book> books = dao.getBooks();
                    for (Book book : books) {
                        System.out.println(book);
                    }*/
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    loop = false; // TODO: change if needed
                    // break;
                default:
                    System.out.println("Invalid number");
                    break;
            }

        }

    }
    static void userLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To loggin as User");
        System.out.println("Hint: Use 'guest' for name and password to login.\n");
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        boolean isLogedIn = false;

        if (!isLogedIn) {
            if (name.equals("guest") && (password.equals("guest"))) {
                // todo more functionality.
                System.out.println("you have successfully logged in \n");

                isLogedIn = true;
            } else
                System.out.println("login failed, try again.");
        } else
            System.out.println("user already logged in.");

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
    static void registration() throws SQLException {
        // To register a new Customer
        BooksDao dao = BooksDaoFactory.getBookDao();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Name name");
        String name = scanner.next();
        System.out.println("Enter User ID");
        int id = scanner.nextInt();
        System.out.println("Create a password. (no spaces)");
        String password = scanner.next();
        Book book = new Book(name, id, password);
        dao.updateUsers(book);
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
    static void addbook() throws SQLException {
        BooksDao dao = BooksDaoFactory.getBookDao();
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
        String descrp = scanner.next();
        Book book = new Book();
        book = new Book(title, isbn, author, price, category, descrp);
        dao.updateBooks(book);
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
            System.out.print(book.getIsbn()+"\t"+book.getTitle());
        }
    }




    
}
