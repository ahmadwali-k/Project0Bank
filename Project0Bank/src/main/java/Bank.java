import java.util.Scanner;

public class Bank {

    Account accounts [] = new Account[20];
    int numAccounts = 0;
    public static int accountType() {
        System.out.println("choose account type");
        System.out.println("1: Checking Account: ");
        System.out.println("2: Savings Account");
        //Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Enter one of the following: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 2);
        return choice;
    }
        /*boolean flag1 = true;
        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextInt();
        while (flag1) {


            switch (num) {
                case 1:
                    //createAccount();
                    //checking
                    break;
                case 2:
                    //saving
                    break;
                case 3:
                    flag1 = false;
                    break;
            }
        }*/



    public static int lookForAccount(Account accounts[], int count, int acctID ) {
        for (int i=0; i<count; i++) {
            if (accounts[i].getAcctID() == acctID) {
                return i;
            }
        }
        return -1;
    }
    public static void deposit(Account accounts [], int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is account number");
        int acctID = scanner.nextInt();

        int index = lookForAccount(accounts, count, acctID);
        if (index >= 0) {
            System.out.println("How much do you want to Deposit ");
            double amount = scanner.nextDouble();
            accounts[index].deposit(amount);
        } else
            System.out.println("could not find account");
    }
    public static void withdrawal(Account accounts [], int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is account number");
        int acctID = scanner.nextInt();

        int index = lookForAccount(accounts, count, acctID);
        if (index >= 0) {
            System.out.println("How much do you want to withdraw ");
            double amount = scanner.nextDouble();
            accounts[index].withdraw(amount);
        } else
            System.out.println("could not find account");
    }

    public static Account createAccount() {
        //boolean flag = true;
            //Scanner scanner = new Scanner(System.in);
            //int input = scanner.nextInt();
            Account account = null;

//            System.out.println("choose account type");
//            System.out.println("1: Checking Account: ");
//            System.out.println("2: Savings Account");
            Scanner scanner = new Scanner(System.in);
             int choice = accountType();
            if (choice == 1) {
                int acctID;
                System.out.println("What is Account number");
                acctID = scanner.nextInt();
                account = new CheckingAcct(acctID);
                //return account;
                //flag = false;
            } else {
                int acctID;
                System.out.println("What is Account number");
                acctID = scanner.nextInt();
                account = new SavingAcct(acctID);
                //return account;
                //flag = false;
            }
            // return account;
        return account;
        }


    public void menu() {
        System.out.println("Menu for Bank");
        System.out.println("Press 1: To Create A New Account:");
        System.out.println("Press 2: To Deposit");
        System.out.println("Press 3: To Withdraw");
        System.out.println("Press 4: To Exit");

        boolean flag = true;
        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextInt();
        //while (flag) {


            switch (num) {
                case 1:
                    accounts[numAccounts++] = createAccount();
                    //flag = false;
                    break;
                case 2:
                    deposit(accounts, numAccounts);
                    break;
                case 3:
                    withdrawal(accounts, numAccounts);
                    break;
                case 4:
                    //flag = false;
                    break;
            }
        }

    }
//}