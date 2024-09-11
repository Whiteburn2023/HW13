public class ArithmeticCalculator {
    public static int a;
    public static int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation type){
        System.out.println(type.getValue());
    }


}
