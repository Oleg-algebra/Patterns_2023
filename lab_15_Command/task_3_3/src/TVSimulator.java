import java.util.ArrayList;

public class TVSimulator {
    public static void main(String[] args) {

        ControllerFactory factory = new ControllerFactory();
        Device tv = new Television();
        Device radio = new Radio();
        ArrayList<Device> devices = new ArrayList<>();
        devices.add(tv);
        devices.add(radio);

        RemoteController tvController = factory.getSimpleController(tv);
        RemoteController radioController = factory.getSimpleController(radio);
        RemoteController universalController = factory.getUniversalController(devices);


        tvController.deviceOn();
        radioController.deviceOn();

        for (int i = 0; i < 15; i++) {

            tvController.deviceNextChanel();
            if(i%2 == 0){
                radioController.deviceNextChanel();
            }
        }
        tvController.deviceVolumeUp();
        radioController.deviceVolumeUp();

        tvController.deviceVolumeUp();
        radioController.deviceVolumeUp();
        tvController.deviceVolumeUp();
        radioController.deviceVolumeUp();

        tvController.devicePrevChanel();
        radioController.devicePrevChanel();

        tvController.deviceVolumeDown();
        radioController.deviceVolumeDown();

        universalController.deviceOff();

    }
}
