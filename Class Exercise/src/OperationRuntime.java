// use this class to return a returned value from
public class OperationRuntime {

    /* returns the calculation of the calculate method of the operation class.
       uses the Operation type object as the parameter.
       Uses static so there are no need to instantiate it to call the doOperation
       method and there is no need to override the method later. */
    public static int doOperation(Operation operation) {
        // returns the operation result
        return operation.calculate();
    }

     /* Both of the methods are going to return the calculate method based
        on the inserted parameter */

    public static int doOperation(AdditionOperation operation) {
        // returns the operation result
        return operation.calculate();
    }

    public static int doOperation(SubtractionOperation operation) {
        // returns the operation result
        return operation.calculate();
    }
}
