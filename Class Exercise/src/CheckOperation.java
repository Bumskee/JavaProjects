public class CheckOperation {

    /* Returns the name of the class.
       uses Operation type object as the parameter.
       uses static since there is no need to override the method later and so that it
       could also be used later without instantiating an object to the class first. */
    public static String check(Operation operation) {

        /* Using the instanceof operator to return a boolean whether if
           the object is an instance of something */
        if (operation instanceof AdditionOperation) {
            return "AdditionOperation";
        }
        else {
            return "SubtractionOperation";
        }
    }

    /* Both of the methods are going to return the class name based
        on the inserted parameter */

    public static String check(AdditionOperation operation) {
        return "AdditionOperation";
    }

    public static String check(SubtractionOperation operation) {
        return "SubtractionOperation";
    }
}
