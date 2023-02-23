public class LatteMachine implements DrinkMachine {
    @Override
    public Drink makeDrink(int volume) {
        return new Latte(volume);
    }
}
