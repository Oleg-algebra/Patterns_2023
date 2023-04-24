public class ChangeSideCommand implements Command {
    private final int side_number;
    private final float side_length;
    private final Triangle receiver;

    public ChangeSideCommand(int side_number, float side_length, Triangle receiver) {
        this.side_number = side_number;
        this.side_length = side_length;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        if (side_number == 1) {
            receiver.setA(side_length);
        } else if (side_number == 2) {
            receiver.setB(side_length);
        } else if (side_number == 3) {
            receiver.setC(side_length);
        }
    }
}
