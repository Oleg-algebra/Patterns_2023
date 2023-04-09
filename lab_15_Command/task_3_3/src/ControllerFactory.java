import java.util.ArrayList;

public class ControllerFactory {
    public RemoteController getSimpleController(Device device){
        Command commandON = new CommandOn(device);
        Command commandOff = new CommandOff(device);
        Command commandVolumeUp = new CommandVolumeUp(device);
        Command commandVolumeDown = new CommandVolumeDown(device);
        Command commandNext = new CommandNext(device);
        Command commandPrev = new CommandPrev(device);

        RemoteController controller = new RemoteController();
        controller.setCommandNext(commandNext);
        controller.setCommandOff(commandOff);
        controller.setCommandPrev(commandPrev);
        controller.setCommandVolumeUp(commandVolumeUp);
        controller.setCommandVolumeDown(commandVolumeDown);
        controller.setCommandON(commandON);
        return controller;

    }

    public RemoteController getUniversalController(ArrayList<Device> devices){
        RemoteController controller = getSimpleController(devices.get(0));
        for(int i = 1; i<devices.size(); i++){
            Device device = devices.get(i);
            controller.getCommandNext().addDevice(device);
            controller.getCommandOff().addDevice(device);
            controller.getCommandON().addDevice(device);
            controller.getCommandVolumeDown().addDevice(device);
            controller.getCommandVolumeUp().addDevice(device);
            controller.getCommandPrev().addDevice(device);
        }
        return controller;
    }
}
