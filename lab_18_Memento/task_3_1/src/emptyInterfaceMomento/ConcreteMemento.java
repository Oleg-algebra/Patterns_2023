package emptyInterfaceMomento;

public class ConcreteMemento implements Memento {
    private final float a;
    private final float b;
    private final float c;

    public ConcreteMemento(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float[] getState(){
        return new float[]{a,b,c};
    }
}
