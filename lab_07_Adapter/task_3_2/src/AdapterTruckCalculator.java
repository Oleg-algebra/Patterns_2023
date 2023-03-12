import com.customs.Auto;
import com.customs.Customs;
import com.vehiclecalculator.TruckCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class AdapterTruckCalculator implements Customs {
    final float USD_UAH = 40.0f;
    final float tax_percent = 0.25f;

    private AdapterTruckCalculator() {
    }
    final private static AdapterTruckCalculator instance = new AdapterTruckCalculator();
    public static AdapterTruckCalculator getInstance(){
        return instance;
    }
    @Override
    public float vehiclePrice(Auto auto) {
//        System.out.println("Calculating truck price....");
        Vehicle vehicle = new AdapterAutoToVechicle(auto).adapt();
        VehicleCalculator vehicleCalculator = new TruckCalculator();


        vehicleCalculator.setVehicle(vehicle);
        String price = vehicleCalculator.calculatePrice();
        price = price.substring(0,price.length()-3);
        float floatPrice = Float.parseFloat(price);
        return floatPrice * USD_UAH;
    }

    @Override
    public float tax(Auto auto) {
        float price = vehiclePrice(auto);

        return price * tax_percent;
    }
}
