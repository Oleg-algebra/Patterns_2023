public class Espresso extends Drink {
    int coffeeBinsPrice = 20;

    public Espresso(int volume) {
        super(volume);
        this.ingredientsPrice.add(coffeeBinsPrice);
        setDrinkPrice();
        this.drinkName = "Espresso";
    }
}
