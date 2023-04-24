import java.util.Stack;

public class CareTaker {
    final private Triangle triangle;
    final private Stack<Triangle.Memento> history = new Stack<>();

    private Command command ;


    public void setCommand(Command command) {
        this.command = command;
    }

    public CareTaker(Triangle triangle) {
        this.triangle = triangle;
    }

    public void executeCommand(){
        history.push(triangle.save());
        command.execute();
    }

    public void undo(){
        if(history.empty()){
            return;
        }
        triangle.restore(history.pop());
    }

    public boolean isHistoryEmpty(){
        return history.empty();
    }

}
