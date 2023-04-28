public class GooglePay_Strategy implements PayStrategy {
    @Override
    public void makePayment(Customer customer, int amount) {
        System.out.printf("Customer %s : payment of %s$ made from Google Pay.\n",customer.getName(),amount);
    }
}
