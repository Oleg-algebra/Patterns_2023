public class Milk extends Topping {
    public Milk(Beverage wrapped) {
        super(wrapped);
    }
    @Override
    public String description() {
        return super.description() + " Milk ";
    }

    @Override
    public float cost() {
        return super.cost()+1.0f;
    }

}
