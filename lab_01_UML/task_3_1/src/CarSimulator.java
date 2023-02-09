import java.util.Arrays;

public class CarSimulator {
    private CarBuilder worker;
    private Car car;
    public void hire_worker(String name) {

       this.worker = new CarBuilder(name);

    }

    public void build_new_car(String mark, int enginePower, int wheelRadius,
                           String engineType, String wheelType){
        this.car = this.worker.buildCar(mark, enginePower, wheelRadius,  engineType, wheelType);

    }

    public void simulation(String workerName, String mark, int enginePower, int wheelRadius,
                           String engineType, String wheelType ){
        hire_worker(workerName);
        System.out.println("Worker " + worker.getName() + " is hired. Begin working. Start car constructing.");
        build_new_car(mark, enginePower, wheelRadius, engineType, wheelType);
        System.out.println("New car is ready!!!");
        car.getTechSummary();
        System.out.println("You ready to travel. Good luck.");

    }
    public static void main(String[] args) {
        CarSimulator simulator = new CarSimulator();
        simulator.simulation("James", "Porshe",
                300, 40, "fuel", "summer");

    }
}
