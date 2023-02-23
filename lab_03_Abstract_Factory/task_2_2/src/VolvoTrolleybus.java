public class VolvoTrolleybus extends Trolleybus {
    protected VolvoTrolleybus(int cost, int usageCost, String mark) {
        super(cost, usageCost, mark);
    }

    @Override
    public void goByContactNetwork() {
        System.out.println("Volvo trolleybus runs.");
    }
}
