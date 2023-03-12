import com.customs.Auto;
import com.vehiclecalculator.Vehicle;

import java.util.Random;

public class AdapterAutoToVechicle {
    private final Auto auto;
    public AdapterAutoToVechicle(Auto auto) {
        this.auto = auto;
    }

    public Vehicle adapt(){
        float damage = 0;
        if(auto.damaged){
            Random random = new Random();
            damage = random.nextFloat();
//            System.out.println("damage: "+ damage);
        }
        return new Vehicle(auto.age, auto.model, damage,auto.mileage);
    }
}
