public class HotChocolateRecipe implements CoffeeRecipe {
    @Override
    public Coffee makeCoffee(int volume, int ingredientsPrice) {
        return new HotChocolate(volume,ingredientsPrice);
    }
}
