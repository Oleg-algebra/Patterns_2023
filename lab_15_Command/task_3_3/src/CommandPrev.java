import java.util.ArrayList;

public class CommandPrev implements Command {
    final private  ArrayList<Device> devices = new ArrayList<>();

    public CommandPrev(Device device) {
        devices.add(device);
    }

    @Override
    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void execute() {
        for(Device device : devices){
            device.prevChanel();
        }

    }
}
