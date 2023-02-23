public class TeaWithMilk extends Drink {
    int tea_leafs_price = 30;
    int milk_price = 35;
    public TeaWithMilk(int volume) {
        super(volume);
        this.ingredientsPrice.add(milk_price);
        this.ingredientsPrice.add(tea_leafs_price);
        setDrinkPrice();
        this.drinkName = "Tea with Milk";

    }
}
