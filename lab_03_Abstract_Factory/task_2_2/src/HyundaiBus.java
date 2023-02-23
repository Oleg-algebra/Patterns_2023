public class HyundaiBus extends Bus {
    protected HyundaiBus(int cost, int usageCost, String mark) {
        super(cost, usageCost, mark);
    }

    @Override
    public void goByWay() {
        System.out.println(
                "Hyundai bus runs."
        );
    }

}
