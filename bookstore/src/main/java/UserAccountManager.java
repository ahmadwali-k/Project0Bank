import java.util.ArrayList;

class UserAccount {
    String username;
    String password;
    ArrayList<Book> cart;
    
    String getUsername() {
        return username;
    }
    String getPassword() {
        return password;
    }
    
    void setUsername(String username) {
        this.username = username;
    }
    void setPassword(String password) {
        this.password = password;
    }
    
    ArrayList<Book> getCart() {
        if(cart==null) {
            cart = new ArrayList<Book>();
        }
        return cart;
    }
    void addToCart(Book b) {
        cart.add(b);
    }
    
    Book getBook(String isbn) {
        // TODO:
        // TODO: if Book null System.err.println("Cannot getBook") and return null
        return new Book();
    }
    
    void removeBook(Book b) {
        if(cart.contains(b)) {
            cart.remove(b);
            System.out.println(
                "\""+ b.getName() +"\" (ISBN: "+ b.getBookId()
                +") is removed from cart"
            );
            return;
        }
        else {
            System.err.println("Cannot removeBook");
        }
    }
}

public class UserAccountManager {
    UserAccount findAccount(String username) {
        // TODO: return the UserAccount;
        return new UserAccount();
    }
}
