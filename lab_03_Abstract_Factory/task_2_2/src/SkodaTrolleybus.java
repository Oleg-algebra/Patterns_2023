public class SkodaTrolleybus extends Trolleybus {
    protected SkodaTrolleybus(int cost, int usageCost, String mark) {
        super(cost, usageCost, mark);
    }

    @Override
    public void goByContactNetwork() {
        System.out.println("Skoda trolleybus runs.");
    }
}
