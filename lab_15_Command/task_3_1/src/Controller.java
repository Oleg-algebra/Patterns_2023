public class Controller {
    private Command commandON ;
    private Command commandOFF ;

    public void setCommandON(Command commandON) {
        this.commandON = commandON;
    }

    public void setCommandOFF(Command commandOFF) {
        this.commandOFF = commandOFF;
    }

    public void on() {
        if(commandON != null){
            commandON.execute();
        }
    }

    public void off() {
        if(commandOFF != null){
            commandOFF.execute();
        }
    }

    public Command getCommandON() {
        return commandON;
    }

    public Command getCommandOFF() {
        return commandOFF;
    }
}
