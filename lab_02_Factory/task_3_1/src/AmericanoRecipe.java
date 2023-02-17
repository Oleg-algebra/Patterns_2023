public class AmericanoRecipe implements CoffeeRecipe {
    @Override
    public Coffee makeCoffee(int volume, int ingredientsPrice) {
        return new Americano(volume, ingredientsPrice);
    }
}
