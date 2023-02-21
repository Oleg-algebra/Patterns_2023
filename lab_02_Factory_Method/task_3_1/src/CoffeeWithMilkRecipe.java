public class CoffeeWithMilkRecipe implements CoffeeRecipe {
    @Override
    public Coffee makeCoffee(int volume, int ingredientsPrice) {
        return new CoffeeWirhMilk(volume,ingredientsPrice);
    }
}
