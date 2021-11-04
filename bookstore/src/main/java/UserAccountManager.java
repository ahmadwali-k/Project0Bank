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
}

public class UserAccountManager {
    UserAccount findAccount(String username) {
        // TODO: return the UserAccount;
        return new UserAccount();
    }
}
