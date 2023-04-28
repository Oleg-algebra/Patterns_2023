public class BankAccount_Strategy implements PayStrategy {
    @Override
    public void makePayment(Customer customer, int amount) {
        System.out.printf("Customer %s : payment of %s$ made from Bank Account.\n",customer.getName(),amount);
    }
}
