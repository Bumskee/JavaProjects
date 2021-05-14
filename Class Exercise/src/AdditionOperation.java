public class AdditionOperation extends Operation{
    // Overrides the calculate method from the superclass
    @Override
    public int calculate() {
        return Operation.x + Operation.y;
    }
}
