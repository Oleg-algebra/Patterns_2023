import java.util.Random;

public class Client {
    public static void main(String[] args) {

        Handler additionHandler = new AdditionHandler();
        Handler substractionHandler = new SubstractionHandler();
        Handler multiplicationHandler = new MultiplicationHandler();
        Handler divisionHandler = new DivisionHandler();

        additionHandler.setNext(substractionHandler);
        substractionHandler.setNext(multiplicationHandler);
        multiplicationHandler.setNext(divisionHandler);

        Random random = new Random();
        String[] mathOperations = {"+","-",":","*"};
        for(int i = 0 ; i<20;i++){
            int leftNumber = random.nextInt(20);
            int rightNumber = random.nextInt(5);
            String operation = mathOperations[random.nextInt(mathOperations.length)];
            MathExpression mathExpression = new MathExpression(leftNumber,rightNumber,operation);
            additionHandler.calculate(mathExpression);
        }


    }
}
