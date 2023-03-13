public class Milk implements Filler {
    @Override
    public double getPrice() {
        return 0.25;
    }

    @Override
    public String getName() {
        return "milk";
    }
}
