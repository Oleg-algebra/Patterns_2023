public class BaseDecorator implements Printable{
    private final Printable wrapped;
    public BaseDecorator(Printable printableString) {
        wrapped = printableString;
    }

    @Override
    public void print() {
        wrapped.print();
    }
}
