

class UserAccount {
    String username;
    String password;
    Cart cart;
    
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
    Cart getCart() {
        if(cart==null) {
            cart = new Cart();
        }
        return cart;
    }
}

class Cart {
    
}

public class UserAcountManager {
    UserAccount findAccount(String username) {
        // TODO: return the UserAccount;
        return new UserAccount();
    }
}
