import java.util.ArrayList;

public class TurnLightsOn implements Command {
    private final ArrayList<Lamp> lamps = new ArrayList<>();

    public TurnLightsOn(Lamp lamp) {
        lamps.add(lamp);
    }

    public TurnLightsOn() {
    }

    @Override
    public void addLamp(Lamp lamp) {
        if (!lamps.contains(lamp)) {
            lamps.add(lamp);
        }
    }

    @Override
    public void execute() {
        for (Lamp lamp : lamps) {
            lamp.lightOn();
        }

    }
}
