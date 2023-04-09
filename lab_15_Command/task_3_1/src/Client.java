public class Client {
    public static void main(String[] args) {
        Lamp[] lamps = {
        new Lamp("Kitchen"),
        new Lamp("Hall"),
        new Lamp("Bedroom"),
        new Lamp("Bathroom")
        };
        ControllersFactory factory = new ControllersFactory();

        Controller controllerKitchenLamp = factory.getSimpleController(lamps[0]);
        Controller controllerHallLamp = factory.getSimpleController(lamps[1]);
        Controller controllerBedroomLamp = factory.getSimpleController(lamps[2]);
        Controller controllerBathroomLamp = factory.getSimpleController(lamps[3]);
        Controller controllerUniversal = factory.getUniversalController(lamps);

        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerBathroomLamp.on();
        controllerKitchenLamp.on();
        controllerHallLamp.on();

        controllerUniversal.off();

    }
}
