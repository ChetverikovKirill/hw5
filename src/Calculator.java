public class Calculator {

    int a;
    int b;



    private IOperand operand;

    public Calculator(IOperand operand) {
        this.operand = operand;

    }

    public void execute() {
        operand.youOperand(this.a, this.b);

    }

    public void setOperand(IOperand operand) {
        this.operand = operand;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}

