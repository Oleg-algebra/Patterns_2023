public class SkodaTram extends Tram {
    protected SkodaTram(int cost, int usageCost, String mark) {
        super(cost, usageCost, mark);
    }

    @Override
    public void goByRails() {
        System.out.println("Skoda tram runs.");
    }
}
