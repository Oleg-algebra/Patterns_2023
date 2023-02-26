public class EngineBuilder {
    private int power = 150;     //  Потужність
    private int torque = 140;    //  Крутний момент
    private Engine.Fuel fuel = Engine.Fuel.Petrol;     //  Вид пального
    private float volume = 1.4f;  //  Об'єм двигуна

    public EngineBuilder setPower(int power){
        this.power = power;
        return this;
    }

    public EngineBuilder setTorque(int torque) {
        this.torque = torque;
        return this;
    }

    public EngineBuilder setFuel(Engine.Fuel fuel) {
        this.fuel = fuel;
        return this;
    }

    public EngineBuilder setVolume(float volume) {
        this.volume = volume;
        return this;
    }

    public Engine build(){
        return new Engine(power,torque,fuel,volume);
    }
}
