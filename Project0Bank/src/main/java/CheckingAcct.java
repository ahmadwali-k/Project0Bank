import java.text.NumberFormat;
import java.util.Scanner;

public class CheckingAcct extends Account {
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    public CheckingAcct() {
        super();
    }
    public CheckingAcct(int acctID)  { super(acctID);}

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("balance has been updated ");
            System.out.println("new balance: " + currencyFormat.format(balance));
        } else {
            System.out.println("Cannot deposit negative amount");
        }
    }

    @Override
    public void withdraw(double amount) {

        if (amount >0) {

            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("balance updated");
                System.out.println("new balance after withdrawl: " + currencyFormat.format(balance));
            }
        }else {
            System.out.println("You do not have sufficient amount");
        }
    }

}
