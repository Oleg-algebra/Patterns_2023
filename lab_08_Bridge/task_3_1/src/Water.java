public class Water implements Filler {

    @Override
    public double getPrice() {
        return 0.05;
    }

    @Override
    public String getName() {
        return "water";
    }
}
