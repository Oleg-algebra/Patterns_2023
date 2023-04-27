public class LowFanState implements FanState {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new MediumFanState());
        System.out.println("Fan: low --> medium");
    }

    @Override
    public void turnDown(Fan fan) {
        System.out.println("Fan is on low. Do nothing.");
    }
}
