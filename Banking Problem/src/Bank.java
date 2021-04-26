import java.util.ArrayList;

public class Bank {
    // Attributes of the Bank class
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private int customerNum = 0;

    // Bank class Constructor
    public Bank(String name) {
        this.name = name;
    }

    // Method for adding a new customer to the bank
    public void addCustomer(Customer c) {
        customers.add(c);
        customerNum += 1;
    }

    // Method for getting the amount of bank customers
    public int getCustomerNum() {
        return customerNum;
    }

    // Method for getting the customer by index
    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    // Method for getting the bank name
    public String getName() {
        return name;
    }
}
