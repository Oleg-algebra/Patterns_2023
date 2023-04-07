public class DivisionHandler extends MathExprHandler {
    @Override
    public void calculate(MathExpression expression) {
        if(expression.getOperation().equals(":")){
            if(expression.getRightNumber()!=0) {
                double fraction = (double) expression.getLeftNumber() / expression.getRightNumber();
                System.out.println(expression + " = " + fraction);
            }else{
                System.out.println("Division by zero: "+ expression);
            }
        }else {
            super.calculate(expression);
        }
    }
}
