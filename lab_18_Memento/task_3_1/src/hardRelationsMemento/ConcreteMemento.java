package hardRelationsMemento;

public class ConcreteMemento implements Memento {
    private final float a;
    private final float b;
    private final float c;
    private final Triangle triangle;

    public ConcreteMemento(Triangle triangle,float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.triangle = triangle;
    }

    @Override
    public void restore() {
        triangle.setAllSides(a,b,c);
    }
}
