public class SkodaFactory implements TransportFactory {
    private final String mark = "Skoda";
    @Override
    public Bus buildBus() {
        return new SkodaBus(4_500_000,25,mark);
    }

    @Override
    public Tram buildTram() {
        return new SkodaTram(9_000_000,8,mark);
    }

    @Override
    public Trolleybus buildTrolleybus() {
        return  new SkodaTrolleybus(6_800_000,12,mark);
    }

    @Override
    public String getFactoryName() {
        return mark;
    }
}
