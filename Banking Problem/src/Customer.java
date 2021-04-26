public class Customer {
    // Attributes for the Customer class
    private String FirstName;
    private String LastName;
    private Account account;

    // Constructor for the Customer class
    public Customer(String fName, String lName) {
        FirstName = fName;
        LastName = lName;
    }

    // Getter for the FirstName attribute
    public String getFirstName() {
        return FirstName;
    }

    // Getter for the Lastname attribute
    public String getLastName() {
        return LastName;
    }

    // method for getting the account attribute
    public Account getAccount() {
        return account;
    }

    // Method for setting the customer's account
    public void setAccount(double amount) {
        this.account = new Account(amount);
    }
}
