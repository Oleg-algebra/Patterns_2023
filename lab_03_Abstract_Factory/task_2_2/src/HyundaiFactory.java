public class HyundaiFactory implements TransportFactory {
    private final String mark = "Hyundai";
    @Override
    public Bus buildBus() {
        return new HyundaiBus(5_500_000,20,mark);
    }

    @Override
    public Tram buildTram() {

        return new HyundaiTram(9_500_000,8,mark);
    }

    @Override
    public Trolleybus buildTrolleybus() {

        return new HyundaiTrolleybus(7_000_000,11,mark);
    }

    @Override
    public String getFactoryName() {
        return mark;
    }
}
