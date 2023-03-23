import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CarSimulator {

  static ArrayList<Car> vehicles = new ArrayList<>();
  final static private CarBuilder carBuilder = new CarBuilder();

  public static void main(String[] args) {

    ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    executor.scheduleAtFixedRate(CarSimulator::createRandomCar, 0, 1, TimeUnit.SECONDS);

  }

  private static void createRandomCar() {
    Random random = new Random();

    Engine.Fuel fuel = Engine.Fuel.values()[random.nextInt(3)];
    int power = random.nextInt(11, 15) * 10;

    int wheel_diameter = random.nextInt(17, 20);
    Wheel.Material material = Wheel.Material.values()[random.nextInt(2)];

    Car.CarColor color = Car.CarColor.values()[random.nextInt(4)];
    Car.Type type = Car.Type.values()[random.nextInt(3)];

    Car car = carBuilder
            .reset()
            .setType(type)
            .setCarColor(color)
            .setEngine(power, fuel)
            .setWheel(wheel_diameter,material)
            .build();
    System.out.println("Creating " + car);
    car.showInfo();

    vehicles.add(car);
  }

}
