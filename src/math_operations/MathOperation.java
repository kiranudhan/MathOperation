package math_operations;
@FunctionalInterface
interface IMathFunction{
    int calculate(int a, int b);
}

public class MathOperation {
    public static void main(String[] args) {

        IMathFunction add = (a, b) -> a + b;
        IMathFunction sub = (a, b) -> a - b;
        IMathFunction multiply = (a, b) -> a * b;
        IMathFunction divide = (a, b) -> a / b;

        System.out.println("Addition is " + add.calculate(10,20));
        System.out.println("Subtraction is " + sub.calculate(20,10));
        System.out.println("Multiplication is " + multiply.calculate(10,20));
        System.out.println("Division is " + divide.calculate(20,10));

    }
}
