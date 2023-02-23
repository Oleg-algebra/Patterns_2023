public class VolvoTram extends Tram {
    protected VolvoTram(int cost, int usageCost, String mark) {
        super(cost, usageCost, mark);
    }

    @Override
    public void goByRails() {
        System.out.println("Volvo tram runs.");
    }
}
