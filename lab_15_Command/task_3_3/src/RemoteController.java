public class RemoteController {
    private Command commandON;
    private Command commandOff;
    private Command commandVolumeUp;
    private Command commandVolumeDown;
    private Command commandNext;
    private Command commandPrev;

    void deviceOn(){
        if(commandON!=null){
            commandON.execute();
        }
    }
    void deviceOff(){
        if(commandOff != null){
            commandOff.execute();
        }
    }
    void deviceVolumeUp(){
        if(commandVolumeUp != null){
            commandVolumeUp.execute();
        }
    }
    void deviceVolumeDown(){
        if(commandVolumeDown != null){
            commandVolumeDown.execute();
        }
    }
    void deviceNextChanel(){
        if(commandNext != null){
            commandNext.execute();
        }
    }
    void devicePrevChanel(){
        if(commandPrev != null){
            commandPrev.execute();
        }
    }
    public void setCommandON(Command commandON) {
        this.commandON = commandON;
    }

    public void setCommandOff(Command commandOff) {
        this.commandOff = commandOff;
    }

    public void setCommandVolumeUp(Command commandVolumeUp) {
        this.commandVolumeUp = commandVolumeUp;
    }

    public void setCommandVolumeDown(Command commandVolumeDown) {
        this.commandVolumeDown = commandVolumeDown;
    }

    public void setCommandNext(Command commandNext) {
        this.commandNext = commandNext;
    }

    public Command getCommandON() {
        return commandON;
    }

    public Command getCommandOff() {
        return commandOff;
    }

    public Command getCommandVolumeUp() {
        return commandVolumeUp;
    }

    public Command getCommandVolumeDown() {
        return commandVolumeDown;
    }

    public Command getCommandNext() {
        return commandNext;
    }

    public Command getCommandPrev() {
        return commandPrev;
    }

    public void setCommandPrev(Command commandPrev) {
        this.commandPrev = commandPrev;
    }

}
