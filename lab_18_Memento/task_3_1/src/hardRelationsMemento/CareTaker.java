package hardRelationsMemento;

import java.util.Stack;

public class CareTaker {

    final private Stack<Memento> history = new Stack<>();

    public void undo(){
        if(history.empty()){
            return;
        }
        history.pop().restore();
    }

    public void push(Memento memento){
        history.push(memento);
    }

    public boolean isHistoryEmpty(){
        return history.empty();
    }
}
