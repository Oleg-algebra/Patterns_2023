public class CappuccinoRecipe implements CoffeeRecipe {
    @Override
    public Coffee makeCoffee(int volume, int ingredientsPrice) {
        return new Cappuccino(volume,ingredientsPrice);
    }
}
