import com.customs.*;
public class Main {

    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle(5, "Audi", 0.2f, 100_000);
//        VehicleCalculator calculator = new CarCalculator();
//        calculator.setVehicle(vehicle);
//        System.out.println(calculator.calculatePrice());
        Auto auto1 = new Auto(5, "Audi", true, 100_000);
        report(auto1);

        Auto truck = new Auto(10, "truck", false, 100_000);
        report(truck);

    }
    private static void report(Auto car){
        System.out.println("===========Vehicle tax report===========");
        AdapterCustoms adapterCustoms = new AdapterCustoms();
        float price = adapterCustoms.vehiclePrice(car);
        float tax = adapterCustoms.tax(car);
        System.out.println("Vehicle price: " + price+" UAH");
        System.out.println("tax: "+tax+" UAH");
        System.out.println("Price with tax: " + (price + tax) + " UAH\n" );
    }


}
