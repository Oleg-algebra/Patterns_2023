public class Engine implements ClonableEngine {
    @Override
    public Engine clone() {
        return new Engine(this);
    }
    public Engine(Engine other){
        this.power = other.power;
        this.torque = other.torque;
        this.fuel = other.fuel;
        this.volume = other.volume;
    }

    public enum Fuel {  // Тип пального
        Petrol,    // Бензин
        Diesel,    // Дізель
        Electric   // Електрика
    }

    private final int power;     //  Потужність
    private final int torque;    //  Крутний момент
    private final Fuel fuel;     //  Вид пального
    private final float volume;  //  Об'єм двигуна

    public Engine(int power, int torque, Fuel fuel, float volume) {
        this.power = power;
        this.torque = torque;
        this.fuel = fuel;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", torque=" + torque +
                ", fuel=" + fuel +
                ", volume=" + volume +
                '}';
    }
}
