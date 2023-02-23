public class Latte extends Drink {
    int coffeeBinsPrice = 15;
    int milkPrice = 30;

    public Latte(int volume) {
        super(volume);
        this.ingredientsPrice.add(coffeeBinsPrice);
        this.ingredientsPrice.add(milkPrice);
        setDrinkPrice();
        this.drinkName = "Latte";

    }
}
