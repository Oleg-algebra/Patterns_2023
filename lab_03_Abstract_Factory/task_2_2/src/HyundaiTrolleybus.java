
public class HyundaiTrolleybus extends Trolleybus {
    protected HyundaiTrolleybus(int cost, int usageCost, String mark) {
        super(cost, usageCost, mark);
    }

    @Override
    public void goByContactNetwork() {
        System.out.println("Hyundai trolleybus runs.");
    }
}
