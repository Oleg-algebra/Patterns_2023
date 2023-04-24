package hardRelationsMemento;

public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        CareTaker careTaker = new CareTaker();

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
                    careTaker.push(triangle.save());
                    triangle.setA(values[index]);
                    break;
                case "b":
                    careTaker.push(triangle.save());
                    triangle.setB(values[index]);
                    break;
                case "c":
                    careTaker.push(triangle.save());
                    triangle.setC(values[index]);
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
        biggestMemento.restore();
        System.out.printf("%s --- Volume = %s",triangle,biggestSquare);
    }

}
