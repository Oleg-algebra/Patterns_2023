public class TeaWithMilkMachine implements DrinkMachine {
    @Override
    public Drink makeDrink(int volume) {
        return new TeaWithMilk(volume);
    }
}
