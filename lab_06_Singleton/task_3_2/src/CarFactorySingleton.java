import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CarFactorySingleton {       // implementation of Singleton pattern
    private final static  Lock lock = new ReentrantLock();
    private CarFactorySingleton(){}
    private static CarFactorySingleton instance = null;
    public static CarFactorySingleton getInstance(){
        if(instance == null){
            lock.lock();
            if (instance == null){
                instance = new CarFactorySingleton();
            }
            lock.unlock();
        }
        return instance;
    }
    public void show(){
        System.out.println("CarFactory "+ this);
    }
    public Car buildToyotaSedan(Car.CarColor carColor){
        WheelBuilder wheelBuilder = new WheelBuilder();
        EngineBuilder engineBuilder = new EngineBuilder();
        TransmissionBuilder transmissionBuilder = new TransmissionBuilder();
        CarBuilder carBuilder = new CarBuilder();


        Wheel wheel = wheelBuilder.setMaterial(Wheel.Material.Steel)
                .setDiameter(15)
                .setTire(Wheel.Tires.summer)
                .build();

        Engine engine = engineBuilder.setFuel(Engine.Fuel.Petrol)
                .setPower(150)
                .setTorque(140)
                .setVolume(1.5f)
                .build();
        Transmission transmission = transmissionBuilder.setGearsNumber(6)
                .setType(Transmission.Type.Automatic)
                .build();

        return carBuilder.setType(Car.Type.Sedan)
                .setCarColor(carColor)
                .setMark("Toyota")
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .build();
    }

    public Car buildPorsheSUV(Car.CarColor carColor){
        WheelBuilder wheelBuilder = new WheelBuilder();
        EngineBuilder engineBuilder = new EngineBuilder();
        CarBuilder carBuilder = new CarBuilder();
        TransmissionBuilder transmissionBuilder = new TransmissionBuilder();

        Wheel wheel = wheelBuilder.setMaterial(Wheel.Material.Forged)
                .setDiameter(20)
                .setTire(Wheel.Tires.all_seasons)
                .build();

        Engine engine = engineBuilder.setFuel(Engine.Fuel.Electric)
                .setPower(100)
                .setTorque(120)
                .setVolume(1.2f)
                .build();
        Transmission transmission = transmissionBuilder.setType(Transmission.Type.CVT)
                .build();

        return carBuilder.setType(Car.Type.SUV)
                .setCarColor(carColor)
                .setMark("Porshe")
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .build();
    }
    public Car buildLamorghiniSport(Car.CarColor carColor){
        WheelBuilder wheelBuilder = new WheelBuilder();
        EngineBuilder engineBuilder = new EngineBuilder();
        CarBuilder carBuilder = new CarBuilder();
        TransmissionBuilder transmissionBuilder = new TransmissionBuilder();

        Wheel wheel = wheelBuilder.setMaterial(Wheel.Material.Steel)
                .setDiameter(30)
                .setTire(Wheel.Tires.highway)
                .build();

        Engine engine = engineBuilder.setFuel(Engine.Fuel.Petrol)
                .setPower(500)
                .setTorque(800)
                .setVolume(5.0f)
                .build();
        Transmission transmission = transmissionBuilder.setType(Transmission.Type.Automatic)
                .setGearsNumber(7)
                .build();

        return carBuilder.setType(Car.Type.Sport_car)
                .setCarColor(carColor)
                .setMark("Lamborghini")
                .setEngine(engine)
                .setTransmission(transmission)
                .setWheel(wheel)
                .build();
    }
}
