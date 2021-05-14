// Importing the scanner package to be used as an input reader
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        // instantiate the objects
        AdditionOperation addition = new AdditionOperation();
        SubtractionOperation subtraction = new SubtractionOperation();

        // creates a new scanner object and inputting the Operation class x and y static attributes
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the first number:");
        Operation.x = scanner.nextInt();
        System.out.println("Enter the value of the second number:");
        Operation.y = scanner.nextInt();

        // gets the operation result of the calculate method from both of the class
        System.out.printf("\nThe result of the calculate method of the addition class is %d\n", OperationRuntime.doOperation(addition));
        System.out.printf("The result of the calculate method of the subtraction class is %d\n\n", OperationRuntime.doOperation(subtraction));

        // gets the class name of the object addition and subtraction in that order.
        System.out.printf("Checking the name of the addition object using the check method of the CheckOperation class: %s\n", CheckOperation.check(addition));
        System.out.printf("Checking the name of the subtraction object using the check method of the CheckOperation class: %s\n", CheckOperation.check(subtraction));

        System.out.println();
    }
}