public class CacaoRecipe implements CoffeeRecipe {
    @Override
    public Coffee makeCoffee(int volume, int ingredientsPrice) {
        return new Cacao(volume,ingredientsPrice);
    }
}
