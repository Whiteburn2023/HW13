public enum Operation {

    ADD("Сумма: " + (ArithmeticCalculator.a + ArithmeticCalculator.b)),
    SUBSTRACT("Разность: " + (ArithmeticCalculator.a - ArithmeticCalculator.b)),
    MULTIPLY("Произведение: " + (ArithmeticCalculator.a * ArithmeticCalculator.b));

    private String value;

    Operation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
