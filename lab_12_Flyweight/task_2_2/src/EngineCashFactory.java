import java.util.HashMap;
import java.util.Map;

public class EngineCashFactory {
    private final Map<String,Engine> engineCash = new HashMap<>();

    public Engine getEngine(int power,Engine.Fuel fuel){
        String key = power+"-"+fuel;
        if(!engineCash.containsKey(key)){
            engineCash.put(key,new Engine(power,fuel));
        }
        return engineCash.get(key);
    }
}
