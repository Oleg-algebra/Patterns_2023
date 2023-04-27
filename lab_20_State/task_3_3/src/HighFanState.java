public class HighFanState implements FanState {
    @Override
    public void turnUp(Fan fan) {
        System.out.println("Fan is on high. Do nothing.");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new MediumFanState());
        System.out.println("Fan: high --> medium");
    }
}
