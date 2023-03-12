import com.mobile.Legacy.MicroUsbCharger;
public class AdapterTypeCToMicroUsb implements MicroUsbCharger {

    public AdapterTypeCToMicroUsb(TypeCCharger typeCCharger) {
        this.typeCCharger = typeCCharger;
    }
    final TypeCCharger typeCCharger;

    @Override
    public float getOutputVoltage() {
        return 5.0f;
    }

    @Override
    public float getOutputAmperage() {
        return typeCCharger.getOutputPower()/5.0f;
    }
}
