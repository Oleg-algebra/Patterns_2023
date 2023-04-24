public class HalfTriangleCommand implements Command {
    private final Triangle receiver;

    public HalfTriangleCommand(Triangle receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        if(receiver != null){
            receiver.halfTriangle();
        }
    }
}
