public class Capuccino extends Drink {
    int coffeeBinsPrice = 25;
    int milkPrice = 40;
    int sugarPrice = 50;

    public Capuccino(int volume) {

        super(volume);
        this.ingredientsPrice.add(coffeeBinsPrice);
        this.ingredientsPrice.add(milkPrice);
        this.ingredientsPrice.add(sugarPrice);
        setDrinkPrice();
        this.drinkName = "Capuccino";
    }
}
