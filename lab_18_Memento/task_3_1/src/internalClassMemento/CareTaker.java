package internalClassMemento;

import java.util.Stack;

public class CareTaker {
    final private Triangle triangle;
    final private Stack<Triangle.Memento> history = new Stack<>();


    public CareTaker(Triangle triangle) {
        this.triangle = triangle;
    }

    public void change_side(float side_length, int side_number){
        history.push(triangle.save());

        if(side_number == 1) {
            triangle.setA(side_length);
        } else if (side_number == 2) {
            triangle.setB(side_length);
        } else if (side_number == 3) {
            triangle.setC(side_length);
        }
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
