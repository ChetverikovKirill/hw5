import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperandFactory factory = new OperandFactory();
        System.out.println("Калькулятор");
        System.out.println("Ведите операцию +,-,* или /");
        Calculator calculator = new Calculator(factory.create(scanner.next()));
        System.out.println("Введите первое число");
        calculator.setA(scanner.nextInt());
        System.out.println("Введите второе число");
        calculator.setB(scanner.nextInt());
        calculator.execute();
        IOperand multiply = new Multiply();
        calculator.setOperand(multiply);
        calculator.execute();

    }
}



