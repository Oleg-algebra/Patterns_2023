import com.customs.Auto;
import com.customs.Customs;
import com.vehiclecalculator.*;

import java.util.ArrayList;

public class AdapterCarCalculator implements Customs {
    private AdapterCarCalculator() {
    }
    private final static AdapterCarCalculator instance = new AdapterCarCalculator();
    public static  AdapterCarCalculator getInstance(){
        return instance;
    }
    final float USD_UAH = 40.0f;
    final float tax_percent = 0.2f;
    
    private final VehicleCalculator vehicleCalculator = new CarCalculator() ;
    private float carPrice  = 0;
    private final ArrayList<Auto> taxed_autos = new ArrayList<>();
    private final ArrayList<Vehicle> taxed_vehicles = new ArrayList<>();
    @Override
    public float vehiclePrice(Auto auto) {
//        System.out.println("Calculating car price....");
        Vehicle vehicle;
        if(!taxed_autos.contains(auto)){
            vehicle = new AdapterAutoToVechicle(auto).adapt();
            taxed_autos.add(auto);
            taxed_vehicles.add(vehicle);
        }else{
            vehicle = taxed_vehicles.get(taxed_autos.indexOf(auto));
        }

        vehicleCalculator.setVehicle(vehicle);
        String price = vehicleCalculator.calculatePrice();
        price = price.substring(0,price.length()-3);
        carPrice = Float.parseFloat(price);
        return carPrice * USD_UAH;
    }

    @Override
    public float tax(Auto auto) {

        carPrice = vehiclePrice(auto);

        return carPrice * tax_percent;
    }
}
