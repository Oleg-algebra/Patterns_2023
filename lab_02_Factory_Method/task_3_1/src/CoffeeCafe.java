import java.util.ArrayList;
import java.util.Random;
public class CoffeeCafe {
    Random random = new Random();


    public double income = 0 ;

    private ArrayList<DrinkMachine> drinkMachines = new ArrayList<>();

    private void fillMachines(){
        drinkMachines.add(new AmericanoMachine());
        drinkMachines.add(new CapuccinoMachine());
        drinkMachines.add(new EspressoMachine());
        drinkMachines.add(new LatteMachine());
        drinkMachines.add(new TeaWithMilkMachine());
    }

    public double getIncome() {
        return income;
    }

    public void workSimulation(int hours){
        fillMachines();

        Drink drink;
        for(int i = 0;i<hours;i++){
            int machineNumber = random.nextInt(drinkMachines.size());
            int volume = random.nextInt(3) + 1;

            DrinkMachine drinkMachine = drinkMachines.get(machineNumber);
            drink = drinkMachine.makeDrink(volume);
            income += drink.getDrinkPrice() - drink.getIngredientsPrice();

            System.out.println("Order #"+(i+1)+
                    "\n   drink: " + drink.getDrinkName()+
                    "\n   volume: "+drink.getVolume()+
                    "\n   ingredients price:  "+-drink.getIngredientsPrice()+
                    "\n   drink price: "+drink.getDrinkPrice());

        }


    }
}
