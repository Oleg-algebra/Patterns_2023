public class Button {
    private final Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}
