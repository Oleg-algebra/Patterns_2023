public class HyundaiTram extends Tram {
    protected HyundaiTram(int cost, int usageCost, String mark) {
        super(cost, usageCost, mark);
    }

    @Override
    public void goByRails() {
        System.out.println("Hyundai tram runs.");
    }
}
