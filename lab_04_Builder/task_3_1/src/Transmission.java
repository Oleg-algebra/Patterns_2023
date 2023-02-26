public class Transmission {
    enum Type{
        Manual,
        Automatic,
        CVT
    }
    final int gearsNumber;
    final Type type;

    public Transmission(int gearsNumber, Type type) {
        this.gearsNumber = gearsNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "gearsNumber=" + gearsNumber +
                ", type=" + type +
                '}';
    }
}
