public class CapuccinoMachine implements DrinkMachine {
    @Override
    public Drink makeDrink(int volume) {
        return new Capuccino(volume);
    }
}
