public class SourCream extends Topping {
    public SourCream(Beverage wrapped) {
        super(wrapped);
    }

    @Override
    public String description() {
        return super.description()+ " SourCream ";
    }

    @Override
    public float cost() {
        return super.cost() + 1.0f;
    }
}
