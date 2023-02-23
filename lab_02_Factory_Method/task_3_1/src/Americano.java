public class Americano extends Drink {
    int coffeBinsPrice = 50;
    int sugarPrice = 30;
    public Americano(int volume) {
        super(volume);
        this.ingredientsPrice.add(coffeBinsPrice);
        this.ingredientsPrice.add(sugarPrice);
        setDrinkPrice();
        this.drinkName = "Americano";
    }
}
