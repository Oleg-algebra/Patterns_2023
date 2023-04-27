public class MediumFanState implements FanState {
    @Override
    public void turnUp(Fan fan) {
        fan.setState(new HighFanState());
        System.out.println("Fan: medium --> high");
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new LowFanState());
        System.out.println("Fan: medium --> low");
    }
}
