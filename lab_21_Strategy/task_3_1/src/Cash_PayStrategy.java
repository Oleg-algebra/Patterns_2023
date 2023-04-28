public class Cash_PayStrategy implements PayStrategy {
    @Override
    public void makePayment(Customer customer, int amount) {
        System.out.printf("Customer %s : payment of %s$ made by cash.\n",customer.getName(),amount);
    }
}
