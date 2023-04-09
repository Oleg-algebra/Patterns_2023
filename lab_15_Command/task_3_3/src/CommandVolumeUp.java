import java.util.ArrayList;

public class CommandVolumeUp implements Command {
    final private  ArrayList<Device> devices = new ArrayList<>();

    public CommandVolumeUp(Device device) {
        devices.add(device);
    }

    @Override
    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void execute() {
        for(Device device : devices){
            device.volumeUp();
        }

    }
}
