public class Cream extends Topping {
    public Cream(Beverage wrapped) {
        super(wrapped);
    }

    @Override
    public String description() {
        return super.description() + " Cream ";
    }

    @Override
    public float cost() {
        return super.cost() + 1.5f;
    }
}
