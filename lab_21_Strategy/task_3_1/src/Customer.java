public class Customer {
  private final String name;
  private PayStrategy payStrategy = new Cash_PayStrategy();

  public Customer(String name) {
    this.name = name;
  }

  public void setPayStrategy(PayStrategy payStrategy) {
    this.payStrategy = payStrategy;
  }

  public String getName() {
    return name;
  }

  void makePayment(int amount){
    payStrategy.makePayment(this,amount);
  }


}
