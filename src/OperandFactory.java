public class OperandFactory {
    public IOperand create(String value) {
        if (value.equals("+")) {
            return new Plus();
        } else if (value.equals("-")) {
            return new Minus();
        } else if (value.equals("*")) {
            return new Multiply();
        } else if (value.equals("/")) {
            return new Divide();
        } else {
            System.out.println("ЕРРОР");
        }
        return null;
    }
}
