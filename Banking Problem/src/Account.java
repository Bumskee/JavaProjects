public class Account {
    // Attributes for the Account class
    private double balance = -1;

    // Constructor for the Account class
    public Account(double balance) {
        this.balance = balance;
    }

    // getter for the balance attribute
    public double getBalance() {
        return balance;
    }

    // method for depositing
    public void deposit(double amount) {
        balance += amount;
    }

    // method for withdrawing.
    public void withdraw(double amount) {
        balance -= amount;
    }
}
