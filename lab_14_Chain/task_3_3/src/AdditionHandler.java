public class AdditionHandler extends MathExprHandler {
    @Override
    public void calculate(MathExpression expression) {
        if(expression.getOperation().equals("+")){
            int sum = expression.getLeftNumber()+expression.getRightNumber();
            System.out.println(expression+" = "+sum);
        }else {
            super.calculate(expression);
        }
    }
}
