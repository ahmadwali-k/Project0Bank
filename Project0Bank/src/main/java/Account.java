public abstract class Account {


    protected double balance;
    private int acctID;
    private String name;
    public String acctType; // checking/saving
    public String status;
    private double initialBalance;
    private double deposit;
    private double withdraw;

    public Account () {
    }
    public Account(int acctID) {
        this.acctID = acctID;
        balance = 0;
    }

    public Account (double balance, int acctID, String name, String acctType, double initialBalance) {
        this.balance = balance;
        this.acctID = acctID;
        this.name = name;
        this.acctType = acctType;
        this.initialBalance = initialBalance;

    }

    public double getBalance() {
        return balance;
    }

    public int getAcctID() {
        return acctID;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.acctID = acctID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
