public class SkodaBus extends Bus {
    protected SkodaBus(int cost, int usageCost, String mark) {
        super(cost, usageCost, mark);
    }

    @Override
    public void goByWay() {
        System.out.println("Skoda bus runs.");
    }
}
