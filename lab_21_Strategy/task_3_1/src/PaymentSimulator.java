import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PaymentSimulator {

  public static void main(String[] args) {
    String[] customersNames = {
            "Mike",
            "Anna",
            "Andrew",
            "Angelina",
            "Anastasia",
            "Philip"
    };
    Random random = new Random();
    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    executor.scheduleAtFixedRate(()->{
      Customer customer = new Customer(customersNames[random.nextInt(customersNames.length)]);
      switch (random.nextInt(4)){
        case 0 -> customer.setPayStrategy(new Cash_PayStrategy());
        case 1 -> customer.setPayStrategy(new PayPal_Strategy());
        case 2 -> customer.setPayStrategy(new GooglePay_Strategy());
        case 3 -> customer.setPayStrategy(new BankAccount_Strategy());
      }
      customer.makePayment(random.nextInt(100,1001));
    },0,1, TimeUnit.SECONDS);
  }

}
