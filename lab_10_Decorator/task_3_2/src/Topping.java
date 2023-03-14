public class Topping extends Beverage{
    private final Beverage wrapped;
    public Topping(Beverage wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String description() {
        return wrapped.description();
    }

    @Override
    public float cost() {
        return wrapped.cost();
    }
}
