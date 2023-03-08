public class Car {
    public enum CarColor {   // Колір автомобіля
        White,  //  Білий
        Black,  //  Чорний
        Red,    //  Червоний
        Grey,    //  Сірий
        Pink,
        Orange
    }

    public enum Type {  //  Тип кузову автомобіля
        Sedan,      //  Седан
        Hatchback,  //  Хетчбек
        SUV,        //  Кросовер
        Muscle_car,
        Sport_car,
    }

    final private Type type;          //  Тип кузову
    final private CarColor carColor;  //  Колір
    final private Engine engine;      //  Двигун
    final private Wheel wheel;        //  Колеса
    final private String mark;

    final private Transmission transmission;
    public Car(String mark,Type type, CarColor carColor,
               Engine engine, Wheel wheel,Transmission transmission) {
        this.type = type;
        this.carColor = carColor;
        this.engine = engine;
        this.wheel = wheel;
        this.mark = mark;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "mark="+mark+
                "\ntype=" + type +
                ",\ncarColor=" + carColor +
                ",\nengine=" + engine +
                ",\ntransmission= "+transmission+
                ",\nwheel=" + wheel +
                '\n';
    }
}
