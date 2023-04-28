import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class  Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String[] operations ={"addition","subtraction","multiplication"};
        Random random = new Random();
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(()->{
            String strategy = operations[random.nextInt(operations.length)];
            switch (strategy){
                case "addition" -> calculator.setStrategy(new Addition());
                case "subtraction" -> calculator.setStrategy(new Subtraction());
                case "multiplication" -> calculator.setStrategy(new Multiplication());
            }
            calculator.calculate(random.nextInt(20),random.nextInt(20));
        },0,2, TimeUnit.SECONDS);
    }

}
