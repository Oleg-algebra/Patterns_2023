import java.util.HashMap;
import java.util.Map;

public class WheelCashFactory {
    private final Map<String, Wheel> wheelCash = new HashMap<>();

    public Wheel getWheel(int diameter, Wheel.Material material){
        String key = diameter+"-"+material;
        if(!wheelCash.containsKey(key)){
            wheelCash.put(key,new Wheel(diameter, material));
        }
        return wheelCash.get(key);
    }
}
