public class MathExprHandler implements Handler {
    private Handler next = null;
    @Override
    final public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void calculate(MathExpression expression) {
        if(next!=null){
            next.calculate(expression);
        }else{
            System.out.println("Unknown math operation: " + expression);
        }

    }
}
