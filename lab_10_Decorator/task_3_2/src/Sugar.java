public class Sugar extends Topping {
    public Sugar(Beverage wrapped) {
        super(wrapped);
    }

    @Override
    public String description() {
        return super.description()+" Sugar ";
    }

    @Override
    public float cost() {
        return super.cost() + 0.5f;
    }
}
