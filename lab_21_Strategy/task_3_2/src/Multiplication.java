public class Multiplication implements CalculatorStrategy {
    @Override
    public void calculate(int a, int b) {
        int res = a * b;
        System.out.printf("%s * %s = %s%n", a, b, res);
    }
}
