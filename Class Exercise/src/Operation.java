public class Operation {
    /*
        both of the integer variables uses the static keyword so that
        we can assign it later without instantiating a new Operation Object
    */
    public static int x;
    public static int y;

    // Does not use the static keyword because it is going to be overriden later.
    public int calculate() {
        return 0;
    }
}
