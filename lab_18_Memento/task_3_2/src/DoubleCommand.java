public class DoubleCommand implements Command {
    public DoubleCommand(Triangle receiver) {
        this.receiver = receiver;
    }

    final private Triangle receiver;
    @Override
    public void execute() {
        receiver.doubleTriangle();
    }
}
