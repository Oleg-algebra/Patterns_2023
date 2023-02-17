import java.util.ArrayList;
import java.util.Random;
public class CoffeeCafe {
    Random random = new Random();
    public double income = 0 ;
    private Coffee makeCoffee(int volume, int ingredientsPrice,CoffeeRecipe recipe){
        return recipe.makeCoffee(volume,ingredientsPrice);
    }
    private ArrayList<CoffeeRecipe> coffeesRecipes = new ArrayList<CoffeeRecipe>();
    private ArrayList<Integer> materialPrices = new ArrayList<Integer>();
    private void fillRecipes(){

        coffeesRecipes.add(new EspressoRecipe());
        coffeesRecipes.add(new LatteRecipe());
        coffeesRecipes.add(new AmericanoRecipe());
        coffeesRecipes.add(new CappuccinoRecipe());
    }
    private void randomPrices(){
        System.out.println("Materials prices: ");
        int n = random.nextInt(2,5);
        for (int i = 0; i<n; i++){
            int price = random.nextInt(50,100);
            materialPrices.add(price);
            System.out.println("Material "+i+" - price: "+price+";");
        }
    }

    public double getIncome() {
        return income;
    }

    public void workSimulation(int hours){
        fillRecipes();
        randomPrices();

        for(int i = 0;i<hours;i++){
            int recipeNumber = random.nextInt(coffeesRecipes.size());
            int volume = random.nextInt(3) + 1;
            int materialNumber =  random.nextInt(materialPrices.size());
            CoffeeRecipe recipe = coffeesRecipes.get(recipeNumber);
            Coffee coffee = makeCoffee(volume, materialPrices.get(materialNumber), recipe);
            income += coffee.getPrice();

            System.out.println("Order #"+ i +": "+coffee.getCoffeeName());
            System.out.println("    volume: "+volume+"; ingredients price: " + coffee.getIngredientsPrice());
            System.out.println("    price: "+ coffee.getPrice());
            System.out.println();
        }

    }
}
