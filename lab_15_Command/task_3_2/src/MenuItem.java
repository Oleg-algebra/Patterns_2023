public class MenuItem {
    private final Command command;

    public MenuItem(Command command) {
        this.command = command;
    }


    public void select() {
        command.execute();
    }
}
