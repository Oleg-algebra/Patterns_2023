public class MultiplicationHandler extends MathExprHandler {
    @Override
    public void calculate(MathExpression expression) {
        if(expression.getOperation().equals("*")){
            int prod = expression.getLeftNumber() * expression.getRightNumber();
            System.out.println(expression+" = "+prod);
        }else {
            super.calculate(expression);
        }
    }
}
