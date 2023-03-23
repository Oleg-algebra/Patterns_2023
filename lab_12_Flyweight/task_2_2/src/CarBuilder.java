
import java.util.HashMap;
import java.util.Map;

public class CarBuilder {

    private final Map<String,Engine> engineCash = new HashMap<>();
    private final Map<String, Wheel> wheelCash = new HashMap<>();

    public CarBuilder setType(Car.Type type) {
        this.type = type;
        return this;
    }

    public CarBuilder setCarColor(Car.CarColor carColor) {
        this.carColor = carColor;
        return this;
    }

    public CarBuilder setEngine( int power,Engine.Fuel fuel) {
        String key = power+"-"+fuel;
        if(!engineCash.containsKey(key)){
            engineCash.put(key,new Engine(power,fuel));
        }
        this.engine = engineCash.get(key);;

        return this;
    }

    public CarBuilder setWheel(int diameter, Wheel.Material material) {
        String key = diameter+"-"+material;
        if(!wheelCash.containsKey(key)){
            wheelCash.put(key,new Wheel(diameter, material));
        }
        this.wheel = wheelCash.get(key);
        return this;
    }

    private Car.Type type;
    private Car.CarColor carColor;
    private Engine engine;
    private Wheel wheel;

    public CarBuilder reset() {
        String key;
        type = Car.Type.Sedan;
        carColor = Car.CarColor.White;
        if(engineCash.isEmpty()){
            key = 105 + "-" + Engine.Fuel.Petrol;
            engineCash.put(key,new Engine(105, Engine.Fuel.Petrol));
        }
        engine = engineCash.get(105 + "-" + Engine.Fuel.Petrol);
        if(wheelCash.isEmpty()){
            key = 17 + "-" + Wheel.Material.Steel;
            wheelCash.put(key,new Wheel(17, Wheel.Material.Steel));
        }
        wheel =wheelCash.get(17 + "-" + Wheel.Material.Steel) ;
        return this;
    }

    public CarBuilder() {
        reset();
    }

    public Car build() {
        if (type == null || carColor == null || engine == null || wheel == null) {
            throw new IllegalArgumentException();
        }

        return new Car(type, carColor, engine, wheel);
    }

}
