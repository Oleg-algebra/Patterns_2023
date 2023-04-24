public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        CareTaker careTaker = new CareTaker(triangle);

        Command[] commands = {
            new ChangeSideCommand(2,4,triangle),
            new HalfTriangleCommand(triangle),
            new ChangeSideCommand(3,5,triangle),
            new ChangeSideCommand(1,4,triangle),
            new DoubleCommand(triangle),
            new ChangeSideCommand(3,2,triangle),
            new ChangeSideCommand(1,6,triangle),
            new ChangeSideCommand(3,5,triangle),
            new DoubleCommand(triangle),
            new DoubleCommand(triangle),
            new ChangeSideCommand(2,2,triangle),
            new ChangeSideCommand(3,3,triangle),
            new HalfTriangleCommand(triangle),
            new ChangeSideCommand(2,8,triangle),
            new ChangeSideCommand(1,15,triangle),
            new HalfTriangleCommand(triangle),
            new HalfTriangleCommand(triangle),
        };


        System.out.printf("%s --- Volume = %s\n",triangle,triangle.square());
        for (Command command : commands) {
            careTaker.setCommand(command);
            careTaker.executeCommand();
            System.out.printf("%s --- Volume = %s\n",triangle,triangle.square());
        }


        System.out.println("=====Smallest triangle====");
        float smallestSquare = triangle.square();
        Triangle.Memento smallestMemento = triangle.save();
        while(!careTaker.isHistoryEmpty()){
            careTaker.undo();
            float square = triangle.square();
            if(square < smallestSquare){
                smallestSquare = square;
                smallestMemento = triangle.save();
            }
        }
        triangle.restore(smallestMemento);
        System.out.printf("%s --- Volume = %s",triangle,smallestSquare);



    }

}
