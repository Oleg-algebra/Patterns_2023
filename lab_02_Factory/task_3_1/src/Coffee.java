public abstract class Coffee {
    protected int volume;
    protected int ingredientsPrice;
    protected String coffeeName;
    public double getPrice(){
        return volume*ingredientsPrice;

    }

    public int getIngredientsPrice() {
        return ingredientsPrice;
    }

    public String getCoffeeName() {
        return coffeeName;
    }
}
