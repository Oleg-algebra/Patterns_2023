public class Engine {
    public enum Fuel {
        Petrol,
        Diesel,
        Electric
    }

    final private int power;

    final private Fuel fuel;

    public Engine(int power, Fuel fuel) {
        System.out.println("Creating new Engine");
        this.power = power;
        this.fuel = fuel;
    }


    public String getInfo() {
        return this+"{" +
                "power=" + power +
                ", fuel=" + fuel +
                '}';
    }
}
