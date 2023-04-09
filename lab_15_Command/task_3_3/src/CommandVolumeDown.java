import java.util.ArrayList;

public class CommandVolumeDown implements Command {
    final private  ArrayList<Device> devices = new ArrayList<>();

    public CommandVolumeDown(Device device) {
        devices.add(device);
    }

    @Override
    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void execute() {
        for(Device device : devices){
            device.volumeDown();
        }

    }
}
