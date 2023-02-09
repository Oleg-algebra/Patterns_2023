public class CarBuilder {
    public String name;
    public CarBuilder(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Car buildCar(String model, int enginePower, int wheelRadius,
                        String engineType, String wheelType){

        Engine engine = new Engine(enginePower,engineType);
        Wheel wheels = new Wheel(wheelRadius,wheelType);

        Car car = new Car(model);
        car.setEngine(engine);
        car.setWheel(wheels);

        return car;
    }
}
