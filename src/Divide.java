public class Divide implements IOperand {
    @Override
    public int youOperand(int a, int b) {
        int res = a / b;
        System.out.println(res);
        return res;
    }
}
