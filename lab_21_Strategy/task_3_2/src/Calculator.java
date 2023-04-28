public class Calculator {
    private CalculatorStrategy strategy;

    public void setStrategy(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }
    public void calculate(int a, int b){
        if(strategy != null) {
            strategy.calculate(a, b);
        }else{
            throw new IllegalStateException("Calculator Strategy is not set");
        }
    }
}
