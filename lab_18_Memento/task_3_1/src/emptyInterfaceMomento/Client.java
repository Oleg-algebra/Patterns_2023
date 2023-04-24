package emptyInterfaceMomento;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        CareTaker careTaker = new CareTaker(triangle);

        String[] edges = {
                "b",
                "c",
                "a",
                "c",
                "b",
                "a",
                "c",
                "b",
                "c",
                "a",
        };

        float[] values = {
                4,
                5,
                4,
                2,
                3,
                5,
                78,
                4,
                43,
                1,

        };
        System.out.printf("%s --- Volume = %s\n",triangle,triangle.square());
        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a":
                    careTaker.change_side(values[index],1);
                    break;
                case "b":
                    careTaker.change_side(values[index],2);
                    break;
                case "c":
                    careTaker.change_side(values[index],3);
                    break;
            }

            System.out.printf("%s --- Volume = %s\n",triangle,triangle.square());
        }


        System.out.println("=====Biggest triangle====");
        float biggestSquare = triangle.square();
        Memento biggestMemento = triangle.save();
        while(!careTaker.isHistoryEmpty()){
            careTaker.undo();
            float square = triangle.square();
            if(square > biggestSquare){
                biggestSquare = square;
                biggestMemento = triangle.save();
            }
        }
        triangle.restore(biggestMemento);
        System.out.printf("%s --- Volume = %s",triangle,biggestSquare);
    }

}
