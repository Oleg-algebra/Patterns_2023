public class LatteRecipe implements CoffeeRecipe {
    @Override
    public Coffee makeCoffee(int volume, int ingredientsPrice) {
        return new Latte(volume, ingredientsPrice);
    }
}
