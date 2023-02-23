public interface TransportFactory {

    Bus buildBus();
    Tram buildTram();
    Trolleybus buildTrolleybus();
    String getFactoryName();
}
