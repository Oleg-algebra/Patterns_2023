import com.customs.*;
import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class Main {
    final static AdapterTruckCalculator adapterTruckCalculator = AdapterTruckCalculator.getInstance();
    final static AdapterCarCalculator adapterCarCalculator = AdapterCarCalculator.getInstance();
    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle(5, "Audi", 0, 100_000);
//        VehicleCalculator calculator = new CarCalculator();
//        calculator.setVehicle(vehicle);
//        System.out.println(calculator.calculatePrice());

        Auto auto1 = new Auto(5, "Audi", true, 100_000);
        report(auto1);

        Auto truck = new Auto(10, "truck", false, 100_000);
        report(truck);

        Auto auto2 = new Auto(5,"Audi", false , 100_000);
        report(auto2);


    }
    private static void report(Auto auto){
        System.out.println("===========Tax report===========");
        float price;
        float tax;
        String model = auto.model.toLowerCase();
        if(model.equals("truck")){

            price = adapterTruckCalculator.vehiclePrice(auto);
            tax = adapterTruckCalculator.tax(auto);
        }else{

            price = adapterCarCalculator.vehiclePrice(auto);
            tax = adapterCarCalculator.tax(auto);
        }
        System.out.println("Auto model: "+auto.model);
        System.out.println("Auto price: " + price+" UAH");
        System.out.println("tax: "+tax+" UAH");
        System.out.println("Price with tax: " + (price + tax) + " UAH\n" );
    }



}
