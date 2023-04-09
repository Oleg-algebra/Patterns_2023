public class Shortcut {
    private final Command command;

    public Shortcut(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
