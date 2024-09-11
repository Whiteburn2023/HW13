public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(4, 8);
        arithmeticCalculator.calculate(Operation.ADD);
        arithmeticCalculator.calculate(Operation.MULTIPLY);
        arithmeticCalculator.calculate(Operation.SUBSTRACT);

    }
}