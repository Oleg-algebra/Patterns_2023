import java.util.ArrayList;

public class TurnLightsOFF implements Command {
    private final ArrayList<Lamp> lamps = new ArrayList<>();


    public TurnLightsOFF(Lamp lamp) {
        lamps.add(lamp);
    }

    @Override
    public void addLamp(Lamp lamp){
        if(!lamps.contains(lamp)){
            lamps.add(lamp);
        }
    }

    @Override
    public void execute() {
        for(Lamp lamp : lamps) {
            lamp.lightOff();
        }
    }
}
