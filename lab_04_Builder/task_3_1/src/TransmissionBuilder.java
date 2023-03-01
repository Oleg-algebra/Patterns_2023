public class TransmissionBuilder {
    private int gearsNumber = 5;
    private Transmission.Type type = Transmission.Type.Manual;

    public TransmissionBuilder setGearsNumber(int gearsNumber) {
        this.gearsNumber = gearsNumber;
        return this;
    }

    public TransmissionBuilder setType(Transmission.Type type) {
        this.type = type;
        return this;
    }

    public Transmission build(){
        return new Transmission(gearsNumber,type);
    }
}
