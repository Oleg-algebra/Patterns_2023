public class VolvoFactory implements TransportFactory {
    private final String mark = "Volvo";
    @Override
    public Bus buildBus() {
        return new VolvoBus(6_000_000,20,mark);
    }

    @Override
    public Tram buildTram() {
        return new VolvoTram(10_000_000,7,mark);
    }

    @Override
    public Trolleybus buildTrolleybus() {
        return new VolvoTrolleybus(7_000_000,13,mark);
    }

    @Override
    public String getFactoryName() {
        return mark;
    }
}
