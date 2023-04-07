public class SubstractionHandler extends MathExprHandler {
    @Override
    public void calculate(MathExpression expression) {
        if(expression.getOperation().equals("-")){
            int diff = expression.getLeftNumber() - expression.getRightNumber();
            System.out.println(expression+" = "+diff);
        }else {
            super.calculate(expression);
        }
    }
}
