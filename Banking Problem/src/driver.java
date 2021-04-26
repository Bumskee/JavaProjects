import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the bank manager command line program that's created in 20 minutes");
        System.out.println("Please enter your bank's name.");
        String name = scanner.nextLine();
        Bank bank = new Bank(name);
        int index;
        int amount;
        boolean looping = true;
        int option;
        while(looping) {
            System.out.println("Options: \n" +
                    "1.) Set up Account for new customer \n" +
                    "2.) Get customer information based on index \n" +
                    "3.) Deposit amount to an existing account\n" +
                    "4.) Withdraw amount from an existing account\n" +
                    "5.) Exit Program");
            System.out.println("Please choose an option\n");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Please enter their first name");
                    scanner.nextLine();
                    String fName = scanner.nextLine();
                    Customer c;
                    System.out.println("Please enter their last name");
                    String lName = scanner.nextLine();
                    c = new Customer(fName,lName);
                    System.out.println("Enter their first deposit amount");
                    amount = scanner.nextInt();
                    c.setAccount(amount);
                    bank.addCustomer(c);
                    break;
                case 2:
                    System.out.println("Enter the customer's index");
                    index = scanner.nextInt();
                    if (index <= -1 || index >= bank.getCustomerNum()) {
                        System.out.println("Customer doesn't exist");
                    } else {
                        System.out.println("First name : " + bank.getCustomer(index).getFirstName() + "\nLast name: " + bank.getCustomer(index).getLastName() + "\nBalance: " + bank.getCustomer(index).getAccount().getBalance());
                    }
                    break;
                case 3:
                    System.out.println("Enter the customer's index");
                    index = scanner.nextInt();
                    if (index <= -1 || index >= bank.getCustomerNum()) {
                        System.out.println("Customer doesn't exist");
                    } else {
                        System.out.println("Enter the amount to deposit");
                        amount = scanner.nextInt();
                        bank.getCustomer(index).getAccount().deposit(amount);
                    }
                    break;
                case 4:
                    System.out.println("Enter the customer's index");
                    index = scanner.nextInt();
                    if (index <= -1 || index >= bank.getCustomerNum()) {
                        System.out.println("Customer doesn't exist");
                    } else {
                        System.out.println("Enter the amount to withdraw");
                        amount = scanner.nextInt();
                        if (amount > bank.getCustomer(index).getAccount().getBalance()) {
                            System.out.println("Customers balance is insufficient for the transaction");
                        } else {
                            bank.getCustomer(index).getAccount().withdraw(amount);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using this program, Bank " + bank.getName());
                    looping = false;
                    break;
                default:
                    break;
            }
        }
    }
}
