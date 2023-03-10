import com.customs.Auto;
import com.customs.Customs;
import com.vehiclecalculator.*;

public class AdapterCustoms implements Customs {
    final float USD_UAH = 40.0f;
    final float tax_percent = 0.2f;
    @Override
    public float vehiclePrice(Auto auto) {
        int age = auto.age;
        String model = auto.model;
        float damage ;
        int mileage = auto.mileage;
        if(auto.damaged){
            damage = 1.0f;
        }else {
            damage = 0;
        }
        Vehicle vehicle;
        VehicleCalculator vehicleCalculator;
        if(model.equals("truck")){
            vehicle = new Truck(age,mileage);
            vehicleCalculator = new TruckCalculator();
        }else{
            vehicle = new Car(age,model,damage);
            vehicleCalculator = new CarCalculator();
        }

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
