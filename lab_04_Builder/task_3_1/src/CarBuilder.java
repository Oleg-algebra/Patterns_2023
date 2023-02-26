public class CarBuilder {
    private Car.Type type = Car.Type.Sport_car;          //  Тип кузову
    private Car.CarColor carColor = Car.CarColor.Black;  //  Колір
    private Engine engine;      //  Двигун
    private Wheel wheel;        //  Колеса
    private String mark = "Default";
    private Transmission transmission;
    public CarBuilder setType(Car.Type type) {
        this.type = type;
        return this;
    }

    public CarBuilder setCarColor(Car.CarColor carColor) {
        this.carColor = carColor;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    public CarBuilder setMark(String mark) {
        this.mark = mark;
        return this;
    }

    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Car build(){
        return new Car(mark,type,carColor,engine,wheel,transmission);
    }

}
