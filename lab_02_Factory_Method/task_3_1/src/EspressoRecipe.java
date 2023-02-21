public class EspressoRecipe implements CoffeeRecipe {
    @Override
    public Coffee makeCoffee(int volume, int ingredientsPrice) {
        return new Espresso(volume, ingredientsPrice);
    }
}
