public class Car {
    public Car( String model) {
        this.model = model;
    }
    private String model;
    private Wheel wheel;
    private Engine engine;

    public void setWheel(Wheel wheel) {

        this.wheel = wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void getTechSummary() {
        System.out.println("=========Brief tech summary======");
        System.out.println("Car model: " + model);
        System.out.println("  Engine power: " + engine.getPower());
        System.out.println("  Engine type: " + engine.getType());
        System.out.println("  Wheel radius: " + wheel.getRadius());
        System.out.println("  Wheel type: " + wheel.getType());
    }
}
