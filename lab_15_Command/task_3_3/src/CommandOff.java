import java.util.ArrayList;

public class CommandOff implements Command {
    final private  ArrayList<Device> devices = new ArrayList<>();

    public CommandOff(Device device) {
        devices.add(device);
    }



    @Override
    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void execute() {
        for(Device device : devices){
            device.off();
        }

    }
}
