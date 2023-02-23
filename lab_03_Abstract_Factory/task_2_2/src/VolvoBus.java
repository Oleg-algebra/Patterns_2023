public class VolvoBus extends Bus {
    protected VolvoBus(int cost, int usageCost, String mark) {
        super(cost, usageCost, mark);
    }

    @Override
    public void goByWay() {
        System.out.println("Volvo bus runs.");
    }
}
