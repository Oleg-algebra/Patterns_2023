public class Shortcut {
    private Command command;

    public Shortcut(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
