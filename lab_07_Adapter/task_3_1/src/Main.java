import com.mobile.Legacy.Charger;
import com.mobile.Legacy.MobilePhone;

public class Main {

    public static void main(String[] args) {
        TypeCCharger typeCCharger = new FastCharge(5.0f);
        AdapterTypeCToMicroUsb adapterTypeCToMicroUsb = new AdapterTypeCToMicroUsb(typeCCharger);

        System.out.println("\n============= MicroUsb ==============\n");
        MobilePhone phone = new MobilePhone();
        phone.charge(20);
        phone.pluginCharger(adapterTypeCToMicroUsb);
        phone.charge(40);
        phone.unplugCharger();
        System.out.printf("Current power status = %s%n", phone.getChargingPercent());

    }

    private static void printBatteryStatus(SamsungS phone){
        System.out.printf("Current battery status = %s%n", phone.getChargingPercent());
    }

}
