public interface PayStrategy {
    void makePayment(Customer customer, int amount);
}
