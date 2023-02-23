import java.util.ArrayList;

public abstract class Drink {
    protected double drinkPrice = 0;
    protected int volume;
    protected ArrayList<Integer> ingredientsPrice = new ArrayList<>();
    protected String drinkName;

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public double getDrinkPrice(){
        return drinkPrice;
    }

    public void setDrinkPrice() {
        this.drinkPrice = getIngredientsPrice()*1.5;
    }

    public int getIngredientsPrice() {
        int sum = 0;
        for( Integer ingredient_price : ingredientsPrice){
            sum+=ingredient_price;
        }
        return sum*volume;
    }

    public String getDrinkName() {
        return drinkName;
    }
}
